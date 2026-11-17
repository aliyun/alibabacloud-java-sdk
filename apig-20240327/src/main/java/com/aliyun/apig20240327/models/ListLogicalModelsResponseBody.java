// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListLogicalModelsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListLogicalModelsResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListLogicalModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogicalModelsResponseBody self = new ListLogicalModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogicalModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLogicalModelsResponseBody setData(ListLogicalModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLogicalModelsResponseBodyData getData() {
        return this.data;
    }

    public ListLogicalModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLogicalModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLogicalModelsResponseBodyDataItemsAvailablePaths extends TeaModel {
        /**
         * <p>The call path.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The path type.</p>
         * 
         * <strong>example:</strong>
         * <p>type-xxxxxxxx</p>
         */
        @NameInMap("type")
        public String type;

        public static ListLogicalModelsResponseBodyDataItemsAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsAvailablePaths self = new ListLogicalModelsResponseBodyDataItemsAvailablePaths();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListLogicalModelsResponseBodyDataItemsAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsDeployment extends TeaModel {
        /**
         * <p>The ID of the current configuration delivery operation.</p>
         * 
         * <strong>example:</strong>
         * <p>op-xxxxxxxx</p>
         */
        @NameInMap("operationId")
        public String operationId;

        /**
         * <p>The object configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("revision")
        public Long revision;

        /**
         * <p>The configuration delivery status. Valid values: Pending, Running, Succeeded, PartiallyFailed, and Failed. This status is independent of the API release status.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        public static ListLogicalModelsResponseBodyDataItemsDeployment build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsDeployment self = new ListLogicalModelsResponseBodyDataItemsDeployment();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsDeployment setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListLogicalModelsResponseBodyDataItemsDeployment setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public ListLogicalModelsResponseBodyDataItemsDeployment setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsFallbackTargets extends TeaModel {
        /**
         * <p>The ID of the actual source card within the same instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-xxxxxxxx</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static ListLogicalModelsResponseBodyDataItemsFallbackTargets build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsFallbackTargets self = new ListLogicalModelsResponseBodyDataItemsFallbackTargets();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsFallbackTargets setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsMeta extends TeaModel {
        /**
         * <p>The minimum input token limit when all primary targets declare the limit. This parameter is not returned if the limit of any target is unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <p>The minimum output token limit when all primary targets declare the limit. This parameter is not returned if the limit of any target is unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <p>The minimum total token limit when all primary targets declare the limit. This parameter is not returned if the limit of any target is unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <p>The input modalities commonly supported by all primary targets.</p>
         */
        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        /**
         * <p>The output modalities commonly supported by all primary targets.</p>
         */
        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static ListLogicalModelsResponseBodyDataItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsMeta self = new ListLogicalModelsResponseBodyDataItemsMeta();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public ListLogicalModelsResponseBodyDataItemsMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public ListLogicalModelsResponseBodyDataItemsMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public ListLogicalModelsResponseBodyDataItemsMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public ListLogicalModelsResponseBodyDataItemsMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsSlotsComplex extends TeaModel {
        /**
         * <p>The ID of the actual source card within the same instance. The ID starts with &quot;msc-&quot;. VMs or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-xxxxxxxx</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static ListLogicalModelsResponseBodyDataItemsSlotsComplex build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsSlotsComplex self = new ListLogicalModelsResponseBodyDataItemsSlotsComplex();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsSlotsComplex setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsSlotsSimple extends TeaModel {
        /**
         * <p>The ID of the actual source card within the same instance. The ID starts with &quot;msc-&quot;. VMs or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-xxxxxxxx</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static ListLogicalModelsResponseBodyDataItemsSlotsSimple build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsSlotsSimple self = new ListLogicalModelsResponseBodyDataItemsSlotsSimple();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsSlotsSimple setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsSlotsStandard extends TeaModel {
        /**
         * <p>The ID of the actual source card within the same instance. The ID starts with &quot;msc-&quot;. VMs or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-xxxxxxxx</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static ListLogicalModelsResponseBodyDataItemsSlotsStandard build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsSlotsStandard self = new ListLogicalModelsResponseBodyDataItemsSlotsStandard();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsSlotsStandard setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsSlots extends TeaModel {
        /**
         * <p>The complex slot, which contains 1 to 3 source cards. The three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("complex")
        public java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsComplex> complex;

        /**
         * <p>The simple slot, which contains 1 to 3 source cards. The three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("simple")
        public java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsSimple> simple;

        /**
         * <p>The standard slot, which contains 1 to 3 source cards. The three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("standard")
        public java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsStandard> standard;

        public static ListLogicalModelsResponseBodyDataItemsSlots build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsSlots self = new ListLogicalModelsResponseBodyDataItemsSlots();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsSlots setComplex(java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsComplex> complex) {
            this.complex = complex;
            return this;
        }
        public java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsComplex> getComplex() {
            return this.complex;
        }

        public ListLogicalModelsResponseBodyDataItemsSlots setSimple(java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsSimple> simple) {
            this.simple = simple;
            return this;
        }
        public java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsSimple> getSimple() {
            return this.simple;
        }

        public ListLogicalModelsResponseBodyDataItemsSlots setStandard(java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsStandard> standard) {
            this.standard = standard;
            return this;
        }
        public java.util.List<ListLogicalModelsResponseBodyDataItemsSlotsStandard> getStandard() {
            return this.standard;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItemsTargets extends TeaModel {
        /**
         * <p>The ID of the actual source model card within the same instance. The ID starts with &quot;msc-&quot;. Virtual machines (VMs) or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-xxxxxxxx</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <p>The weight. The value is an integer from 0 to 10000 and is saved as the original value. A value of 0 is allowed for the Mapping policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static ListLogicalModelsResponseBodyDataItemsTargets build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItemsTargets self = new ListLogicalModelsResponseBodyDataItemsTargets();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItemsTargets setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public ListLogicalModelsResponseBodyDataItemsTargets setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListLogicalModelsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The list of call paths commonly supported by all primary targets.</p>
         */
        @NameInMap("availablePaths")
        public java.util.List<ListLogicalModelsResponseBodyDataItemsAvailablePaths> availablePaths;

        /**
         * <p>The call strategy. This parameter is returned only for the Auto policy. Valid values: balanced, cheap, fast, and quality. This parameter can be omitted. If omitted, the default strategy is balanced. This parameter is not returned for the Mapping and Weighted policies.</p>
         * 
         * <strong>example:</strong>
         * <p>balanced</p>
         */
        @NameInMap("callStrategy")
        public String callStrategy;

        /**
         * <p>The configuration delivery record. A successful API response only indicates that the request is accepted, not that the configuration has taken effect.</p>
         */
        @NameInMap("deployment")
        public ListLogicalModelsResponseBodyDataItemsDeployment deployment;

        /**
         * <p>The ordered fallback targets. A maximum of 5 fallback targets are supported. The targets are deduplicated by the actual card ID. This parameter can be an empty array.</p>
         */
        @NameInMap("fallbackTargets")
        public java.util.List<ListLogicalModelsResponseBodyDataItemsFallbackTargets> fallbackTargets;

        /**
         * <p>The intersection of the Boolean capabilities of all primary targets.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nativeStreaming&quot;:true}</p>
         */
        @NameInMap("features")
        public java.util.Map<String, ?> features;

        /**
         * <p>The ID of the gateway instance to which the logical model belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxxxxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The logical model ID. The ID starts with &quot;vm-&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>vm-xxxxxxxx</p>
         */
        @NameInMap("logicalModelId")
        public String logicalModelId;

        /**
         * <p>The aggregated information about the capabilities of the primary targets.</p>
         */
        @NameInMap("meta")
        public ListLogicalModelsResponseBodyDataItemsMeta meta;

        /**
         * <p>The client logical call name. It supports a maximum of 256 bytes in UTF-8, must not contain spaces or slashes, and must not start with &quot;auto&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-entry</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether activation is required. This parameter is returned only for the Auto policy. The value is true if the AI Credits Router commodity is not activated, and false if it is activated. This parameter is omitted if the read operation fails or the status is unknown. This parameter is omitted for the Mapping and Weighted policies.</p>
         */
        @NameInMap("requiresActivation")
        public Boolean requiresActivation;

        /**
         * <p>The response model type. If the value is Actual, the public name of the actual model is returned. If the value is Logical, the entry name of the logical model is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Logical</p>
         */
        @NameInMap("responseModel")
        public String responseModel;

        /**
         * <p>The object version number. The initial value is 1 upon creation and increments after each successful update.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("revision")
        public Long revision;

        /**
         * <p>The routing policy. Valid values: Mapping, Weighted, and Auto. If the value is Auto, the targets parameter must be an empty array and the slots parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mapping</p>
         */
        @NameInMap("routingPolicy")
        public String routingPolicy;

        /**
         * <p>The slots. This parameter is returned only for the Auto policy. Each of the simple, standard, and complex slots contains 1 to 3 source cards. The three slots are globally deduplicated by modelCardId. This parameter is omitted for the Mapping and Weighted policies.</p>
         */
        @NameInMap("slots")
        public ListLogicalModelsResponseBodyDataItemsSlots slots;

        /**
         * <p>The primary targets. For the Mapping policy, exactly one target is allowed. For the Weighted policy, the sum of original relative weights must be greater than 0. For the Auto policy, this must be an empty array.</p>
         */
        @NameInMap("targets")
        public java.util.List<ListLogicalModelsResponseBodyDataItemsTargets> targets;

        /**
         * <p>The last modification time. The time is in the ISO 8601 (RFC 3339) format and UTC time zone, such as 2026-05-15T10:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListLogicalModelsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyDataItems self = new ListLogicalModelsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyDataItems setAvailablePaths(java.util.List<ListLogicalModelsResponseBodyDataItemsAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<ListLogicalModelsResponseBodyDataItemsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public ListLogicalModelsResponseBodyDataItems setCallStrategy(String callStrategy) {
            this.callStrategy = callStrategy;
            return this;
        }
        public String getCallStrategy() {
            return this.callStrategy;
        }

        public ListLogicalModelsResponseBodyDataItems setDeployment(ListLogicalModelsResponseBodyDataItemsDeployment deployment) {
            this.deployment = deployment;
            return this;
        }
        public ListLogicalModelsResponseBodyDataItemsDeployment getDeployment() {
            return this.deployment;
        }

        public ListLogicalModelsResponseBodyDataItems setFallbackTargets(java.util.List<ListLogicalModelsResponseBodyDataItemsFallbackTargets> fallbackTargets) {
            this.fallbackTargets = fallbackTargets;
            return this;
        }
        public java.util.List<ListLogicalModelsResponseBodyDataItemsFallbackTargets> getFallbackTargets() {
            return this.fallbackTargets;
        }

        public ListLogicalModelsResponseBodyDataItems setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public ListLogicalModelsResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListLogicalModelsResponseBodyDataItems setLogicalModelId(String logicalModelId) {
            this.logicalModelId = logicalModelId;
            return this;
        }
        public String getLogicalModelId() {
            return this.logicalModelId;
        }

        public ListLogicalModelsResponseBodyDataItems setMeta(ListLogicalModelsResponseBodyDataItemsMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListLogicalModelsResponseBodyDataItemsMeta getMeta() {
            return this.meta;
        }

        public ListLogicalModelsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLogicalModelsResponseBodyDataItems setRequiresActivation(Boolean requiresActivation) {
            this.requiresActivation = requiresActivation;
            return this;
        }
        public Boolean getRequiresActivation() {
            return this.requiresActivation;
        }

        public ListLogicalModelsResponseBodyDataItems setResponseModel(String responseModel) {
            this.responseModel = responseModel;
            return this;
        }
        public String getResponseModel() {
            return this.responseModel;
        }

        public ListLogicalModelsResponseBodyDataItems setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public ListLogicalModelsResponseBodyDataItems setRoutingPolicy(String routingPolicy) {
            this.routingPolicy = routingPolicy;
            return this;
        }
        public String getRoutingPolicy() {
            return this.routingPolicy;
        }

        public ListLogicalModelsResponseBodyDataItems setSlots(ListLogicalModelsResponseBodyDataItemsSlots slots) {
            this.slots = slots;
            return this;
        }
        public ListLogicalModelsResponseBodyDataItemsSlots getSlots() {
            return this.slots;
        }

        public ListLogicalModelsResponseBodyDataItems setTargets(java.util.List<ListLogicalModelsResponseBodyDataItemsTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<ListLogicalModelsResponseBodyDataItemsTargets> getTargets() {
            return this.targets;
        }

        public ListLogicalModelsResponseBodyDataItems setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListLogicalModelsResponseBodyData extends TeaModel {
        /**
         * <p>The list of logical models.</p>
         */
        @NameInMap("items")
        public java.util.List<ListLogicalModelsResponseBodyDataItems> items;

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
         * <p>The cursor token for querying the next page. This parameter is not returned if no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-xxxxxxxx</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListLogicalModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLogicalModelsResponseBodyData self = new ListLogicalModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLogicalModelsResponseBodyData setItems(java.util.List<ListLogicalModelsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListLogicalModelsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListLogicalModelsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListLogicalModelsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLogicalModelsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
