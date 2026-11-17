// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateLogicalModelRequest extends TeaModel {
    /**
     * <p>The call strategy. This parameter is required for new Auto write requests. Valid values: balanced, cheap, fast, and quality. The new version uses only the basic invocation name. Do not submit this parameter for Mapping and Weighted. The server performs conditional validation.</p>
     * 
     * <strong>example:</strong>
     * <p>balanced</p>
     */
    @NameInMap("callStrategy")
    public String callStrategy;

    /**
     * <p>The ordered fallback targets. A maximum of 5 targets are supported. The targets are deduplicated by the actual card ID. This can be an empty array.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("fallbackTargets")
    public java.util.List<UpdateLogicalModelRequestFallbackTargets> fallbackTargets;

    /**
     * <p>The client logical invocation name. It must be encoded in UTF-8 and can be up to 256 bytes in length. It cannot contain spaces or slashes, and cannot start with auto.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-chat</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The response model. If set to Actual, the public name of the actual model is returned. If set to Logical, the entry name is returned, including Server-Sent Events (SSE).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Actual</p>
     */
    @NameInMap("responseModel")
    public String responseModel;

    /**
     * <p>The routing policy. Valid values: Mapping, Weighted, and Auto. If you set this parameter to Auto, targets must be an empty array and slots is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Weighted</p>
     */
    @NameInMap("routingPolicy")
    public String routingPolicy;

    /**
     * <p>The slots. This parameter is submitted only for Auto. Each of the simple, standard, and complex slots requires 1 to 3 source cards. The three slots are globally deduplicated by modelCardId. Omit this parameter for Mapping and Weighted.</p>
     */
    @NameInMap("slots")
    public UpdateLogicalModelRequestSlots slots;

    /**
     * <p>The primary targets. For Mapping, exactly one item is allowed. For Weighted, the sum of original relative weights must be greater than 0. For Auto, this must be an empty array.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("targets")
    public java.util.List<UpdateLogicalModelRequestTargets> targets;

    /**
     * <p>The confirmation token returned by the configuration update dry run. Pass this token as is when you submit the update.</p>
     * 
     * <strong>example:</strong>
     * <p>6b8e7d61b3a94c7285cf0d9ee1a72c836b8e7d61b3a94c7285cf0d9ee1a72c83</p>
     */
    @NameInMap("confirmationToken")
    public String confirmationToken;

    /**
     * <p>The expected configuration revision number. Use the revision returned by the most recent query or dry run.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedRevision")
    public Long expectedRevision;

    public static UpdateLogicalModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogicalModelRequest self = new UpdateLogicalModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogicalModelRequest setCallStrategy(String callStrategy) {
        this.callStrategy = callStrategy;
        return this;
    }
    public String getCallStrategy() {
        return this.callStrategy;
    }

    public UpdateLogicalModelRequest setFallbackTargets(java.util.List<UpdateLogicalModelRequestFallbackTargets> fallbackTargets) {
        this.fallbackTargets = fallbackTargets;
        return this;
    }
    public java.util.List<UpdateLogicalModelRequestFallbackTargets> getFallbackTargets() {
        return this.fallbackTargets;
    }

    public UpdateLogicalModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLogicalModelRequest setResponseModel(String responseModel) {
        this.responseModel = responseModel;
        return this;
    }
    public String getResponseModel() {
        return this.responseModel;
    }

    public UpdateLogicalModelRequest setRoutingPolicy(String routingPolicy) {
        this.routingPolicy = routingPolicy;
        return this;
    }
    public String getRoutingPolicy() {
        return this.routingPolicy;
    }

    public UpdateLogicalModelRequest setSlots(UpdateLogicalModelRequestSlots slots) {
        this.slots = slots;
        return this;
    }
    public UpdateLogicalModelRequestSlots getSlots() {
        return this.slots;
    }

    public UpdateLogicalModelRequest setTargets(java.util.List<UpdateLogicalModelRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<UpdateLogicalModelRequestTargets> getTargets() {
        return this.targets;
    }

    public UpdateLogicalModelRequest setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
        return this;
    }
    public String getConfirmationToken() {
        return this.confirmationToken;
    }

    public UpdateLogicalModelRequest setExpectedRevision(Long expectedRevision) {
        this.expectedRevision = expectedRevision;
        return this;
    }
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }

    public static class UpdateLogicalModelRequestFallbackTargets extends TeaModel {
        /**
         * <p>The ID of the actual source card in the same instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static UpdateLogicalModelRequestFallbackTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogicalModelRequestFallbackTargets self = new UpdateLogicalModelRequestFallbackTargets();
            return TeaModel.build(map, self);
        }

        public UpdateLogicalModelRequestFallbackTargets setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class UpdateLogicalModelRequestSlotsComplex extends TeaModel {
        /**
         * <p>The ID of the actual source card in the same instance. The ID starts with msc-. VMs or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static UpdateLogicalModelRequestSlotsComplex build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogicalModelRequestSlotsComplex self = new UpdateLogicalModelRequestSlotsComplex();
            return TeaModel.build(map, self);
        }

        public UpdateLogicalModelRequestSlotsComplex setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class UpdateLogicalModelRequestSlotsSimple extends TeaModel {
        /**
         * <p>The ID of the actual source card in the same instance. The ID starts with msc-. VMs or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static UpdateLogicalModelRequestSlotsSimple build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogicalModelRequestSlotsSimple self = new UpdateLogicalModelRequestSlotsSimple();
            return TeaModel.build(map, self);
        }

        public UpdateLogicalModelRequestSlotsSimple setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class UpdateLogicalModelRequestSlotsStandard extends TeaModel {
        /**
         * <p>The ID of the actual source card in the same instance. The ID starts with msc-. VMs or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static UpdateLogicalModelRequestSlotsStandard build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogicalModelRequestSlotsStandard self = new UpdateLogicalModelRequestSlotsStandard();
            return TeaModel.build(map, self);
        }

        public UpdateLogicalModelRequestSlotsStandard setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class UpdateLogicalModelRequestSlots extends TeaModel {
        /**
         * <p>The complex slot. It requires 1 to 3 source cards. The three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("complex")
        public java.util.List<UpdateLogicalModelRequestSlotsComplex> complex;

        /**
         * <p>The simple slot. It requires 1 to 3 source cards. The three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("simple")
        public java.util.List<UpdateLogicalModelRequestSlotsSimple> simple;

        /**
         * <p>The standard slot. It requires 1 to 3 source cards. The three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("standard")
        public java.util.List<UpdateLogicalModelRequestSlotsStandard> standard;

        public static UpdateLogicalModelRequestSlots build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogicalModelRequestSlots self = new UpdateLogicalModelRequestSlots();
            return TeaModel.build(map, self);
        }

        public UpdateLogicalModelRequestSlots setComplex(java.util.List<UpdateLogicalModelRequestSlotsComplex> complex) {
            this.complex = complex;
            return this;
        }
        public java.util.List<UpdateLogicalModelRequestSlotsComplex> getComplex() {
            return this.complex;
        }

        public UpdateLogicalModelRequestSlots setSimple(java.util.List<UpdateLogicalModelRequestSlotsSimple> simple) {
            this.simple = simple;
            return this;
        }
        public java.util.List<UpdateLogicalModelRequestSlotsSimple> getSimple() {
            return this.simple;
        }

        public UpdateLogicalModelRequestSlots setStandard(java.util.List<UpdateLogicalModelRequestSlotsStandard> standard) {
            this.standard = standard;
            return this;
        }
        public java.util.List<UpdateLogicalModelRequestSlotsStandard> getStandard() {
            return this.standard;
        }

    }

    public static class UpdateLogicalModelRequestTargets extends TeaModel {
        /**
         * <p>The ID of the actual source model card in the same instance. The ID starts with msc-. VMs or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <p>The weight. Valid values: integers from 0 to 10000. The original value is preserved. For Mapping, 0 is allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static UpdateLogicalModelRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogicalModelRequestTargets self = new UpdateLogicalModelRequestTargets();
            return TeaModel.build(map, self);
        }

        public UpdateLogicalModelRequestTargets setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public UpdateLogicalModelRequestTargets setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
