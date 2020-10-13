// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ExtendImageStyleResponseData data;

    public static ExtendImageStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleResponse self = new ExtendImageStyleResponse();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtendImageStyleResponse setData(ExtendImageStyleResponseData data) {
        this.data = data;
        return this;
    }
    public ExtendImageStyleResponseData getData() {
        return this.data;
    }

    public static class ExtendImageStyleResponseData extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("MajorUrl")
        @Validation(required = true)
        public String majorUrl;

        public static ExtendImageStyleResponseData build(java.util.Map<String, ?> map) throws Exception {
            ExtendImageStyleResponseData self = new ExtendImageStyleResponseData();
            return TeaModel.build(map, self);
        }

        public ExtendImageStyleResponseData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ExtendImageStyleResponseData setMajorUrl(String majorUrl) {
            this.majorUrl = majorUrl;
            return this;
        }
        public String getMajorUrl() {
            return this.majorUrl;
        }

    }

}
