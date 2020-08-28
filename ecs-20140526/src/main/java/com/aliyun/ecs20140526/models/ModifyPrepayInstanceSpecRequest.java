// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    @NameInMap("SystemDisk")
    @Validation(required = true)
    public ModifyPrepayInstanceSpecRequestSystemDisk systemDisk;

    @NameInMap("RebootTime")
    public String rebootTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RebootWhenFinished")
    public Boolean rebootWhenFinished;

    public static ModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyPrepayInstanceSpecRequestSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        public static ModifyPrepayInstanceSpecRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestSystemDisk self = new ModifyPrepayInstanceSpecRequestSystemDisk();
            return TeaModel.build(map, self);
        }

    }

}
