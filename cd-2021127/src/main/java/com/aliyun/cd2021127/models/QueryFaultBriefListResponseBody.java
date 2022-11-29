// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultBriefListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryFaultBriefListResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaultBriefListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultBriefListResponseBody self = new QueryFaultBriefListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaultBriefListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaultBriefListResponseBody setData(java.util.List<QueryFaultBriefListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFaultBriefListResponseBodyData> getData() {
        return this.data;
    }

    public QueryFaultBriefListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryFaultBriefListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFaultBriefListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaultBriefListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaultBriefListResponseBodyData extends TeaModel {
        @NameInMap("FaultNum")
        public Integer faultNum;

        @NameInMap("FaultType")
        public Integer faultType;

        @NameInMap("RecoveryNum")
        public Integer recoveryNum;

        public static QueryFaultBriefListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaultBriefListResponseBodyData self = new QueryFaultBriefListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaultBriefListResponseBodyData setFaultNum(Integer faultNum) {
            this.faultNum = faultNum;
            return this;
        }
        public Integer getFaultNum() {
            return this.faultNum;
        }

        public QueryFaultBriefListResponseBodyData setFaultType(Integer faultType) {
            this.faultType = faultType;
            return this;
        }
        public Integer getFaultType() {
            return this.faultType;
        }

        public QueryFaultBriefListResponseBodyData setRecoveryNum(Integer recoveryNum) {
            this.recoveryNum = recoveryNum;
            return this;
        }
        public Integer getRecoveryNum() {
            return this.recoveryNum;
        }

    }

}
