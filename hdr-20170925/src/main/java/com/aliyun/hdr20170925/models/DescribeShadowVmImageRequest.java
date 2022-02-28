// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeShadowVmImageRequest extends TeaModel {
    @NameInMap("DeploymentRegionId")
    public String deploymentRegionId;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static DescribeShadowVmImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeShadowVmImageRequest self = new DescribeShadowVmImageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeShadowVmImageRequest setDeploymentRegionId(String deploymentRegionId) {
        this.deploymentRegionId = deploymentRegionId;
        return this;
    }
    public String getDeploymentRegionId() {
        return this.deploymentRegionId;
    }

    public DescribeShadowVmImageRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeShadowVmImageRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeShadowVmImageRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
