// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribevSphereInventoriesRequest extends TeaModel {
    @NameInMap("InfrastructureId")
    public String infrastructureId;

    @NameInMap("Path")
    public String path;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Type")
    public String type;

    public static DescribevSphereInventoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribevSphereInventoriesRequest self = new DescribevSphereInventoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribevSphereInventoriesRequest setInfrastructureId(String infrastructureId) {
        this.infrastructureId = infrastructureId;
        return this;
    }
    public String getInfrastructureId() {
        return this.infrastructureId;
    }

    public DescribevSphereInventoriesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribevSphereInventoriesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribevSphereInventoriesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
