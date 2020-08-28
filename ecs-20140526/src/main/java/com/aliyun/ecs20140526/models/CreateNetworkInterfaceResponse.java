// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("PrivateIpAddress")
    @Validation(required = true)
    public String privateIpAddress;

    @NameInMap("MacAddress")
    @Validation(required = true)
    public String macAddress;

    @NameInMap("NetworkInterfaceName")
    @Validation(required = true)
    public String networkInterfaceName;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("ServiceID")
    @Validation(required = true)
    public Long serviceID;

    @NameInMap("ServiceManaged")
    @Validation(required = true)
    public Boolean serviceManaged;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public String ownerId;

    @NameInMap("PrivateIpSets")
    @Validation(required = true)
    public CreateNetworkInterfaceResponsePrivateIpSets privateIpSets;

    @NameInMap("Tags")
    @Validation(required = true)
    public CreateNetworkInterfaceResponseTags tags;

    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
    public CreateNetworkInterfaceResponseSecurityGroupIds securityGroupIds;

    public static CreateNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponse self = new CreateNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("Primary")
        @Validation(required = true)
        public Boolean primary;

        public static CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet self = new CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkInterfaceResponsePrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        @Validation(required = true)
        public java.util.List<CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet> privateIpSet;

        public static CreateNetworkInterfaceResponsePrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponsePrivateIpSets self = new CreateNetworkInterfaceResponsePrivateIpSets();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkInterfaceResponseTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static CreateNetworkInterfaceResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseTagsTag self = new CreateNetworkInterfaceResponseTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkInterfaceResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<CreateNetworkInterfaceResponseTagsTag> tag;

        public static CreateNetworkInterfaceResponseTags build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseTags self = new CreateNetworkInterfaceResponseTags();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkInterfaceResponseSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static CreateNetworkInterfaceResponseSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseSecurityGroupIds self = new CreateNetworkInterfaceResponseSecurityGroupIds();
            return TeaModel.build(map, self);
        }

    }

}
