// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ReservedInstanceId")
    @Validation(required = true)
    public java.util.List<String> reservedInstanceId;

    @NameInMap("Configuration")
    public java.util.List<ModifyReservedInstancesRequestConfiguration> configuration;

    public static ModifyReservedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstancesRequest self = new ModifyReservedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyReservedInstancesRequestConfiguration extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ReservedInstanceName")
        @Validation(required = true)
        public String reservedInstanceName;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("Scope")
        @Validation(required = true)
        public String scope;

        @NameInMap("InstanceAmount")
        @Validation(required = true)
        public Integer instanceAmount;

        public static ModifyReservedInstancesRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ModifyReservedInstancesRequestConfiguration self = new ModifyReservedInstancesRequestConfiguration();
            return TeaModel.build(map, self);
        }

    }

}
