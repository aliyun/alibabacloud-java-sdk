// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PreviewLogicalModelUpdateRequest extends TeaModel {
    /**
     * <p>The call strategy, which is required for new Auto write requests. Valid values: balanced, cheap, fast, and quality. The new version uses only the basic call name. Do not submit this parameter for Mapping or Weighted. The server performs conditional validation.</p>
     * 
     * <strong>example:</strong>
     * <p>balanced</p>
     */
    @NameInMap("callStrategy")
    public String callStrategy;

    /**
     * <p>An ordered list of up to 5 fallback targets. The targets are deduplicated by the actual card ID. This can be an empty array.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("fallbackTargets")
    public java.util.List<PreviewLogicalModelUpdateRequestFallbackTargets> fallbackTargets;

    /**
     * <p>The client logical call name. The value can be up to 256 bytes in UTF-8 encoding, must not contain spaces or slashes, and must not start with auto.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-chat</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The response model type. If set to Actual, the public name of the actual model is returned. If set to Logical, the entry name is returned, including SSE.</p>
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
     * <p>The slots configuration, which is submitted only for Auto. Each of the simple, standard, and complex slots requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId. Omit this parameter for Mapping or Weighted.</p>
     */
    @NameInMap("slots")
    public PreviewLogicalModelUpdateRequestSlots slots;

    /**
     * <p>The primary targets. For Mapping, exactly one item is required. For Weighted, the sum of the original relative weights must be greater than 0. For Auto, this must be an empty array.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("targets")
    public java.util.List<PreviewLogicalModelUpdateRequestTargets> targets;

    public static PreviewLogicalModelUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewLogicalModelUpdateRequest self = new PreviewLogicalModelUpdateRequest();
        return TeaModel.build(map, self);
    }

    public PreviewLogicalModelUpdateRequest setCallStrategy(String callStrategy) {
        this.callStrategy = callStrategy;
        return this;
    }
    public String getCallStrategy() {
        return this.callStrategy;
    }

    public PreviewLogicalModelUpdateRequest setFallbackTargets(java.util.List<PreviewLogicalModelUpdateRequestFallbackTargets> fallbackTargets) {
        this.fallbackTargets = fallbackTargets;
        return this;
    }
    public java.util.List<PreviewLogicalModelUpdateRequestFallbackTargets> getFallbackTargets() {
        return this.fallbackTargets;
    }

    public PreviewLogicalModelUpdateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PreviewLogicalModelUpdateRequest setResponseModel(String responseModel) {
        this.responseModel = responseModel;
        return this;
    }
    public String getResponseModel() {
        return this.responseModel;
    }

    public PreviewLogicalModelUpdateRequest setRoutingPolicy(String routingPolicy) {
        this.routingPolicy = routingPolicy;
        return this;
    }
    public String getRoutingPolicy() {
        return this.routingPolicy;
    }

    public PreviewLogicalModelUpdateRequest setSlots(PreviewLogicalModelUpdateRequestSlots slots) {
        this.slots = slots;
        return this;
    }
    public PreviewLogicalModelUpdateRequestSlots getSlots() {
        return this.slots;
    }

    public PreviewLogicalModelUpdateRequest setTargets(java.util.List<PreviewLogicalModelUpdateRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<PreviewLogicalModelUpdateRequestTargets> getTargets() {
        return this.targets;
    }

    public static class PreviewLogicalModelUpdateRequestFallbackTargets extends TeaModel {
        /**
         * <p>The actual source card ID within the same instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static PreviewLogicalModelUpdateRequestFallbackTargets build(java.util.Map<String, ?> map) throws Exception {
            PreviewLogicalModelUpdateRequestFallbackTargets self = new PreviewLogicalModelUpdateRequestFallbackTargets();
            return TeaModel.build(map, self);
        }

        public PreviewLogicalModelUpdateRequestFallbackTargets setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class PreviewLogicalModelUpdateRequestSlotsComplex extends TeaModel {
        /**
         * <p>The actual source card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static PreviewLogicalModelUpdateRequestSlotsComplex build(java.util.Map<String, ?> map) throws Exception {
            PreviewLogicalModelUpdateRequestSlotsComplex self = new PreviewLogicalModelUpdateRequestSlotsComplex();
            return TeaModel.build(map, self);
        }

        public PreviewLogicalModelUpdateRequestSlotsComplex setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class PreviewLogicalModelUpdateRequestSlotsSimple extends TeaModel {
        /**
         * <p>The actual source card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static PreviewLogicalModelUpdateRequestSlotsSimple build(java.util.Map<String, ?> map) throws Exception {
            PreviewLogicalModelUpdateRequestSlotsSimple self = new PreviewLogicalModelUpdateRequestSlotsSimple();
            return TeaModel.build(map, self);
        }

        public PreviewLogicalModelUpdateRequestSlotsSimple setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class PreviewLogicalModelUpdateRequestSlotsStandard extends TeaModel {
        /**
         * <p>The actual source card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        public static PreviewLogicalModelUpdateRequestSlotsStandard build(java.util.Map<String, ?> map) throws Exception {
            PreviewLogicalModelUpdateRequestSlotsStandard self = new PreviewLogicalModelUpdateRequestSlotsStandard();
            return TeaModel.build(map, self);
        }

        public PreviewLogicalModelUpdateRequestSlotsStandard setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

    }

    public static class PreviewLogicalModelUpdateRequestSlots extends TeaModel {
        /**
         * <p>The complex slot, which requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("complex")
        public java.util.List<PreviewLogicalModelUpdateRequestSlotsComplex> complex;

        /**
         * <p>The simple slot, which requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("simple")
        public java.util.List<PreviewLogicalModelUpdateRequestSlotsSimple> simple;

        /**
         * <p>The standard slot, which requires 1 to 3 source cards. Cards across the three slots are globally deduplicated by modelCardId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("standard")
        public java.util.List<PreviewLogicalModelUpdateRequestSlotsStandard> standard;

        public static PreviewLogicalModelUpdateRequestSlots build(java.util.Map<String, ?> map) throws Exception {
            PreviewLogicalModelUpdateRequestSlots self = new PreviewLogicalModelUpdateRequestSlots();
            return TeaModel.build(map, self);
        }

        public PreviewLogicalModelUpdateRequestSlots setComplex(java.util.List<PreviewLogicalModelUpdateRequestSlotsComplex> complex) {
            this.complex = complex;
            return this;
        }
        public java.util.List<PreviewLogicalModelUpdateRequestSlotsComplex> getComplex() {
            return this.complex;
        }

        public PreviewLogicalModelUpdateRequestSlots setSimple(java.util.List<PreviewLogicalModelUpdateRequestSlotsSimple> simple) {
            this.simple = simple;
            return this;
        }
        public java.util.List<PreviewLogicalModelUpdateRequestSlotsSimple> getSimple() {
            return this.simple;
        }

        public PreviewLogicalModelUpdateRequestSlots setStandard(java.util.List<PreviewLogicalModelUpdateRequestSlotsStandard> standard) {
            this.standard = standard;
            return this;
        }
        public java.util.List<PreviewLogicalModelUpdateRequestSlotsStandard> getStandard() {
            return this.standard;
        }

    }

    public static class PreviewLogicalModelUpdateRequestTargets extends TeaModel {
        /**
         * <p>The actual source model card ID within the same instance, which starts with msc-. VM or service overrides are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <p>The weight value. Valid values: integers from 0 to 10000. The original value is preserved. For Mapping, 0 is allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static PreviewLogicalModelUpdateRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            PreviewLogicalModelUpdateRequestTargets self = new PreviewLogicalModelUpdateRequestTargets();
            return TeaModel.build(map, self);
        }

        public PreviewLogicalModelUpdateRequestTargets setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public PreviewLogicalModelUpdateRequestTargets setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
