// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class QueryCommodityInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CommodityInstances")
    public QueryCommodityInstanceListResponseBodyCommodityInstances commodityInstances;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCommodityInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityInstanceListResponseBody self = new QueryCommodityInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommodityInstanceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCommodityInstanceListResponseBody setCommodityInstances(QueryCommodityInstanceListResponseBodyCommodityInstances commodityInstances) {
        this.commodityInstances = commodityInstances;
        return this;
    }
    public QueryCommodityInstanceListResponseBodyCommodityInstances getCommodityInstances() {
        return this.commodityInstances;
    }

    public QueryCommodityInstanceListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryCommodityInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCommodityInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommodityInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance extends TeaModel {
        @NameInMap("EndData")
        public Long endData;

        @NameInMap("HotlineSeatNum")
        public Integer hotlineSeatNum;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OnlineSeatNum")
        public Integer onlineSeatNum;

        @NameInMap("StartData")
        public Long startData;

        @NameInMap("Status")
        public Integer status;

        public static QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance self = new QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance();
            return TeaModel.build(map, self);
        }

        public QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance setEndData(Long endData) {
            this.endData = endData;
            return this;
        }
        public Long getEndData() {
            return this.endData;
        }

        public QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance setHotlineSeatNum(Integer hotlineSeatNum) {
            this.hotlineSeatNum = hotlineSeatNum;
            return this;
        }
        public Integer getHotlineSeatNum() {
            return this.hotlineSeatNum;
        }

        public QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance setOnlineSeatNum(Integer onlineSeatNum) {
            this.onlineSeatNum = onlineSeatNum;
            return this;
        }
        public Integer getOnlineSeatNum() {
            return this.onlineSeatNum;
        }

        public QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance setStartData(Long startData) {
            this.startData = startData;
            return this;
        }
        public Long getStartData() {
            return this.startData;
        }

        public QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryCommodityInstanceListResponseBodyCommodityInstances extends TeaModel {
        @NameInMap("CommodityInstance")
        public java.util.List<QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance> commodityInstance;

        public static QueryCommodityInstanceListResponseBodyCommodityInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityInstanceListResponseBodyCommodityInstances self = new QueryCommodityInstanceListResponseBodyCommodityInstances();
            return TeaModel.build(map, self);
        }

        public QueryCommodityInstanceListResponseBodyCommodityInstances setCommodityInstance(java.util.List<QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance> commodityInstance) {
            this.commodityInstance = commodityInstance;
            return this;
        }
        public java.util.List<QueryCommodityInstanceListResponseBodyCommodityInstancesCommodityInstance> getCommodityInstance() {
            return this.commodityInstance;
        }

    }

}
