// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("NetworkInterfaceSets")
    @Validation(required = true)
    public DescribeNetworkInterfacesResponseNetworkInterfaceSets networkInterfaceSets;

    public static DescribeNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesResponse self = new DescribeNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public String publicIpAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("Primary")
        @Validation(required = true)
        public Boolean primary;

        @NameInMap("AssociatedPublicIp")
        @Validation(required = true)
        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public String ipv6Address;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTagsTag self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTagsTag> tag;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTags self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public String publicIpAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAttachment extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("TrunkNetworkInterfaceId")
        @Validation(required = true)
        public String trunkNetworkInterfaceId;

        @NameInMap("DeviceIndex")
        @Validation(required = true)
        public Integer deviceIndex;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAttachment self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAttachment();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds extends TeaModel {
        // SecurityGroupId
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet extends TeaModel {
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

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("ServiceID")
        @Validation(required = true)
        public Long serviceID;

        @NameInMap("ServiceManaged")
        @Validation(required = true)
        public Boolean serviceManaged;

        @NameInMap("QueueNumber")
        @Validation(required = true)
        public Integer queueNumber;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("PrivateIpSets")
        @Validation(required = true)
        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets privateIpSets;

        @NameInMap("Ipv6Sets")
        @Validation(required = true)
        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets ipv6Sets;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetTags tags;

        @NameInMap("AssociatedPublicIp")
        @Validation(required = true)
        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("Attachment")
        @Validation(required = true)
        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetAttachment attachment;

        @NameInMap("SecurityGroupIds")
        @Validation(required = true)
        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds securityGroupIds;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSets self = new DescribeNetworkInterfacesResponseNetworkInterfaceSets();
            return TeaModel.build(map, self);
        }

    }

}
