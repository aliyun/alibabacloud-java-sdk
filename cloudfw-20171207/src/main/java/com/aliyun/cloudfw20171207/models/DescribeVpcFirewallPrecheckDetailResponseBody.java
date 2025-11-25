// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPrecheckDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsFound")
    public Boolean isFound;

    @NameInMap("PrecheckDetail")
    public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail precheckDetail;

    /**
     * <strong>example:</strong>
     * <p>4FB718F0-CC04-5A12-B17B-188CFC3F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVpcFirewallPrecheckDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallPrecheckDetailResponseBody self = new DescribeVpcFirewallPrecheckDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallPrecheckDetailResponseBody setIsFound(Boolean isFound) {
        this.isFound = isFound;
        return this;
    }
    public Boolean getIsFound() {
        return this.isFound;
    }

    public DescribeVpcFirewallPrecheckDetailResponseBody setPrecheckDetail(DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail precheckDetail) {
        this.precheckDetail = precheckDetail;
        return this;
    }
    public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail getPrecheckDetail() {
        return this.precheckDetail;
    }

    public DescribeVpcFirewallPrecheckDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities extends TeaModel {
        @NameInMap("Info")
        public String info;

        /**
         * <strong>example:</strong>
         * <p>Precheck test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>passed</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Suggestion")
        public String suggestion;

        public static DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities self = new DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailedCount")
        public Integer failedCount;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PrecheckEntities")
        public java.util.List<DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities> precheckEntities;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("PrecheckEntityGroupStatus")
        public String precheckEntityGroupStatus;

        public static DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups self = new DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setPrecheckEntities(java.util.List<DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities> precheckEntities) {
            this.precheckEntities = precheckEntities;
            return this;
        }
        public java.util.List<DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities> getPrecheckEntities() {
            return this.precheckEntities;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setPrecheckEntityGroupStatus(String precheckEntityGroupStatus) {
            this.precheckEntityGroupStatus = precheckEntityGroupStatus;
            return this;
        }
        public String getPrecheckEntityGroupStatus() {
            return this.precheckEntityGroupStatus;
        }

    }

    public static class DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vfw-tr-7a9c8901ed394****</p>
         */
        @NameInMap("FirewallId")
        public String firewallId;

        /**
         * <strong>example:</strong>
         * <p>vpc-m5emh0w6v2e15****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        @NameInMap("PrecheckEntityGroups")
        public java.util.List<DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups> precheckEntityGroups;

        /**
         * <strong>example:</strong>
         * <p>failed</p>
         */
        @NameInMap("PrecheckStatus")
        public String precheckStatus;

        /**
         * <strong>example:</strong>
         * <p>1715136000</p>
         */
        @NameInMap("PrecheckTimestamp")
        public String precheckTimestamp;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail self = new DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail setFirewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }
        public String getFirewallId() {
            return this.firewallId;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail setPrecheckEntityGroups(java.util.List<DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups> precheckEntityGroups) {
            this.precheckEntityGroups = precheckEntityGroups;
            return this;
        }
        public java.util.List<DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups> getPrecheckEntityGroups() {
            return this.precheckEntityGroups;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail setPrecheckStatus(String precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public String getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail setPrecheckTimestamp(String precheckTimestamp) {
            this.precheckTimestamp = precheckTimestamp;
            return this;
        }
        public String getPrecheckTimestamp() {
            return this.precheckTimestamp;
        }

        public DescribeVpcFirewallPrecheckDetailResponseBodyPrecheckDetail setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
