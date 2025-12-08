// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanSketchStyleResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateHumanSketchStyleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>E499788C-22DA-4F0E-B9C0-0E9D30A25716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateHumanSketchStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanSketchStyleResponseBody self = new GenerateHumanSketchStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateHumanSketchStyleResponseBody setData(GenerateHumanSketchStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateHumanSketchStyleResponseBodyData getData() {
        return this.data;
    }

    public GenerateHumanSketchStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateHumanSketchStyleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/person-image-pencil/fd49dd0a-9e24-4bb5-b303-0745cdb453e0_7aa6_20210128-073045.jpg?Expires=1611820849&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=1oLYG%2FPe%2BNRIK7XcsUQYaKF%2B1C">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/person-image-pencil/fd49dd0a-9e24-4bb5-b303-0745cdb453e0_7aa6_20210128-073045.jpg?Expires=1611820849&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=1oLYG%2FPe%2BNRIK7XcsUQYaKF%2B1C</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static GenerateHumanSketchStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateHumanSketchStyleResponseBodyData self = new GenerateHumanSketchStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateHumanSketchStyleResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
