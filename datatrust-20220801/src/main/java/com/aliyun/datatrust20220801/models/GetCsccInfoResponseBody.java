// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetCsccInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCsccInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCsccInfoResponseBody self = new GetCsccInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCsccInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetCsccInfoResponseBody setData(GetCsccInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCsccInfoResponseBodyData getData() {
        return this.data;
    }

    public GetCsccInfoResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCsccInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCsccInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCsccInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCsccInfoResponseBodyData extends TeaModel {
        @NameInMap("CsccOpen")
        public Boolean csccOpen;

        @NameInMap("FlOpen")
        public Boolean flOpen;

        @NameInMap("MaxVersion")
        public String maxVersion;

        @NameInMap("MpcOpen")
        public Boolean mpcOpen;

        @NameInMap("SandBoxOpen")
        public Boolean sandBoxOpen;

        @NameInMap("TeeOpen")
        public Boolean teeOpen;

        public static GetCsccInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCsccInfoResponseBodyData self = new GetCsccInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCsccInfoResponseBodyData setCsccOpen(Boolean csccOpen) {
            this.csccOpen = csccOpen;
            return this;
        }
        public Boolean getCsccOpen() {
            return this.csccOpen;
        }

        public GetCsccInfoResponseBodyData setFlOpen(Boolean flOpen) {
            this.flOpen = flOpen;
            return this;
        }
        public Boolean getFlOpen() {
            return this.flOpen;
        }

        public GetCsccInfoResponseBodyData setMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }
        public String getMaxVersion() {
            return this.maxVersion;
        }

        public GetCsccInfoResponseBodyData setMpcOpen(Boolean mpcOpen) {
            this.mpcOpen = mpcOpen;
            return this;
        }
        public Boolean getMpcOpen() {
            return this.mpcOpen;
        }

        public GetCsccInfoResponseBodyData setSandBoxOpen(Boolean sandBoxOpen) {
            this.sandBoxOpen = sandBoxOpen;
            return this;
        }
        public Boolean getSandBoxOpen() {
            return this.sandBoxOpen;
        }

        public GetCsccInfoResponseBodyData setTeeOpen(Boolean teeOpen) {
            this.teeOpen = teeOpen;
            return this;
        }
        public Boolean getTeeOpen() {
            return this.teeOpen;
        }

    }

}
