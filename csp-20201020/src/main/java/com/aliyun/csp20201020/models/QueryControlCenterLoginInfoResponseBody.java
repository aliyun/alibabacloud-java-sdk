// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryControlCenterLoginInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryControlCenterLoginInfoResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryControlCenterLoginInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryControlCenterLoginInfoResponseBody self = new QueryControlCenterLoginInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryControlCenterLoginInfoResponseBody setData(QueryControlCenterLoginInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryControlCenterLoginInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryControlCenterLoginInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryControlCenterLoginInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryControlCenterLoginInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryControlCenterLoginInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryControlCenterLoginInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryControlCenterLoginInfoResponseBodyData extends TeaModel {
        @NameInMap("ControlCenterLoginName")
        public String controlCenterLoginName;

        @NameInMap("ControlCenterPassword")
        public String controlCenterPassword;

        public static QueryControlCenterLoginInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryControlCenterLoginInfoResponseBodyData self = new QueryControlCenterLoginInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryControlCenterLoginInfoResponseBodyData setControlCenterLoginName(String controlCenterLoginName) {
            this.controlCenterLoginName = controlCenterLoginName;
            return this;
        }
        public String getControlCenterLoginName() {
            return this.controlCenterLoginName;
        }

        public QueryControlCenterLoginInfoResponseBodyData setControlCenterPassword(String controlCenterPassword) {
            this.controlCenterPassword = controlCenterPassword;
            return this;
        }
        public String getControlCenterPassword() {
            return this.controlCenterPassword;
        }

    }

}
