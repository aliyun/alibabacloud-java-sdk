// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryClusterTypeStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryClusterTypeStatisticsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterTypeStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterTypeStatisticsResponseBody self = new QueryClusterTypeStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterTypeStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryClusterTypeStatisticsResponseBody setData(QueryClusterTypeStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClusterTypeStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QueryClusterTypeStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterTypeStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterTypeStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterTypeStatisticsResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BadRequest")
        public Float badRequest;

        @NameInMap("Blocked")
        public Float blocked;

        @NameInMap("Fail")
        public Float fail;

        @NameInMap("Invalid")
        public Float invalid;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NoRefRule")
        public Float noRefRule;

        @NameInMap("NoRuleExist")
        public Float noRuleExist;

        @NameInMap("NotAvailable")
        public Float notAvailable;

        @NameInMap("Ok")
        public Float ok;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ShouldWait")
        public Float shouldWait;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TooMany")
        public Float tooMany;

        @NameInMap("Unknown")
        public Float unknown;

        @NameInMap("UserId")
        public String userId;

        public static QueryClusterTypeStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterTypeStatisticsResponseBodyData self = new QueryClusterTypeStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterTypeStatisticsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryClusterTypeStatisticsResponseBodyData setBadRequest(Float badRequest) {
            this.badRequest = badRequest;
            return this;
        }
        public Float getBadRequest() {
            return this.badRequest;
        }

        public QueryClusterTypeStatisticsResponseBodyData setBlocked(Float blocked) {
            this.blocked = blocked;
            return this;
        }
        public Float getBlocked() {
            return this.blocked;
        }

        public QueryClusterTypeStatisticsResponseBodyData setFail(Float fail) {
            this.fail = fail;
            return this;
        }
        public Float getFail() {
            return this.fail;
        }

        public QueryClusterTypeStatisticsResponseBodyData setInvalid(Float invalid) {
            this.invalid = invalid;
            return this;
        }
        public Float getInvalid() {
            return this.invalid;
        }

        public QueryClusterTypeStatisticsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryClusterTypeStatisticsResponseBodyData setNoRefRule(Float noRefRule) {
            this.noRefRule = noRefRule;
            return this;
        }
        public Float getNoRefRule() {
            return this.noRefRule;
        }

        public QueryClusterTypeStatisticsResponseBodyData setNoRuleExist(Float noRuleExist) {
            this.noRuleExist = noRuleExist;
            return this;
        }
        public Float getNoRuleExist() {
            return this.noRuleExist;
        }

        public QueryClusterTypeStatisticsResponseBodyData setNotAvailable(Float notAvailable) {
            this.notAvailable = notAvailable;
            return this;
        }
        public Float getNotAvailable() {
            return this.notAvailable;
        }

        public QueryClusterTypeStatisticsResponseBodyData setOk(Float ok) {
            this.ok = ok;
            return this;
        }
        public Float getOk() {
            return this.ok;
        }

        public QueryClusterTypeStatisticsResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QueryClusterTypeStatisticsResponseBodyData setShouldWait(Float shouldWait) {
            this.shouldWait = shouldWait;
            return this;
        }
        public Float getShouldWait() {
            return this.shouldWait;
        }

        public QueryClusterTypeStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryClusterTypeStatisticsResponseBodyData setTooMany(Float tooMany) {
            this.tooMany = tooMany;
            return this;
        }
        public Float getTooMany() {
            return this.tooMany;
        }

        public QueryClusterTypeStatisticsResponseBodyData setUnknown(Float unknown) {
            this.unknown = unknown;
            return this;
        }
        public Float getUnknown() {
            return this.unknown;
        }

        public QueryClusterTypeStatisticsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
