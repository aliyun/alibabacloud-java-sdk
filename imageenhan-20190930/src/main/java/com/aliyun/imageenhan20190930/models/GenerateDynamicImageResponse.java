// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GenerateDynamicImageResponseData data;

    public static GenerateDynamicImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageResponse self = new GenerateDynamicImageResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDynamicImageResponse setData(GenerateDynamicImageResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateDynamicImageResponseData getData() {
        return this.data;
    }

    public static class GenerateDynamicImageResponseData extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GenerateDynamicImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDynamicImageResponseData self = new GenerateDynamicImageResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateDynamicImageResponseData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
