// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GenerateHumanAnimeStyleResponseData data;

    public static GenerateHumanAnimeStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleResponse self = new GenerateHumanAnimeStyleResponse();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateHumanAnimeStyleResponse setData(GenerateHumanAnimeStyleResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateHumanAnimeStyleResponseData getData() {
        return this.data;
    }

    public static class GenerateHumanAnimeStyleResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static GenerateHumanAnimeStyleResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateHumanAnimeStyleResponseData self = new GenerateHumanAnimeStyleResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateHumanAnimeStyleResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
