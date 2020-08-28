// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponse extends TeaModel {
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
    public DescribeNetworkInterfaceAttributeResponsePrivateIpSets privateIpSets;

    @NameInMap("Ipv6Sets")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseIpv6Sets ipv6Sets;

    @NameInMap("Tags")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseTags tags;

    @NameInMap("AssociatedPublicIp")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp associatedPublicIp;

    @NameInMap("Attachment")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseAttachment attachment;

    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseSecurityGroupIds securityGroupIds;

    public static DescribeNetworkInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeResponse self = new DescribeNetworkInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public String publicIpAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        public static DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("Primary")
        @Validation(required = true)
        public Boolean primary;

        @NameInMap("AssociatedPublicIp")
        @Validation(required = true)
        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        public static DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponsePrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfaceAttributeResponsePrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponsePrivateIpSets self = new DescribeNetworkInterfaceAttributeResponsePrivateIpSets();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public String ipv6Address;

        public static DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set self = new DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfaceAttributeResponseIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseIpv6Sets self = new DescribeNetworkInterfaceAttributeResponseIpv6Sets();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeNetworkInterfaceAttributeResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseTagsTag self = new DescribeNetworkInterfaceAttributeResponseTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfaceAttributeResponseTagsTag> tag;

        public static DescribeNetworkInterfaceAttributeResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseTags self = new DescribeNetworkInterfaceAttributeResponseTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public String publicIpAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        public static DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds extends TeaModel {
        // MemberNetworkInterfaceId
        @NameInMap("MemberNetworkInterfaceId")
        @Validation(required = true)
        public java.util.List<String> memberNetworkInterfaceId;

        public static DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds self = new DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseAttachment extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("TrunkNetworkInterfaceId")
        @Validation(required = true)
        public String trunkNetworkInterfaceId;

        @NameInMap("DeviceIndex")
        @Validation(required = true)
        public Integer deviceIndex;

        @NameInMap("MemberNetworkInterfaceIds")
        @Validation(required = true)
        public DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds;

        public static DescribeNetworkInterfaceAttributeResponseAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseAttachment self = new DescribeNetworkInterfaceAttributeResponseAttachment();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeNetworkInterfaceAttributeResponseSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseSecurityGroupIds self = new DescribeNetworkInterfaceAttributeResponseSecurityGroupIds();
            return TeaModel.build(map, self);
        }

    }

}
