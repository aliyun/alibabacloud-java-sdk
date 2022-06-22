// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryScenarioListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryScenarioListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryScenarioListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScenarioListResponseBody self = new QueryScenarioListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScenarioListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryScenarioListResponseBody setData(java.util.List<QueryScenarioListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryScenarioListResponseBodyData> getData() {
        return this.data;
    }

    public QueryScenarioListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryScenarioListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScenarioListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryScenarioListResponseBodyData extends TeaModel {
        @NameInMap("scenarioDesc")
        public String scenarioDesc;

        @NameInMap("scenarioId")
        public String scenarioId;

        @NameInMap("scenarioName")
        public String scenarioName;

        public static QueryScenarioListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryScenarioListResponseBodyData self = new QueryScenarioListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryScenarioListResponseBodyData setScenarioDesc(String scenarioDesc) {
            this.scenarioDesc = scenarioDesc;
            return this;
        }
        public String getScenarioDesc() {
            return this.scenarioDesc;
        }

        public QueryScenarioListResponseBodyData setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public QueryScenarioListResponseBodyData setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

    }

}
