// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagApplyRuleResponseBody extends TeaModel {
    /**
     * <p>The request status code. <strong>OK</strong> indicates success.</p>
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
     * <p>The description of the returned status code.</p>
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
     * <li><p>true: successful.</p>
     * </li>
     * <li><p>false: failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The application material requirements. This parameter is returned when NeedApplyMaterial=1.</p>
         * 
         * <strong>example:</strong>
         * <p>申请材料的要求是XXX</p>
         */
        @NameInMap("ApplyMaterialDesc")
        public String applyMaterialDesc;

        /**
         * <p>Indicates whether to automatically approve. Valid values:</p>
         * <ul>
         * <li><p>0: do not automatically approve.</p>
         * </li>
         * <li><p>1: automatically approve.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoAudit")
        public Long autoAudit;

        /**
         * <p>The billing standard description link.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        @NameInMap("ChargingStandardLink")
        public String chargingStandardLink;

        /**
         * <p>Indicates whether encrypted query is supported. Valid values:</p>
         * <ul>
         * <li><p>0: not supported.</p>
         * </li>
         * <li><p>1: supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EncryptedQuery")
        public Long encryptedQuery;

        /**
         * <p>Indicates whether application materials need to be provided. Valid values:</p>
         * <ul>
         * <li><p>0: not required.</p>
         * </li>
         * <li><p>1: required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NeedApplyMaterial")
        public Long needApplyMaterial;

        /**
         * <p>The service agreement link.</p>
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
