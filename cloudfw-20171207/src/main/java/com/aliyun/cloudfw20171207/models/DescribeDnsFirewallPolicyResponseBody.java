// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDnsFirewallPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Policys")
    public java.util.List<DescribeDnsFirewallPolicyResponseBodyPolicys> policys;

    /**
     * <strong>example:</strong>
     * <p>0A4ACDE9-9F9F-56C1-B3B7-60971BA1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeDnsFirewallPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsFirewallPolicyResponseBody self = new DescribeDnsFirewallPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsFirewallPolicyResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeDnsFirewallPolicyResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsFirewallPolicyResponseBody setPolicys(java.util.List<DescribeDnsFirewallPolicyResponseBodyPolicys> policys) {
        this.policys = policys;
        return this;
    }
    public java.util.List<DescribeDnsFirewallPolicyResponseBodyPolicys> getPolicys() {
        return this.policys;
    }

    public DescribeDnsFirewallPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsFirewallPolicyResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDnsFirewallPolicyResponseBodyPolicys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <strong>example:</strong>
         * <p>01281255-d220-4db1-8f4f-c4df221a****</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>x.x.x.x/32</p>
         */
        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationAddrs")
        public java.util.List<String> destinationAddrs;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("SourceAddrs")
        public java.util.List<String> sourceAddrs;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeDnsFirewallPolicyResponseBodyPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsFirewallPolicyResponseBodyPolicys self = new DescribeDnsFirewallPolicyResponseBodyPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestinationAddrs(java.util.List<String> destinationAddrs) {
            this.destinationAddrs = destinationAddrs;
            return this;
        }
        public java.util.List<String> getDestinationAddrs() {
            return this.destinationAddrs;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSourceAddrs(java.util.List<String> sourceAddrs) {
            this.sourceAddrs = sourceAddrs;
            return this;
        }
        public java.util.List<String> getSourceAddrs() {
            return this.sourceAddrs;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
