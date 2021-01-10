// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderCommissionRateResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CommissionModels")
    public java.util.List<QueryOrderCommissionRateResponseBodyCommissionModels> commissionModels;

    @NameInMap("Code")
    public String code;

    public static QueryOrderCommissionRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderCommissionRateResponseBody self = new QueryOrderCommissionRateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderCommissionRateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderCommissionRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderCommissionRateResponseBody setCommissionModels(java.util.List<QueryOrderCommissionRateResponseBodyCommissionModels> commissionModels) {
        this.commissionModels = commissionModels;
        return this;
    }
    public java.util.List<QueryOrderCommissionRateResponseBodyCommissionModels> getCommissionModels() {
        return this.commissionModels;
    }

    public QueryOrderCommissionRateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs extends TeaModel {
        @NameInMap("Value")
        public Long value;

        @NameInMap("ValueUnit")
        public String valueUnit;

        public static QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs self = new QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
            return this;
        }
        public String getValueUnit() {
            return this.valueUnit;
        }

    }

    public static class QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig extends TeaModel {
        @NameInMap("Configs")
        public java.util.List<QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs> configs;

        public static QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig self = new QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig setConfigs(java.util.List<QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfigConfigs> getConfigs() {
            return this.configs;
        }

    }

    public static class QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo extends TeaModel {
        @NameInMap("RateConfig")
        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig rateConfig;

        @NameInMap("RateType")
        public String rateType;

        public static QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo self = new QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo setRateConfig(QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig rateConfig) {
            this.rateConfig = rateConfig;
            return this;
        }
        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfoRateConfig getRateConfig() {
            return this.rateConfig;
        }

        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo setRateType(String rateType) {
            this.rateType = rateType;
            return this;
        }
        public String getRateType() {
            return this.rateType;
        }

    }

    public static class QueryOrderCommissionRateResponseBodyCommissionModels extends TeaModel {
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("CommissionInfo")
        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo commissionInfo;

        public static QueryOrderCommissionRateResponseBodyCommissionModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseBodyCommissionModels self = new QueryOrderCommissionRateResponseBodyCommissionModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseBodyCommissionModels setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderCommissionRateResponseBodyCommissionModels setCommissionInfo(QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo commissionInfo) {
            this.commissionInfo = commissionInfo;
            return this;
        }
        public QueryOrderCommissionRateResponseBodyCommissionModelsCommissionInfo getCommissionInfo() {
            return this.commissionInfo;
        }

    }

}
