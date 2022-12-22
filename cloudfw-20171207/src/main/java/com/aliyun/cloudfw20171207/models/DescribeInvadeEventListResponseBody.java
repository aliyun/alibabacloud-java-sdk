// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventListResponseBody extends TeaModel {
    // An array that consists of breach awareness events.
    @NameInMap("EventList")
    public java.util.List<DescribeInvadeEventListResponseBodyEventList> eventList;

    // The ratio of high-risk events.
    @NameInMap("HighLevelPercent")
    public Integer highLevelPercent;

    // The ratio of low-risk events.
    @NameInMap("LowLevelPercent")
    public Integer lowLevelPercent;

    // The ratio of medium-risk events.
    @NameInMap("MiddleLevelPercent")
    public Integer middleLevelPercent;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeInvadeEventListResponseBodyPageInfo pageInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvadeEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventListResponseBody self = new DescribeInvadeEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventListResponseBody setEventList(java.util.List<DescribeInvadeEventListResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<DescribeInvadeEventListResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public DescribeInvadeEventListResponseBody setHighLevelPercent(Integer highLevelPercent) {
        this.highLevelPercent = highLevelPercent;
        return this;
    }
    public Integer getHighLevelPercent() {
        return this.highLevelPercent;
    }

    public DescribeInvadeEventListResponseBody setLowLevelPercent(Integer lowLevelPercent) {
        this.lowLevelPercent = lowLevelPercent;
        return this;
    }
    public Integer getLowLevelPercent() {
        return this.lowLevelPercent;
    }

    public DescribeInvadeEventListResponseBody setMiddleLevelPercent(Integer middleLevelPercent) {
        this.middleLevelPercent = middleLevelPercent;
        return this;
    }
    public Integer getMiddleLevelPercent() {
        return this.middleLevelPercent;
    }

    public DescribeInvadeEventListResponseBody setPageInfo(DescribeInvadeEventListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInvadeEventListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInvadeEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvadeEventListResponseBodyEventList extends TeaModel {
        // The ID of the affected asset.
        @NameInMap("AssetsInstanceId")
        public String assetsInstanceId;

        // The name of the affected asset.
        @NameInMap("AssetsInstanceName")
        public String assetsInstanceName;

        // The type of the affected asset. Valid values:
        // 
        // * **BastionHostIP**: the egress IP address of a bastion host
        // * **BastionHostIngressIP**: the ingress IP address of a bastion host
        // * **EcsEIP**: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance
        // * **EcsPublicIP**: the public IP address of an ECS instance
        // * **EIP**: the EIP
        // * **EniEIP**: the EIP of an elastic network interface (ENI)
        // * **NatEIP**: the EIP of a NAT gateway
        // * **SlbEIP**: the EIP of a Server Load Balancer (SLB) instance
        // * **SlbPublicIP**: the public IP address of an SLB instance
        // * **NatPublicIP**: the public IP address of a NAT gateway
        // * **HAVIP**: the high-availability virtual IP address (HAVIP)
        @NameInMap("AssetsType")
        public String assetsType;

        // The ID of the breach awareness event.
        @NameInMap("EventKey")
        public String eventKey;

        // The name of the breach awareness event.
        @NameInMap("EventName")
        public String eventName;

        // The type of the breach awareness event. Valid values:
        // 
        // *   **IPS**: intrusion prevention event
        // *   **offline**: disconnection event
        @NameInMap("EventSrc")
        public String eventSrc;

        // The UUID of the breach awareness event.
        @NameInMap("EventUuid")
        public String eventUuid;

        // The time when the breach awareness event first occurred. The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("FirstTime")
        public Integer firstTime;

        // Indicates whether the breach awareness event is ignored. Valid values:
        // 
        // *   **true**: The breach awareness event is ignored.
        // *   **false**: The breach awareness event is not ignored.
        @NameInMap("IsIgnore")
        public Boolean isIgnore;

        // The time when the breach awareness event last occurred. The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("LastTime")
        public Integer lastTime;

        // The ID of the member.
        @NameInMap("MemberUid")
        public String memberUid;

        // The private IP address of the affected asset.
        @NameInMap("PrivateIP")
        public String privateIP;

        // The handling status of the breach awareness event. Valid values:
        // 
        // *   **0**: unhandled
        // *   **20**: handled
        @NameInMap("ProcessStatus")
        public Integer processStatus;

        // The public IP address of the affected asset.
        @NameInMap("PublicIP")
        public String publicIP;

        // The type of the affected asset. Valid values:
        // 
        // * **BastionHostIP**: the egress IP address of a bastion host
        // * **BastionHostIngressIP**: the ingress IP address of a bastion host
        // * **EcsEIP**: the EIP of an ECS instance
        // * **EcsPublicIP**: the public IP address of an ECS instance
        // * **EIP**: the EIP
        // * **EniEIP**: the EIP of an ENI
        // * **NatEIP**: the EIP of a NAT gateway
        // * **SlbEIP**: the EIP of an SLB instance
        // * **SlbPublicIP**: the public IP address of an SLB instance
        // * **NatPublicIP**: the public IP address of a NAT gateway
        // * **HAVIP**: the HAVIP
        @NameInMap("PublicIpType")
        public String publicIpType;

        // The risk level. Valid values:
        // 
        // *   **1**: low
        // *   **2**: medium
        // *   **3**: high
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static DescribeInvadeEventListResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEventListResponseBodyEventList self = new DescribeInvadeEventListResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEventListResponseBodyEventList setAssetsInstanceId(String assetsInstanceId) {
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }
        public String getAssetsInstanceId() {
            return this.assetsInstanceId;
        }

        public DescribeInvadeEventListResponseBodyEventList setAssetsInstanceName(String assetsInstanceName) {
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }
        public String getAssetsInstanceName() {
            return this.assetsInstanceName;
        }

        public DescribeInvadeEventListResponseBodyEventList setAssetsType(String assetsType) {
            this.assetsType = assetsType;
            return this;
        }
        public String getAssetsType() {
            return this.assetsType;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }
        public String getEventKey() {
            return this.eventKey;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventSrc(String eventSrc) {
            this.eventSrc = eventSrc;
            return this;
        }
        public String getEventSrc() {
            return this.eventSrc;
        }

        public DescribeInvadeEventListResponseBodyEventList setEventUuid(String eventUuid) {
            this.eventUuid = eventUuid;
            return this;
        }
        public String getEventUuid() {
            return this.eventUuid;
        }

        public DescribeInvadeEventListResponseBodyEventList setFirstTime(Integer firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Integer getFirstTime() {
            return this.firstTime;
        }

        public DescribeInvadeEventListResponseBodyEventList setIsIgnore(Boolean isIgnore) {
            this.isIgnore = isIgnore;
            return this;
        }
        public Boolean getIsIgnore() {
            return this.isIgnore;
        }

        public DescribeInvadeEventListResponseBodyEventList setLastTime(Integer lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Integer getLastTime() {
            return this.lastTime;
        }

        public DescribeInvadeEventListResponseBodyEventList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeInvadeEventListResponseBodyEventList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public DescribeInvadeEventListResponseBodyEventList setProcessStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        public DescribeInvadeEventListResponseBodyEventList setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public DescribeInvadeEventListResponseBodyEventList setPublicIpType(String publicIpType) {
            this.publicIpType = publicIpType;
            return this;
        }
        public String getPublicIpType() {
            return this.publicIpType;
        }

        public DescribeInvadeEventListResponseBodyEventList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeInvadeEventListResponseBodyPageInfo extends TeaModel {
        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of breach awareness events.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInvadeEventListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEventListResponseBodyPageInfo self = new DescribeInvadeEventListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEventListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInvadeEventListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInvadeEventListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
