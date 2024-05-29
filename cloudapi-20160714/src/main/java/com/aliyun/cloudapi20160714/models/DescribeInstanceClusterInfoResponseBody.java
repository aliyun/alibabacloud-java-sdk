// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceClusterInfoResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceClusterAttribute")
    public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute instanceClusterAttribute;

    @NameInMap("InstanceClusterId")
    public String instanceClusterId;

    @NameInMap("InstanceClusterName")
    public String instanceClusterName;

    @NameInMap("InstanceClusterStatus")
    public String instanceClusterStatus;

    @NameInMap("InstanceClusterType")
    public String instanceClusterType;

    @NameInMap("InstanceClusterVersion")
    public String instanceClusterVersion;

    @NameInMap("InstanceList")
    public DescribeInstanceClusterInfoResponseBodyInstanceList instanceList;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceClusterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceClusterInfoResponseBody self = new DescribeInstanceClusterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceClusterInfoResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeInstanceClusterInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterAttribute(DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute instanceClusterAttribute) {
        this.instanceClusterAttribute = instanceClusterAttribute;
        return this;
    }
    public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute getInstanceClusterAttribute() {
        return this.instanceClusterAttribute;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterId(String instanceClusterId) {
        this.instanceClusterId = instanceClusterId;
        return this;
    }
    public String getInstanceClusterId() {
        return this.instanceClusterId;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterName(String instanceClusterName) {
        this.instanceClusterName = instanceClusterName;
        return this;
    }
    public String getInstanceClusterName() {
        return this.instanceClusterName;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterStatus(String instanceClusterStatus) {
        this.instanceClusterStatus = instanceClusterStatus;
        return this;
    }
    public String getInstanceClusterStatus() {
        return this.instanceClusterStatus;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterType(String instanceClusterType) {
        this.instanceClusterType = instanceClusterType;
        return this;
    }
    public String getInstanceClusterType() {
        return this.instanceClusterType;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceClusterVersion(String instanceClusterVersion) {
        this.instanceClusterVersion = instanceClusterVersion;
        return this;
    }
    public String getInstanceClusterVersion() {
        return this.instanceClusterVersion;
    }

    public DescribeInstanceClusterInfoResponseBody setInstanceList(DescribeInstanceClusterInfoResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public DescribeInstanceClusterInfoResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
    }

    public DescribeInstanceClusterInfoResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeInstanceClusterInfoResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceClusterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute extends TeaModel {
        @NameInMap("ConnectCidrBlocks")
        public String connectCidrBlocks;

        @NameInMap("ConnectVpcId")
        public String connectVpcId;

        @NameInMap("EgressIpv6Enable")
        public Boolean egressIpv6Enable;

        @NameInMap("HttpsPolicies")
        public String httpsPolicies;

        @NameInMap("IPV4AclId")
        public String IPV4AclId;

        @NameInMap("IPV4AclName")
        public String IPV4AclName;

        @NameInMap("IPV4AclStatus")
        public String IPV4AclStatus;

        @NameInMap("IPV4AclType")
        public String IPV4AclType;

        @NameInMap("IPV6AclId")
        public String IPV6AclId;

        @NameInMap("IPV6AclName")
        public String IPV6AclName;

        @NameInMap("IPV6AclStatus")
        public String IPV6AclStatus;

        @NameInMap("IPV6AclType")
        public String IPV6AclType;

        @NameInMap("InternetEgressAddress")
        public String internetEgressAddress;

        @NameInMap("IntranetEgressAddress")
        public String intranetEgressAddress;

        @NameInMap("IntranetSegments")
        public String intranetSegments;

        @NameInMap("SupportIpv6")
        public Boolean supportIpv6;

        @NameInMap("UserVpcId")
        public String userVpcId;

        @NameInMap("UserVswitchId")
        public String userVswitchId;

        @NameInMap("VipTypeList")
        public String vipTypeList;

        @NameInMap("VpcIntranetEnable")
        public Boolean vpcIntranetEnable;

        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        @NameInMap("VpcSlbIntranetEnable")
        public Boolean vpcSlbIntranetEnable;

        public static DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute self = new DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setConnectCidrBlocks(String connectCidrBlocks) {
            this.connectCidrBlocks = connectCidrBlocks;
            return this;
        }
        public String getConnectCidrBlocks() {
            return this.connectCidrBlocks;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setConnectVpcId(String connectVpcId) {
            this.connectVpcId = connectVpcId;
            return this;
        }
        public String getConnectVpcId() {
            return this.connectVpcId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setEgressIpv6Enable(Boolean egressIpv6Enable) {
            this.egressIpv6Enable = egressIpv6Enable;
            return this;
        }
        public Boolean getEgressIpv6Enable() {
            return this.egressIpv6Enable;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setHttpsPolicies(String httpsPolicies) {
            this.httpsPolicies = httpsPolicies;
            return this;
        }
        public String getHttpsPolicies() {
            return this.httpsPolicies;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclId(String IPV4AclId) {
            this.IPV4AclId = IPV4AclId;
            return this;
        }
        public String getIPV4AclId() {
            return this.IPV4AclId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclName(String IPV4AclName) {
            this.IPV4AclName = IPV4AclName;
            return this;
        }
        public String getIPV4AclName() {
            return this.IPV4AclName;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclStatus(String IPV4AclStatus) {
            this.IPV4AclStatus = IPV4AclStatus;
            return this;
        }
        public String getIPV4AclStatus() {
            return this.IPV4AclStatus;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV4AclType(String IPV4AclType) {
            this.IPV4AclType = IPV4AclType;
            return this;
        }
        public String getIPV4AclType() {
            return this.IPV4AclType;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclId(String IPV6AclId) {
            this.IPV6AclId = IPV6AclId;
            return this;
        }
        public String getIPV6AclId() {
            return this.IPV6AclId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclName(String IPV6AclName) {
            this.IPV6AclName = IPV6AclName;
            return this;
        }
        public String getIPV6AclName() {
            return this.IPV6AclName;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclStatus(String IPV6AclStatus) {
            this.IPV6AclStatus = IPV6AclStatus;
            return this;
        }
        public String getIPV6AclStatus() {
            return this.IPV6AclStatus;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIPV6AclType(String IPV6AclType) {
            this.IPV6AclType = IPV6AclType;
            return this;
        }
        public String getIPV6AclType() {
            return this.IPV6AclType;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setInternetEgressAddress(String internetEgressAddress) {
            this.internetEgressAddress = internetEgressAddress;
            return this;
        }
        public String getInternetEgressAddress() {
            return this.internetEgressAddress;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIntranetEgressAddress(String intranetEgressAddress) {
            this.intranetEgressAddress = intranetEgressAddress;
            return this;
        }
        public String getIntranetEgressAddress() {
            return this.intranetEgressAddress;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setIntranetSegments(String intranetSegments) {
            this.intranetSegments = intranetSegments;
            return this;
        }
        public String getIntranetSegments() {
            return this.intranetSegments;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setSupportIpv6(Boolean supportIpv6) {
            this.supportIpv6 = supportIpv6;
            return this;
        }
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setUserVpcId(String userVpcId) {
            this.userVpcId = userVpcId;
            return this;
        }
        public String getUserVpcId() {
            return this.userVpcId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setUserVswitchId(String userVswitchId) {
            this.userVswitchId = userVswitchId;
            return this;
        }
        public String getUserVswitchId() {
            return this.userVswitchId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVipTypeList(String vipTypeList) {
            this.vipTypeList = vipTypeList;
            return this;
        }
        public String getVipTypeList() {
            return this.vipTypeList;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVpcIntranetEnable(Boolean vpcIntranetEnable) {
            this.vpcIntranetEnable = vpcIntranetEnable;
            return this;
        }
        public Boolean getVpcIntranetEnable() {
            return this.vpcIntranetEnable;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVpcOwnerId(Long vpcOwnerId) {
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceClusterAttribute setVpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
            this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
            return this;
        }
        public Boolean getVpcSlbIntranetEnable() {
            return this.vpcSlbIntranetEnable;
        }

    }

    public static class DescribeInstanceClusterInfoResponseBodyInstanceListInstance extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Status")
        public String status;

        public static DescribeInstanceClusterInfoResponseBodyInstanceListInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterInfoResponseBodyInstanceListInstance self = new DescribeInstanceClusterInfoResponseBodyInstanceListInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceListInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInstanceClusterInfoResponseBodyInstanceList extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstanceClusterInfoResponseBodyInstanceListInstance> instance;

        public static DescribeInstanceClusterInfoResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterInfoResponseBodyInstanceList self = new DescribeInstanceClusterInfoResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterInfoResponseBodyInstanceList setInstance(java.util.List<DescribeInstanceClusterInfoResponseBodyInstanceListInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstanceClusterInfoResponseBodyInstanceListInstance> getInstance() {
            return this.instance;
        }

    }

}
