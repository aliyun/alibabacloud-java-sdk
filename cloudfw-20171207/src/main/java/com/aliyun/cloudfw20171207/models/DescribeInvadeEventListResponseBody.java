// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of breach awareness events.</p>
     */
    @NameInMap("EventList")
    public java.util.List<DescribeInvadeEventListResponseBodyEventList> eventList;

    /**
     * <p>The percentage of high-risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("HighLevelPercent")
    public Integer highLevelPercent;

    /**
     * <p>The percentage of low-risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("LowLevelPercent")
    public Integer lowLevelPercent;

    /**
     * <p>The percentage of medium-risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MiddleLevelPercent")
    public Integer middleLevelPercent;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeInvadeEventListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
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
        /**
         * <p>The ID of the affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-ECS****</p>
         */
        @NameInMap("AssetsInstanceId")
        public String assetsInstanceId;

        /**
         * <p>The name of the affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_test</p>
         */
        @NameInMap("AssetsInstanceName")
        public String assetsInstanceName;

        /**
         * <p>The type of the affected asset. Valid values:</p>
         * <ul>
         * <li><strong>BastionHostIP</strong>: the egress IP address of a bastion host</li>
         * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
         * <li><strong>EcsEIP</strong>: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</li>
         * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
         * <li><strong>EIP</strong>: the EIP</li>
         * <li><strong>EniEIP</strong>: the EIP of an elastic network interface (ENI)</li>
         * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
         * <li><strong>SlbEIP</strong>: the EIP of a Server Load Balancer (SLB) instance</li>
         * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance</li>
         * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
         * <li><strong>HAVIP</strong>: the high-availability virtual IP address (HAVIP)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIp</p>
         */
        @NameInMap("AssetsType")
        public String assetsType;

        /**
         * <p>The ID of the breach awareness event.</p>
         * 
         * <strong>example:</strong>
         * <p>69d189e2-ec17-4676-a2fe-02969234****</p>
         */
        @NameInMap("EventKey")
        public String eventKey;

        /**
         * <p>The name of the breach awareness event.</p>
         * 
         * <strong>example:</strong>
         * <p>event_test</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The type of the breach awareness event. Valid values:</p>
         * <ul>
         * <li><strong>IPS</strong>: intrusion prevention event</li>
         * <li><strong>offline</strong>: disconnection event</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPS</p>
         */
        @NameInMap("EventSrc")
        public String eventSrc;

        /**
         * <p>The UUID of the breach awareness event.</p>
         * 
         * <strong>example:</strong>
         * <p>fadd-dfdd-****</p>
         */
        @NameInMap("EventUuid")
        public String eventUuid;

        /**
         * <p>The time when the breach awareness event first occurred. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656750960</p>
         */
        @NameInMap("FirstTime")
        public Integer firstTime;

        /**
         * <p>Indicates whether the breach awareness event is ignored. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The breach awareness event is ignored.</li>
         * <li><strong>false</strong>: The breach awareness event is not ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsIgnore")
        public Boolean isIgnore;

        /**
         * <p>The time when the breach awareness event last occurred. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656837360</p>
         */
        @NameInMap("LastTime")
        public Integer lastTime;

        /**
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>135809047715****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The private IP address of the affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrivateIP")
        public String privateIP;

        /**
         * <p>The handling status of the breach awareness event. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled</li>
         * <li><strong>20</strong>: handled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ProcessStatus")
        public Integer processStatus;

        /**
         * <p>The public IP address of the affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>198.51.XX.XX</p>
         */
        @NameInMap("PublicIP")
        public String publicIP;

        /**
         * <p>The type of the affected asset. Valid values:</p>
         * <ul>
         * <li><strong>BastionHostIP</strong>: the egress IP address of a bastion host</li>
         * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
         * <li><strong>EcsEIP</strong>: the EIP of an ECS instance</li>
         * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
         * <li><strong>EIP</strong>: the EIP</li>
         * <li><strong>EniEIP</strong>: the EIP of an ENI</li>
         * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
         * <li><strong>SlbEIP</strong>: the EIP of an SLB instance</li>
         * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance</li>
         * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
         * <li><strong>HAVIP</strong>: the HAVIP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIp</p>
         */
        @NameInMap("PublicIpType")
        public String publicIpType;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low</li>
         * <li><strong>2</strong>: medium</li>
         * <li><strong>3</strong>: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of breach awareness events.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
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
