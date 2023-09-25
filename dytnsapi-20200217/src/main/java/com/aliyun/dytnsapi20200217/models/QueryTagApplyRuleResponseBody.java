// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagApplyRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTagApplyRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTagApplyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagApplyRuleResponseBody self = new QueryTagApplyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagApplyRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTagApplyRuleResponseBody setData(QueryTagApplyRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTagApplyRuleResponseBodyData getData() {
        return this.data;
    }

    public QueryTagApplyRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTagApplyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagApplyRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTagApplyRuleResponseBodyData extends TeaModel {
        /**
         * <p>申请材料要求</p>
         */
        @NameInMap("ApplyMaterialDesc")
        public String applyMaterialDesc;

        /**
         * <p>是否自动审批</p>
         */
        @NameInMap("AutoAudit")
        public Long autoAudit;

        /**
         * <p>计费标准说明链接</p>
         */
        @NameInMap("ChargingStandardLink")
        public String chargingStandardLink;

        /**
         * <p>是否支持加密查询</p>
         */
        @NameInMap("EncryptedQuery")
        public Long encryptedQuery;

        /**
         * <p>是否需要提供申请材料</p>
         */
        @NameInMap("NeedApplyMaterial")
        public Long needApplyMaterial;

        /**
         * <p>服务协议链接</p>
         */
        @NameInMap("SlaLink")
        public String slaLink;

        public static QueryTagApplyRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTagApplyRuleResponseBodyData self = new QueryTagApplyRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTagApplyRuleResponseBodyData setApplyMaterialDesc(String applyMaterialDesc) {
            this.applyMaterialDesc = applyMaterialDesc;
            return this;
        }
        public String getApplyMaterialDesc() {
            return this.applyMaterialDesc;
        }

        public QueryTagApplyRuleResponseBodyData setAutoAudit(Long autoAudit) {
            this.autoAudit = autoAudit;
            return this;
        }
        public Long getAutoAudit() {
            return this.autoAudit;
        }

        public QueryTagApplyRuleResponseBodyData setChargingStandardLink(String chargingStandardLink) {
            this.chargingStandardLink = chargingStandardLink;
            return this;
        }
        public String getChargingStandardLink() {
            return this.chargingStandardLink;
        }

        public QueryTagApplyRuleResponseBodyData setEncryptedQuery(Long encryptedQuery) {
            this.encryptedQuery = encryptedQuery;
            return this;
        }
        public Long getEncryptedQuery() {
            return this.encryptedQuery;
        }

        public QueryTagApplyRuleResponseBodyData setNeedApplyMaterial(Long needApplyMaterial) {
            this.needApplyMaterial = needApplyMaterial;
            return this;
        }
        public Long getNeedApplyMaterial() {
            return this.needApplyMaterial;
        }

        public QueryTagApplyRuleResponseBodyData setSlaLink(String slaLink) {
            this.slaLink = slaLink;
            return this;
        }
        public String getSlaLink() {
            return this.slaLink;
        }

    }

}
