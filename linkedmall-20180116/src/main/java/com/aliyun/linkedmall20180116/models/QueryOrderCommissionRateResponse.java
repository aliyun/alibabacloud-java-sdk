// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderCommissionRateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("CommissionModels")
    @Validation(required = true)
    public java.util.List<QueryOrderCommissionRateResponseCommissionModels> commissionModels;

    public static QueryOrderCommissionRateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderCommissionRateResponse self = new QueryOrderCommissionRateResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderCommissionRateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderCommissionRateResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderCommissionRateResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderCommissionRateResponse setCommissionModels(java.util.List<QueryOrderCommissionRateResponseCommissionModels> commissionModels) {
        this.commissionModels = commissionModels;
        return this;
    }
    public java.util.List<QueryOrderCommissionRateResponseCommissionModels> getCommissionModels() {
        return this.commissionModels;
    }

    public static class QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public Long value;

        @NameInMap("ValueUnit")
        @Validation(required = true)
        public String valueUnit;

        public static QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs self = new QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
            return this;
        }
        public String getValueUnit() {
            return this.valueUnit;
        }

    }

    public static class QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig extends TeaModel {
        @NameInMap("Configs")
        @Validation(required = true)
        public java.util.List<QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs> configs;

        public static QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig self = new QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig setConfigs(java.util.List<QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfigConfigs> getConfigs() {
            return this.configs;
        }

    }

    public static class QueryOrderCommissionRateResponseCommissionModelsCommissionInfo extends TeaModel {
        @NameInMap("RateType")
        @Validation(required = true)
        public String rateType;

        @NameInMap("RateConfig")
        @Validation(required = true)
        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig rateConfig;

        public static QueryOrderCommissionRateResponseCommissionModelsCommissionInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseCommissionModelsCommissionInfo self = new QueryOrderCommissionRateResponseCommissionModelsCommissionInfo();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfo setRateType(String rateType) {
            this.rateType = rateType;
            return this;
        }
        public String getRateType() {
            return this.rateType;
        }

        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfo setRateConfig(QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig rateConfig) {
            this.rateConfig = rateConfig;
            return this;
        }
        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfoRateConfig getRateConfig() {
            return this.rateConfig;
        }

    }

    public static class QueryOrderCommissionRateResponseCommissionModels extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("CommissionInfo")
        @Validation(required = true)
        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfo commissionInfo;

        public static QueryOrderCommissionRateResponseCommissionModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderCommissionRateResponseCommissionModels self = new QueryOrderCommissionRateResponseCommissionModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderCommissionRateResponseCommissionModels setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderCommissionRateResponseCommissionModels setCommissionInfo(QueryOrderCommissionRateResponseCommissionModelsCommissionInfo commissionInfo) {
            this.commissionInfo = commissionInfo;
            return this;
        }
        public QueryOrderCommissionRateResponseCommissionModelsCommissionInfo getCommissionInfo() {
            return this.commissionInfo;
        }

    }

}
