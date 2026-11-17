// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDirectSupplyResponseBody extends TeaModel {
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
    public GetDirectSupplyResponseBodyData data;

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

    public static GetDirectSupplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectSupplyResponseBody self = new GetDirectSupplyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectSupplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDirectSupplyResponseBody setData(GetDirectSupplyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDirectSupplyResponseBodyData getData() {
        return this.data;
    }

    public GetDirectSupplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDirectSupplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths extends TeaModel {
        /**
         * <p>The invocation path.</p>
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

        public static GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths self = new GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDirectSupplyResponseBodyDataCandidateModelsCredit extends TeaModel {
        /**
         * <p>The unit price of cache-hit tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>0.001</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <p>The unit price of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>0.004</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <p>The unit price of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>0.012</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>type-xxxxxxxx</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDirectSupplyResponseBodyDataCandidateModelsCredit build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataCandidateModelsCredit self = new GetDirectSupplyResponseBodyDataCandidateModelsCredit();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDirectSupplyResponseBodyDataCandidateModelsMeta extends TeaModel {
        /**
         * <p>The maximum number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <p>The maximum number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <p>The maximum total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <p>The list of supported input modalities.</p>
         */
        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        /**
         * <p>The list of supported output modalities.</p>
         */
        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static GetDirectSupplyResponseBodyDataCandidateModelsMeta build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataCandidateModelsMeta self = new GetDirectSupplyResponseBodyDataCandidateModelsMeta();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public GetDirectSupplyResponseBodyDataCandidateModelsMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class GetDirectSupplyResponseBodyDataCandidateModels extends TeaModel {
        /**
         * <p>The list of available invocation paths.</p>
         */
        @NameInMap("availablePaths")
        public java.util.List<GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths> availablePaths;

        /**
         * <p>The billing information of the model.</p>
         */
        @NameInMap("credit")
        public GetDirectSupplyResponseBodyDataCandidateModelsCredit credit;

        /**
         * <p>The capabilities and features supported by the model.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nativeStreaming&quot;:true}</p>
         */
        @NameInMap("features")
        public java.util.Map<String, ?> features;

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxxxxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The capability information of the model.</p>
         */
        @NameInMap("meta")
        public GetDirectSupplyResponseBodyDataCandidateModelsMeta meta;

        /**
         * <p>The ID of the model card, which starts with msc-.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-xxxxxxxx</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("modelProvider")
        public String modelProvider;

        /**
         * <p>The ID of the model source.</p>
         * 
         * <strong>example:</strong>
         * <p>model-source-xxxxxxxx</p>
         */
        @NameInMap("modelSourceId")
        public String modelSourceId;

        /**
         * <p>The source of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>source-xxxxxxxx</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The last update time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetDirectSupplyResponseBodyDataCandidateModels build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataCandidateModels self = new GetDirectSupplyResponseBodyDataCandidateModels();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setAvailablePaths(java.util.List<GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<GetDirectSupplyResponseBodyDataCandidateModelsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setCredit(GetDirectSupplyResponseBodyDataCandidateModelsCredit credit) {
            this.credit = credit;
            return this;
        }
        public GetDirectSupplyResponseBodyDataCandidateModelsCredit getCredit() {
            return this.credit;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setMeta(GetDirectSupplyResponseBodyDataCandidateModelsMeta meta) {
            this.meta = meta;
            return this;
        }
        public GetDirectSupplyResponseBodyDataCandidateModelsMeta getMeta() {
            return this.meta;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setModelSourceId(String modelSourceId) {
            this.modelSourceId = modelSourceId;
            return this;
        }
        public String getModelSourceId() {
            return this.modelSourceId;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetDirectSupplyResponseBodyDataCandidateModels setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetDirectSupplyResponseBodyDataCatalogError extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Model catalog query failed</p>
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

        public static GetDirectSupplyResponseBodyDataCatalogError build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataCatalogError self = new GetDirectSupplyResponseBodyDataCatalogError();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataCatalogError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDirectSupplyResponseBodyDataCatalogError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDirectSupplyResponseBodyDataCatalogError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class GetDirectSupplyResponseBodyDataModelsAvailablePaths extends TeaModel {
        /**
         * <p>The invocation path.</p>
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

        public static GetDirectSupplyResponseBodyDataModelsAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataModelsAvailablePaths self = new GetDirectSupplyResponseBodyDataModelsAvailablePaths();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataModelsAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDirectSupplyResponseBodyDataModelsAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDirectSupplyResponseBodyDataModelsCredit extends TeaModel {
        /**
         * <p>The unit price of cache-hit tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>0.001</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <p>The unit price of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>0.004</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <p>The unit price of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>0.012</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>type-xxxxxxxx</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDirectSupplyResponseBodyDataModelsCredit build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataModelsCredit self = new GetDirectSupplyResponseBodyDataModelsCredit();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataModelsCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public GetDirectSupplyResponseBodyDataModelsCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public GetDirectSupplyResponseBodyDataModelsCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public GetDirectSupplyResponseBodyDataModelsCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDirectSupplyResponseBodyDataModelsMeta extends TeaModel {
        /**
         * <p>The maximum number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <p>The maximum number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <p>The maximum total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <p>The list of supported input modalities.</p>
         */
        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        /**
         * <p>The list of supported output modalities.</p>
         */
        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static GetDirectSupplyResponseBodyDataModelsMeta build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataModelsMeta self = new GetDirectSupplyResponseBodyDataModelsMeta();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataModelsMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public GetDirectSupplyResponseBodyDataModelsMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public GetDirectSupplyResponseBodyDataModelsMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public GetDirectSupplyResponseBodyDataModelsMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public GetDirectSupplyResponseBodyDataModelsMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class GetDirectSupplyResponseBodyDataModels extends TeaModel {
        /**
         * <p>The list of available invocation paths.</p>
         */
        @NameInMap("availablePaths")
        public java.util.List<GetDirectSupplyResponseBodyDataModelsAvailablePaths> availablePaths;

        /**
         * <p>The billing information of the model.</p>
         */
        @NameInMap("credit")
        public GetDirectSupplyResponseBodyDataModelsCredit credit;

        /**
         * <p>The capabilities and features supported by the model.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nativeStreaming&quot;:true}</p>
         */
        @NameInMap("features")
        public java.util.Map<String, ?> features;

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxxxxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The capability information of the model.</p>
         */
        @NameInMap("meta")
        public GetDirectSupplyResponseBodyDataModelsMeta meta;

        /**
         * <p>The ID of the model card, which starts with msc-.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-xxxxxxxx</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("modelProvider")
        public String modelProvider;

        /**
         * <p>The ID of the model source.</p>
         * 
         * <strong>example:</strong>
         * <p>model-source-xxxxxxxx</p>
         */
        @NameInMap("modelSourceId")
        public String modelSourceId;

        /**
         * <p>The source of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>source-xxxxxxxx</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The last update time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetDirectSupplyResponseBodyDataModels build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyDataModels self = new GetDirectSupplyResponseBodyDataModels();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyDataModels setAvailablePaths(java.util.List<GetDirectSupplyResponseBodyDataModelsAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<GetDirectSupplyResponseBodyDataModelsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public GetDirectSupplyResponseBodyDataModels setCredit(GetDirectSupplyResponseBodyDataModelsCredit credit) {
            this.credit = credit;
            return this;
        }
        public GetDirectSupplyResponseBodyDataModelsCredit getCredit() {
            return this.credit;
        }

        public GetDirectSupplyResponseBodyDataModels setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public GetDirectSupplyResponseBodyDataModels setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetDirectSupplyResponseBodyDataModels setMeta(GetDirectSupplyResponseBodyDataModelsMeta meta) {
            this.meta = meta;
            return this;
        }
        public GetDirectSupplyResponseBodyDataModelsMeta getMeta() {
            return this.meta;
        }

        public GetDirectSupplyResponseBodyDataModels setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public GetDirectSupplyResponseBodyDataModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetDirectSupplyResponseBodyDataModels setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public GetDirectSupplyResponseBodyDataModels setModelSourceId(String modelSourceId) {
            this.modelSourceId = modelSourceId;
            return this;
        }
        public String getModelSourceId() {
            return this.modelSourceId;
        }

        public GetDirectSupplyResponseBodyDataModels setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetDirectSupplyResponseBodyDataModels setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetDirectSupplyResponseBodyData extends TeaModel {
        /**
         * <p>The list of candidate models that can be added to direct supply.</p>
         */
        @NameInMap("candidateModels")
        public java.util.List<GetDirectSupplyResponseBodyDataCandidateModels> candidateModels;

        /**
         * <p>The error message returned when the model catalog query fails. This parameter is not returned when the query succeeds.</p>
         */
        @NameInMap("catalogError")
        public GetDirectSupplyResponseBodyDataCatalogError catalogError;

        /**
         * <p>Indicates whether direct supply is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxxxxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The list of models for which direct supply is enabled.</p>
         */
        @NameInMap("models")
        public java.util.List<GetDirectSupplyResponseBodyDataModels> models;

        public static GetDirectSupplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDirectSupplyResponseBodyData self = new GetDirectSupplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDirectSupplyResponseBodyData setCandidateModels(java.util.List<GetDirectSupplyResponseBodyDataCandidateModels> candidateModels) {
            this.candidateModels = candidateModels;
            return this;
        }
        public java.util.List<GetDirectSupplyResponseBodyDataCandidateModels> getCandidateModels() {
            return this.candidateModels;
        }

        public GetDirectSupplyResponseBodyData setCatalogError(GetDirectSupplyResponseBodyDataCatalogError catalogError) {
            this.catalogError = catalogError;
            return this;
        }
        public GetDirectSupplyResponseBodyDataCatalogError getCatalogError() {
            return this.catalogError;
        }

        public GetDirectSupplyResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDirectSupplyResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetDirectSupplyResponseBodyData setModels(java.util.List<GetDirectSupplyResponseBodyDataModels> models) {
            this.models = models;
            return this;
        }
        public java.util.List<GetDirectSupplyResponseBodyDataModels> getModels() {
            return this.models;
        }

    }

}
