// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateTenantRequest extends TeaModel {
    @NameInMap("OwnerAliyunUid")
    public Long ownerAliyunUid;

    @NameInMap("TenantDesc")
    public String tenantDesc;

    @NameInMap("TenantName")
    public String tenantName;

    public static CreateTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantRequest self = new CreateTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantRequest setOwnerAliyunUid(Long ownerAliyunUid) {
        this.ownerAliyunUid = ownerAliyunUid;
        return this;
    }
    public Long getOwnerAliyunUid() {
        return this.ownerAliyunUid;
    }

    public CreateTenantRequest setTenantDesc(String tenantDesc) {
        this.tenantDesc = tenantDesc;
        return this;
    }
    public String getTenantDesc() {
        return this.tenantDesc;
    }

    public CreateTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
