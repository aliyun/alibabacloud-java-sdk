// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceAccessCfServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public XspaceAccessCfServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static XspaceAccessCfServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XspaceAccessCfServiceResponseBody self = new XspaceAccessCfServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public XspaceAccessCfServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public XspaceAccessCfServiceResponseBody setData(XspaceAccessCfServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public XspaceAccessCfServiceResponseBodyData getData() {
        return this.data;
    }

    public XspaceAccessCfServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public XspaceAccessCfServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public XspaceAccessCfServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class XspaceAccessCfServiceResponseBodyData extends TeaModel {
        @NameInMap("ApplyOrderUrl")
        public String applyOrderUrl;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("StatusCode")
        public String statusCode;

        public static XspaceAccessCfServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            XspaceAccessCfServiceResponseBodyData self = new XspaceAccessCfServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public XspaceAccessCfServiceResponseBodyData setApplyOrderUrl(String applyOrderUrl) {
            this.applyOrderUrl = applyOrderUrl;
            return this;
        }
        public String getApplyOrderUrl() {
            return this.applyOrderUrl;
        }

        public XspaceAccessCfServiceResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public XspaceAccessCfServiceResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

    }

}
