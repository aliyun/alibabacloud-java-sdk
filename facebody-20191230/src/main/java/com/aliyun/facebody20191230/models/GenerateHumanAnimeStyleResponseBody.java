// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateHumanAnimeStyleResponseBodyData data;

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
