// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetUsageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetUsageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retryAble")
    public Boolean retryAble;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUsageResponseBody self = new GetUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUsageResponseBody setData(GetUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUsageResponseBodyData getData() {
        return this.data;
    }

    public GetUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUsageResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public GetUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUsageResponseBodyDataEntitlements extends TeaModel {
        @NameInMap("allowedModels")
        public java.util.List<String> allowedModels;

        /**
         * <strong>example:</strong>
         * <p>238746</p>
         */
        @NameInMap("bindingId")
        public Long bindingId;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("effectiveAt")
        public String effectiveAt;

        /**
         * <strong>example:</strong>
         * <p>2024-01-31T00:00:00Z</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("quotaInitial")
        public Long quotaInitial;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("quotaRemaining")
        public Long quotaRemaining;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("quotaUsed")
        public Long quotaUsed;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>893724</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("templateName")
        public String templateName;

        public static GetUsageResponseBodyDataEntitlements build(java.util.Map<String, ?> map) throws Exception {
            GetUsageResponseBodyDataEntitlements self = new GetUsageResponseBodyDataEntitlements();
            return TeaModel.build(map, self);
        }

        public GetUsageResponseBodyDataEntitlements setAllowedModels(java.util.List<String> allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }
        public java.util.List<String> getAllowedModels() {
            return this.allowedModels;
        }

        public GetUsageResponseBodyDataEntitlements setBindingId(Long bindingId) {
            this.bindingId = bindingId;
            return this;
        }
        public Long getBindingId() {
            return this.bindingId;
        }

        public GetUsageResponseBodyDataEntitlements setEffectiveAt(String effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }
        public String getEffectiveAt() {
            return this.effectiveAt;
        }

        public GetUsageResponseBodyDataEntitlements setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public GetUsageResponseBodyDataEntitlements setQuotaInitial(Long quotaInitial) {
            this.quotaInitial = quotaInitial;
            return this;
        }
        public Long getQuotaInitial() {
            return this.quotaInitial;
        }

        public GetUsageResponseBodyDataEntitlements setQuotaRemaining(Long quotaRemaining) {
            this.quotaRemaining = quotaRemaining;
            return this;
        }
        public Long getQuotaRemaining() {
            return this.quotaRemaining;
        }

        public GetUsageResponseBodyDataEntitlements setQuotaUsed(Long quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Long getQuotaUsed() {
            return this.quotaUsed;
        }

        public GetUsageResponseBodyDataEntitlements setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUsageResponseBodyDataEntitlements setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetUsageResponseBodyDataEntitlements setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetUsageResponseBodyDataModelStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("inputUsage")
        public Long inputUsage;

        /**
         * <strong>example:</strong>
         * <p>qwen-turbo</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("outputUsage")
        public Long outputUsage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("requests")
        public Long requests;

        /**
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("totalUsage")
        public Long totalUsage;

        public static GetUsageResponseBodyDataModelStats build(java.util.Map<String, ?> map) throws Exception {
            GetUsageResponseBodyDataModelStats self = new GetUsageResponseBodyDataModelStats();
            return TeaModel.build(map, self);
        }

        public GetUsageResponseBodyDataModelStats setInputUsage(Long inputUsage) {
            this.inputUsage = inputUsage;
            return this;
        }
        public Long getInputUsage() {
            return this.inputUsage;
        }

        public GetUsageResponseBodyDataModelStats setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetUsageResponseBodyDataModelStats setOutputUsage(Long outputUsage) {
            this.outputUsage = outputUsage;
            return this;
        }
        public Long getOutputUsage() {
            return this.outputUsage;
        }

        public GetUsageResponseBodyDataModelStats setRequests(Long requests) {
            this.requests = requests;
            return this;
        }
        public Long getRequests() {
            return this.requests;
        }

        public GetUsageResponseBodyDataModelStats setTotalUsage(Long totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Long getTotalUsage() {
            return this.totalUsage;
        }

    }

    public static class GetUsageResponseBodyDataSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("totalInputUsage")
        public Long totalInputUsage;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("totalOutputUsage")
        public Long totalOutputUsage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalRequests")
        public Long totalRequests;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("totalUsage")
        public Long totalUsage;

        public static GetUsageResponseBodyDataSummary build(java.util.Map<String, ?> map) throws Exception {
            GetUsageResponseBodyDataSummary self = new GetUsageResponseBodyDataSummary();
            return TeaModel.build(map, self);
        }

        public GetUsageResponseBodyDataSummary setTotalInputUsage(Long totalInputUsage) {
            this.totalInputUsage = totalInputUsage;
            return this;
        }
        public Long getTotalInputUsage() {
            return this.totalInputUsage;
        }

        public GetUsageResponseBodyDataSummary setTotalOutputUsage(Long totalOutputUsage) {
            this.totalOutputUsage = totalOutputUsage;
            return this;
        }
        public Long getTotalOutputUsage() {
            return this.totalOutputUsage;
        }

        public GetUsageResponseBodyDataSummary setTotalRequests(Long totalRequests) {
            this.totalRequests = totalRequests;
            return this;
        }
        public Long getTotalRequests() {
            return this.totalRequests;
        }

        public GetUsageResponseBodyDataSummary setTotalUsage(Long totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Long getTotalUsage() {
            return this.totalUsage;
        }

    }

    public static class GetUsageResponseBodyData extends TeaModel {
        @NameInMap("entitlements")
        public java.util.List<GetUsageResponseBodyDataEntitlements> entitlements;

        @NameInMap("modelStats")
        public java.util.List<GetUsageResponseBodyDataModelStats> modelStats;

        @NameInMap("summary")
        public GetUsageResponseBodyDataSummary summary;

        public static GetUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUsageResponseBodyData self = new GetUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUsageResponseBodyData setEntitlements(java.util.List<GetUsageResponseBodyDataEntitlements> entitlements) {
            this.entitlements = entitlements;
            return this;
        }
        public java.util.List<GetUsageResponseBodyDataEntitlements> getEntitlements() {
            return this.entitlements;
        }

        public GetUsageResponseBodyData setModelStats(java.util.List<GetUsageResponseBodyDataModelStats> modelStats) {
            this.modelStats = modelStats;
            return this;
        }
        public java.util.List<GetUsageResponseBodyDataModelStats> getModelStats() {
            return this.modelStats;
        }

        public GetUsageResponseBodyData setSummary(GetUsageResponseBodyDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public GetUsageResponseBodyDataSummary getSummary() {
            return this.summary;
        }

    }

}
