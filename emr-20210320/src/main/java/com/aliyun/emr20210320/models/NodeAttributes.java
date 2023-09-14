// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeAttributes extends TeaModel {
    /**
     * <p>ECS ssh登录秘钥。</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>ECS访问资源绑定的角色。</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>安全组ID。EMR只支持普通安全组，不支持企业安全组。</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>专有网络ID。</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>可用区ID。</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static NodeAttributes build(java.util.Map<String, ?> map) throws Exception {
        NodeAttributes self = new NodeAttributes();
        return TeaModel.build(map, self);
    }

    public NodeAttributes setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public NodeAttributes setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public NodeAttributes setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public NodeAttributes setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public NodeAttributes setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
