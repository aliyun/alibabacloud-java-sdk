// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class MigrateVmRequest extends TeaModel {
    @NameInMap("GroupUuid")
    public String groupUuid;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Instances")
    public String instances;

    @NameInMap("Tenant")
    public String tenant;

    public static MigrateVmRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateVmRequest self = new MigrateVmRequest();
        return TeaModel.build(map, self);
    }

    public MigrateVmRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public MigrateVmRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public MigrateVmRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

    public MigrateVmRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
