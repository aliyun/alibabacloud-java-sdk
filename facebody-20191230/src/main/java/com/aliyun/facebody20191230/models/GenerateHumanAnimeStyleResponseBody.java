// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateHumanAnimeStyleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>59697D68-2A6E-4553-89BD-0FADD07881E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateHumanAnimeStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleResponseBody self = new GenerateHumanAnimeStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleResponseBody setData(GenerateHumanAnimeStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateHumanAnimeStyleResponseBodyData getData() {
        return this.data;
    }

    public GenerateHumanAnimeStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateHumanAnimeStyleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/person-image-cartoonizer/59697D68-2A6E-4553-89BD-0FADD07881E8_7ee5_20201027-070958.jpg?Expires=1603784400&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=ut2kn46Lz%2FRwqJ9jWJ0RBDut12">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/person-image-cartoonizer/59697D68-2A6E-4553-89BD-0FADD07881E8_7ee5_20201027-070958.jpg?Expires=1603784400&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=ut2kn46Lz%2FRwqJ9jWJ0RBDut12</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static GenerateHumanAnimeStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateHumanAnimeStyleResponseBodyData self = new GenerateHumanAnimeStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateHumanAnimeStyleResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
