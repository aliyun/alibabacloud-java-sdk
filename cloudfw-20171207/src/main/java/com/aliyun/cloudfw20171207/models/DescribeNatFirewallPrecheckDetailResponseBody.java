// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallPrecheckDetailResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a task exists.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsFound")
    public Boolean isFound;

    /**
     * <p>The details of the precheck.</p>
     */
    @NameInMap("PrecheckDetail")
    public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail precheckDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>99A65AA0-C5B5-5092-BFCF-8111B436****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatFirewallPrecheckDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallPrecheckDetailResponseBody self = new DescribeNatFirewallPrecheckDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallPrecheckDetailResponseBody setIsFound(Boolean isFound) {
        this.isFound = isFound;
        return this;
    }
    public Boolean getIsFound() {
        return this.isFound;
    }

    public DescribeNatFirewallPrecheckDetailResponseBody setPrecheckDetail(DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail precheckDetail) {
        this.precheckDetail = precheckDetail;
        return this;
    }
    public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail getPrecheckDetail() {
        return this.precheckDetail;
    }

    public DescribeNatFirewallPrecheckDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities extends TeaModel {
        /**
         * <p>The information about the failed precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC Firewall Quota Full</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <p>The name of the precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>Precheck test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of each precheck item. Valid values:</p>
         * <ul>
         * <li><p><strong>running</strong>: The precheck is in progress.</p>
         * </li>
         * <li><p><strong>passed</strong>: The precheck is passed.</p>
         * </li>
         * <li><p><strong>failed</strong>: The precheck failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>passed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The suggested solution.</p>
         * 
         * <strong>example:</strong>
         * <p>The VPC firewall quota is full. We recommend that you increase the firewall quota</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities self = new DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups extends TeaModel {
        /**
         * <p>The number of failed precheck items.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("FailedCount")
        public Integer failedCount;

        /**
         * <p>The name of the precheck instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The execution status of each precheck item.</p>
         */
        @NameInMap("PrecheckEntities")
        public java.util.List<DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities> precheckEntities;

        /**
         * <p>The status of the precheck. Valid values:</p>
         * <ul>
         * <li><p><strong>running</strong></p>
         * </li>
         * <li><p><strong>passed</strong></p>
         * </li>
         * <li><p><strong>failed</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("PrecheckEntityGroupStatus")
        public String precheckEntityGroupStatus;

        public static DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups self = new DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setPrecheckEntities(java.util.List<DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities> precheckEntities) {
            this.precheckEntities = precheckEntities;
            return this;
        }
        public java.util.List<DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroupsPrecheckEntities> getPrecheckEntities() {
            return this.precheckEntities;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups setPrecheckEntityGroupStatus(String precheckEntityGroupStatus) {
            this.precheckEntityGroupStatus = precheckEntityGroupStatus;
            return this;
        }
        public String getPrecheckEntityGroupStatus() {
            return this.precheckEntityGroupStatus;
        }

    }

    public static class DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail extends TeaModel {
        /**
         * <p>The ID of the firewall instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-7a9c8901ed394****</p>
         */
        @NameInMap("FirewallId")
        public String firewallId;

        /**
         * <p>The ID of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5emh0w6v2e15****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <p>The list of precheck item groups.</p>
         */
        @NameInMap("PrecheckEntityGroups")
        public java.util.List<DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups> precheckEntityGroups;

        /**
         * <p>The status of the precheck. Valid values:</p>
         * <ul>
         * <li><p><strong>running</strong>: The precheck is in progress.</p>
         * </li>
         * <li><p><strong>passed</strong>: The precheck is passed.</p>
         * </li>
         * <li><p><strong>failed</strong>: The precheck failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        @NameInMap("PrecheckStatus")
        public String precheckStatus;

        /**
         * <p>The timestamp of the precheck.</p>
         * 
         * <strong>example:</strong>
         * <p>1715136000</p>
         */
        @NameInMap("PrecheckTimestamp")
        public String precheckTimestamp;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail self = new DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail setFirewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }
        public String getFirewallId() {
            return this.firewallId;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail setPrecheckEntityGroups(java.util.List<DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups> precheckEntityGroups) {
            this.precheckEntityGroups = precheckEntityGroups;
            return this;
        }
        public java.util.List<DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetailPrecheckEntityGroups> getPrecheckEntityGroups() {
            return this.precheckEntityGroups;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail setPrecheckStatus(String precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public String getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail setPrecheckTimestamp(String precheckTimestamp) {
            this.precheckTimestamp = precheckTimestamp;
            return this;
        }
        public String getPrecheckTimestamp() {
            return this.precheckTimestamp;
        }

        public DescribeNatFirewallPrecheckDetailResponseBodyPrecheckDetail setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
