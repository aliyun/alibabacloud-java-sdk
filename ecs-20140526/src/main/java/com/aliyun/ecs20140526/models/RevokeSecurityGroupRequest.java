// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("DestCidrIp")
    public String destCidrIp;

    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    @NameInMap("PortRange")
    @Validation(required = true)
    public String portRange;

    @NameInMap("IpProtocol")
    @Validation(required = true)
    public String ipProtocol;

    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    @NameInMap("SourceGroupOwnerId")
    public Long sourceGroupOwnerId;

    @NameInMap("SourceGroupOwnerAccount")
    public String sourceGroupOwnerAccount;

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("NicType")
    public String nicType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    public static RevokeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupRequest self = new RevokeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

}
