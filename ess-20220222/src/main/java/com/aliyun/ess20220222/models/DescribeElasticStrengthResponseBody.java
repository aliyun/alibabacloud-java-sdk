// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeElasticStrengthResponseBody extends TeaModel {
    @NameInMap("ElasticStrengthModels")
    public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModels> elasticStrengthModels;

    /**
     * <strong>example:</strong>
     * <p>73469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourcePools")
    public java.util.List<DescribeElasticStrengthResponseBodyResourcePools> resourcePools;

    /**
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("TotalStrength")
    public Double totalStrength;

    public static DescribeElasticStrengthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticStrengthResponseBody self = new DescribeElasticStrengthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticStrengthResponseBody setElasticStrengthModels(java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModels> elasticStrengthModels) {
        this.elasticStrengthModels = elasticStrengthModels;
        return this;
    }
    public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModels> getElasticStrengthModels() {
        return this.elasticStrengthModels;
    }

    public DescribeElasticStrengthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticStrengthResponseBody setResourcePools(java.util.List<DescribeElasticStrengthResponseBodyResourcePools> resourcePools) {
        this.resourcePools = resourcePools;
        return this;
    }
    public java.util.List<DescribeElasticStrengthResponseBodyResourcePools> getResourcePools() {
        return this.resourcePools;
    }

    public DescribeElasticStrengthResponseBody setTotalStrength(Double totalStrength) {
        this.totalStrength = totalStrength;
        return this;
    }
    public Double getTotalStrength() {
        return this.totalStrength;
    }

    public static class DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InstanceTypesOrDiskTypesNotSupported</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>ecs.r7.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>The instanceTypes or diskTypes are not supported.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Strength")
        public Double strength;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools self = new DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setStrength(Double strength) {
            this.strength = strength;
            return this;
        }
        public Double getStrength() {
            return this.strength;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeElasticStrengthResponseBodyElasticStrengthModels extends TeaModel {
        @NameInMap("ResourcePools")
        public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools> resourcePools;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("TotalStrength")
        public Double totalStrength;

        public static DescribeElasticStrengthResponseBodyElasticStrengthModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyElasticStrengthModels self = new DescribeElasticStrengthResponseBodyElasticStrengthModels();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModels setResourcePools(java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools> resourcePools) {
            this.resourcePools = resourcePools;
            return this;
        }
        public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools> getResourcePools() {
            return this.resourcePools;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModels setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModels setTotalStrength(Double totalStrength) {
            this.totalStrength = totalStrength;
            return this;
        }
        public Double getTotalStrength() {
            return this.totalStrength;
        }

    }

    public static class DescribeElasticStrengthResponseBodyResourcePools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>IMG_NOT_SUPPORTED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>ecs.c7t.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>The instanceType does not support the image in the configuration.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Strength")
        public Double strength;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeElasticStrengthResponseBodyResourcePools build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyResourcePools self = new DescribeElasticStrengthResponseBodyResourcePools();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyResourcePools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setStrength(Double strength) {
            this.strength = strength;
            return this;
        }
        public Double getStrength() {
            return this.strength;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
