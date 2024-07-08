// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagApplyRuleResponseBody extends TeaModel {
    /**
     * <p>The response code. <strong>OK</strong> indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryTagApplyRuleResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-<strong><strong>-</strong></strong>-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
         * <p>The requirements for application materials.</p>
         * 
         * <strong>example:</strong>
         * <p>Requirements for application materials</p>
         */
        @NameInMap("ApplyMaterialDesc")
        public String applyMaterialDesc;

        /**
         * <p>Indicates whether the application is automatically approved.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("AutoAudit")
        public Long autoAudit;

        /**
         * <p>The URL for the billing documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        @NameInMap("ChargingStandardLink")
        public String chargingStandardLink;

        /**
         * <p>indicates whether encrypted queries are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("EncryptedQuery")
        public Long encryptedQuery;

        /**
         * <p>Indicates whether application materials are required.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("NeedApplyMaterial")
        public Long needApplyMaterial;

        /**
         * <p>The URL for the service agreement.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
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
