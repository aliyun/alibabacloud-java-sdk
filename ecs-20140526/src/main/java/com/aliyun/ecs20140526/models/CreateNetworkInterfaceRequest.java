// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<CreateNetworkInterfaceRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Visible")
    public Boolean visible;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceRequest self = new CreateNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateNetworkInterfaceRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateNetworkInterfaceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceRequestTag self = new CreateNetworkInterfaceRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
