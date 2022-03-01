// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ExtendImageStyleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExtendImageStyleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ExtendImageStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleResponseBody self = new ExtendImageStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExtendImageStyleResponseBody setData(ExtendImageStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtendImageStyleResponseBodyData getData() {
        return this.data;
    }

    public ExtendImageStyleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExtendImageStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExtendImageStyleResponseBodyData extends TeaModel {
        @NameInMap("MajorUrl")
        public String majorUrl;

        @NameInMap("Url")
        public String url;

        public static ExtendImageStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtendImageStyleResponseBodyData self = new ExtendImageStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtendImageStyleResponseBodyData setMajorUrl(String majorUrl) {
            this.majorUrl = majorUrl;
            return this;
        }
        public String getMajorUrl() {
            return this.majorUrl;
        }

        public ExtendImageStyleResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
