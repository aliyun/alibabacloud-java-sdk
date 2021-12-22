// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVmAndSaveStockRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("GroupUuid")
    public String groupUuid;

    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    @NameInMap("Tenant")
    public String tenant;

    @NameInMap("WorkloadUuid")
    public String workloadUuid;

    public static CreateVmAndSaveStockRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVmAndSaveStockRequest self = new CreateVmAndSaveStockRequest();
        return TeaModel.build(map, self);
    }

    public CreateVmAndSaveStockRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CreateVmAndSaveStockRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public CreateVmAndSaveStockRequest setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public CreateVmAndSaveStockRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateVmAndSaveStockRequest setWorkloadUuid(String workloadUuid) {
        this.workloadUuid = workloadUuid;
        return this;
    }
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

}
