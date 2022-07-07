// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryPointGrantRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PointGrantRuleDTO")
    public QueryPointGrantRuleResponseBodyPointGrantRuleDTO pointGrantRuleDTO;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPointGrantRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPointGrantRuleResponseBody self = new QueryPointGrantRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPointGrantRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPointGrantRuleResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryPointGrantRuleResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryPointGrantRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryPointGrantRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPointGrantRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPointGrantRuleResponseBody setPointGrantRuleDTO(QueryPointGrantRuleResponseBodyPointGrantRuleDTO pointGrantRuleDTO) {
        this.pointGrantRuleDTO = pointGrantRuleDTO;
        return this;
    }
    public QueryPointGrantRuleResponseBodyPointGrantRuleDTO getPointGrantRuleDTO() {
        return this.pointGrantRuleDTO;
    }

    public QueryPointGrantRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPointGrantRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPointGrantRuleResponseBodyPointGrantRuleDTO extends TeaModel {
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("PointAmount")
        public Long pointAmount;

        @NameInMap("StartAmount")
        public Double startAmount;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TotalPointAmount")
        public Long totalPointAmount;

        @NameInMap("Type")
        public String type;

        public static QueryPointGrantRuleResponseBodyPointGrantRuleDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryPointGrantRuleResponseBodyPointGrantRuleDTO self = new QueryPointGrantRuleResponseBodyPointGrantRuleDTO();
            return TeaModel.build(map, self);
        }

        public QueryPointGrantRuleResponseBodyPointGrantRuleDTO setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryPointGrantRuleResponseBodyPointGrantRuleDTO setPointAmount(Long pointAmount) {
            this.pointAmount = pointAmount;
            return this;
        }
        public Long getPointAmount() {
            return this.pointAmount;
        }

        public QueryPointGrantRuleResponseBodyPointGrantRuleDTO setStartAmount(Double startAmount) {
            this.startAmount = startAmount;
            return this;
        }
        public Double getStartAmount() {
            return this.startAmount;
        }

        public QueryPointGrantRuleResponseBodyPointGrantRuleDTO setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryPointGrantRuleResponseBodyPointGrantRuleDTO setTotalPointAmount(Long totalPointAmount) {
            this.totalPointAmount = totalPointAmount;
            return this;
        }
        public Long getTotalPointAmount() {
            return this.totalPointAmount;
        }

        public QueryPointGrantRuleResponseBodyPointGrantRuleDTO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
