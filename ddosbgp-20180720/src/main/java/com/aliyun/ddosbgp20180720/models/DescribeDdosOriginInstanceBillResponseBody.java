// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillResponseBody extends TeaModel {
    /**
     * <p>The asset status.</p>
     * <ul>
     * <li><strong>0</strong>: No asset is added to the instance for protection.</li>
     * <li><strong>1</strong>: Assets are added to the instance for protection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AssetStatus")
    public Integer assetStatus;

    /**
     * <p>The payment status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The payment is not overdue.</li>
     * <li><strong>1</strong>: The payment is overdue.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DebtStatus")
    public Long debtStatus;

    /**
     * <p>The details about the traffic of EIPs with Anti-DDoS (Enhanced) enabled.</p>
     */
    @NameInMap("FlowList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyFlowList> flowList;

    /**
     * <p>The traffic distribution of EIPs with Anti-DDoS (Enhanced) enabled by region.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;cn-hongkong\&quot;: 166491566}</p>
     */
    @NameInMap("FlowRegion")
    public java.util.Map<String, ?> flowRegion;

    /**
     * <p>The ID of the Anti-DDoS Origin (Pay-as-you-go) instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosorigin_cn-u7c3lcr9r02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of protected IP addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IpCount")
    public Long ipCount;

    /**
     * <p>The protected IP addresses and enabled features.</p>
     */
    @NameInMap("IpCountOrFunctionList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList> ipCountOrFunctionList;

    /**
     * <p>The IP address distribution. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><strong>eipCnIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland.</li>
     * <li><strong>eipOvIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland.</li>
     * <li><strong>standardAssetsCnIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services in the Chinese mainland.</li>
     * <li><strong>standardAssetsOvIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;eipCnIpCount\&quot;:6,\&quot;eipOvIpCount\&quot;:17,\&quot;standardAssetsCnIpCount\&quot;:2,\&quot;standardAssetsOvIpCount\&quot;:0}</p>
     */
    @NameInMap("IpInfo")
    public String ipInfo;

    /**
     * <p>The information about the monthly summary bills.</p>
     */
    @NameInMap("MonthlySummaryList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList> monthlySummaryList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72155560-F343-55C8-82FE-ED4D7E4AA97E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the traffic of regular Alibaba Cloud services.</p>
     */
    @NameInMap("StandardAssetsFlowList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList> standardAssetsFlowList;

    /**
     * <p>The traffic distribution of regular Alibaba Cloud services by region.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;cn-hongkong\&quot;: 166491566}</p>
     */
    @NameInMap("StandardAssetsFlowRegion")
    public java.util.Map<String, ?> standardAssetsFlowRegion;

    /**
     * <p>The total traffic of regular Alibaba Cloud services in the Chinese mainland in the current month.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StandardAssetsTotalFlowCn")
    public Long standardAssetsTotalFlowCn;

    /**
     * <p>The total traffic of regular Alibaba Cloud services outside the Chinese mainland in the current month.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StandardAssetsTotalFlowOv")
    public Long standardAssetsTotalFlowOv;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: normal</li>
     * <li><strong>2</strong>: expired</li>
     * <li><strong>3</strong>: released</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The total traffic of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland in the current month. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>6302081067</p>
     */
    @NameInMap("TotalFlowCn")
    public Long totalFlowCn;

    /**
     * <p>The total traffic of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland in the current month. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>6204918019</p>
     */
    @NameInMap("TotalFlowOv")
    public Long totalFlowOv;

    public static DescribeDdosOriginInstanceBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosOriginInstanceBillResponseBody self = new DescribeDdosOriginInstanceBillResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosOriginInstanceBillResponseBody setAssetStatus(Integer assetStatus) {
        this.assetStatus = assetStatus;
        return this;
    }
    public Integer getAssetStatus() {
        return this.assetStatus;
    }

    public DescribeDdosOriginInstanceBillResponseBody setDebtStatus(Long debtStatus) {
        this.debtStatus = debtStatus;
        return this;
    }
    public Long getDebtStatus() {
        return this.debtStatus;
    }

    public DescribeDdosOriginInstanceBillResponseBody setFlowList(java.util.List<DescribeDdosOriginInstanceBillResponseBodyFlowList> flowList) {
        this.flowList = flowList;
        return this;
    }
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyFlowList> getFlowList() {
        return this.flowList;
    }

    public DescribeDdosOriginInstanceBillResponseBody setFlowRegion(java.util.Map<String, ?> flowRegion) {
        this.flowRegion = flowRegion;
        return this;
    }
    public java.util.Map<String, ?> getFlowRegion() {
        return this.flowRegion;
    }

    public DescribeDdosOriginInstanceBillResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDdosOriginInstanceBillResponseBody setIpCount(Long ipCount) {
        this.ipCount = ipCount;
        return this;
    }
    public Long getIpCount() {
        return this.ipCount;
    }

    public DescribeDdosOriginInstanceBillResponseBody setIpCountOrFunctionList(java.util.List<DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList> ipCountOrFunctionList) {
        this.ipCountOrFunctionList = ipCountOrFunctionList;
        return this;
    }
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList> getIpCountOrFunctionList() {
        return this.ipCountOrFunctionList;
    }

    public DescribeDdosOriginInstanceBillResponseBody setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo;
        return this;
    }
    public String getIpInfo() {
        return this.ipInfo;
    }

    public DescribeDdosOriginInstanceBillResponseBody setMonthlySummaryList(java.util.List<DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList> monthlySummaryList) {
        this.monthlySummaryList = monthlySummaryList;
        return this;
    }
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList> getMonthlySummaryList() {
        return this.monthlySummaryList;
    }

    public DescribeDdosOriginInstanceBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosOriginInstanceBillResponseBody setStandardAssetsFlowList(java.util.List<DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList> standardAssetsFlowList) {
        this.standardAssetsFlowList = standardAssetsFlowList;
        return this;
    }
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList> getStandardAssetsFlowList() {
        return this.standardAssetsFlowList;
    }

    public DescribeDdosOriginInstanceBillResponseBody setStandardAssetsFlowRegion(java.util.Map<String, ?> standardAssetsFlowRegion) {
        this.standardAssetsFlowRegion = standardAssetsFlowRegion;
        return this;
    }
    public java.util.Map<String, ?> getStandardAssetsFlowRegion() {
        return this.standardAssetsFlowRegion;
    }

    public DescribeDdosOriginInstanceBillResponseBody setStandardAssetsTotalFlowCn(Long standardAssetsTotalFlowCn) {
        this.standardAssetsTotalFlowCn = standardAssetsTotalFlowCn;
        return this;
    }
    public Long getStandardAssetsTotalFlowCn() {
        return this.standardAssetsTotalFlowCn;
    }

    public DescribeDdosOriginInstanceBillResponseBody setStandardAssetsTotalFlowOv(Long standardAssetsTotalFlowOv) {
        this.standardAssetsTotalFlowOv = standardAssetsTotalFlowOv;
        return this;
    }
    public Long getStandardAssetsTotalFlowOv() {
        return this.standardAssetsTotalFlowOv;
    }

    public DescribeDdosOriginInstanceBillResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public DescribeDdosOriginInstanceBillResponseBody setTotalFlowCn(Long totalFlowCn) {
        this.totalFlowCn = totalFlowCn;
        return this;
    }
    public Long getTotalFlowCn() {
        return this.totalFlowCn;
    }

    public DescribeDdosOriginInstanceBillResponseBody setTotalFlowOv(Long totalFlowOv) {
        this.totalFlowOv = totalFlowOv;
        return this;
    }
    public Long getTotalFlowOv() {
        return this.totalFlowOv;
    }

    public static class DescribeDdosOriginInstanceBillResponseBodyFlowList extends TeaModel {
        /**
         * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>bytes</strong>: the traffic volume of EIPs with Anti-DDoS (Enhanced) enabled in a region. Unit: bytes.</li>
         * <li><strong>memberUid</strong>: the owner account.</li>
         * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the EIPs with Anti-DDoS (Enhanced) enabled.</li>
         * <li><strong>ip</strong>: the EIPs with Anti-DDoS (Enhanced) enabled.</li>
         * <li><strong>region</strong>: the region.</li>
         * </ul>
         * <blockquote>
         * <p> If the memberUid field in the JSON struct is empty, the information about the current account is returned. The value of the bytes parameter in the outermost level of the JSON struct indicates the total traffic, and the values of the bytes parameters in inner levels indicate the traffic of the account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;bytes\&quot;:79282719,\&quot;memberUid\&quot;:\&quot;\&quot;,\&quot;regionFlows\&quot;:{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:79282719,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.57\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}}]</p>
         */
        @NameInMap("MemberFlow")
        public String memberFlow;

        /**
         * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>bytes</strong>: the traffic volume of EIPs with Anti-DDoS (Enhanced) enabled in a region. Unit: bytes.</li>
         * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the EIPs with Anti-DDoS (Enhanced) enabled.</li>
         * <li><strong>ip</strong>: the EIPs with Anti-DDoS (Enhanced) enabled.</li>
         * <li><strong>region</strong>: the region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:0,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.124\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}</p>
         */
        @NameInMap("RegionFlow")
        public String regionFlow;

        /**
         * <p>The timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620951900</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The traffic of EIPs with Anti-DDoS (Enhanced) enabled. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>6302081067</p>
         */
        @NameInMap("TotalFlow")
        public Long totalFlow;

        public static DescribeDdosOriginInstanceBillResponseBodyFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosOriginInstanceBillResponseBodyFlowList self = new DescribeDdosOriginInstanceBillResponseBodyFlowList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosOriginInstanceBillResponseBodyFlowList setMemberFlow(String memberFlow) {
            this.memberFlow = memberFlow;
            return this;
        }
        public String getMemberFlow() {
            return this.memberFlow;
        }

        public DescribeDdosOriginInstanceBillResponseBodyFlowList setRegionFlow(String regionFlow) {
            this.regionFlow = regionFlow;
            return this;
        }
        public String getRegionFlow() {
            return this.regionFlow;
        }

        public DescribeDdosOriginInstanceBillResponseBodyFlowList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeDdosOriginInstanceBillResponseBodyFlowList setTotalFlow(Long totalFlow) {
            this.totalFlow = totalFlow;
            return this;
        }
        public Long getTotalFlow() {
            return this.totalFlow;
        }

    }

    public static class DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList extends TeaModel {
        /**
         * <p>The application scope of the instance. Valid values:</p>
         * <ul>
         * <li><strong>only_mainland_china</strong>: regions in the Chinese mainland.</li>
         * <li><strong>global</strong>: all regions.</li>
         * <li><strong>international_and_hmt</strong>: regions outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The number of IP addresses protected by the pay-as-you-go instance in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IpCntCn")
        public Long ipCntCn;

        /**
         * <p>The number of IP addresses protected by the pay-as-you-go instance outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IpCntOv")
        public Long ipCntOv;

        /**
         * <p>The bill distribution by account. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>eipCnIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland.</li>
         * <li><strong>eipOvIpCount</strong>: the number of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland.</li>
         * <li><strong>memberUid</strong>: the owner account.</li>
         * <li><strong>standardAssetsCnIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services in the Chinese mainland.</li>
         * <li><strong>standardAssetsOvIpCount</strong>: the number of IP addresses of regular Alibaba Cloud services outside the Chinese mainland.</li>
         * </ul>
         * <blockquote>
         * <p> If the memberUid field in the JSON struct is empty, the information about the current account is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;eipCnIpCount\&quot;:3,\&quot;eipOvIpCount\&quot;:18,\&quot;memberUid\&quot;:\&quot;\&quot;,\&quot;standardAssetsCnIpCount\&quot;:2,\&quot;standardAssetsOvIpCount\&quot;:0},{\&quot;eipCnIpCount\&quot;:3,\&quot;eipOvIpCount\&quot;:0,\&quot;memberUid\&quot;:\&quot;1776997906319249\&quot;,\&quot;standardAssetsCnIpCount\&quot;:0,\&quot;standardAssetsOvIpCount\&quot;:0}]</p>
         */
        @NameInMap("MemberIpCnt")
        public String memberIpCnt;

        /**
         * <p>The billing time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1680278400000</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList self = new DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList setIpCntCn(Long ipCntCn) {
            this.ipCntCn = ipCntCn;
            return this;
        }
        public Long getIpCntCn() {
            return this.ipCntCn;
        }

        public DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList setIpCntOv(Long ipCntOv) {
            this.ipCntOv = ipCntOv;
            return this;
        }
        public Long getIpCntOv() {
            return this.ipCntOv;
        }

        public DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList setMemberIpCnt(String memberIpCnt) {
            this.memberIpCnt = memberIpCnt;
            return this;
        }
        public String getMemberIpCnt() {
            return this.memberIpCnt;
        }

        public DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList extends TeaModel {
        /**
         * <p>The number of days that the instance is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EnableDays")
        public Integer enableDays;

        /**
         * <p>The total traffic of EIPs with Anti-DDoS (Enhanced) enabled in the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("FlowCn")
        public Long flowCn;

        /**
         * <p>The total traffic of EIPs with Anti-DDoS (Enhanced) enabled outside the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("FlowIntl")
        public Long flowIntl;

        /**
         * <p>The total number of protected IP addresses in the Chinese mainland.</p>
         * <blockquote>
         * <p> The total number of protected IP addresses is the sum of the daily numbers of protected IP addresses in a month.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("IpCountCn")
        public Integer ipCountCn;

        /**
         * <p>The total number of protected IP addresses outside the Chinese mainland.</p>
         * <blockquote>
         * <p> The total number of protected IP addresses is the sum of the daily numbers of protected IP addresses in a month.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IpCountIntl")
        public Integer ipCountIntl;

        /**
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>112873971277****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The total traffic of regular Alibaba Cloud services in the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("StandardAssetsFlowCn")
        public Long standardAssetsFlowCn;

        /**
         * <p>The total traffic of regular Alibaba Cloud services outside the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("StandardAssetsFlowIntl")
        public Long standardAssetsFlowIntl;

        /**
         * <p>The ID of the administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>102518028277****</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList self = new DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setEnableDays(Integer enableDays) {
            this.enableDays = enableDays;
            return this;
        }
        public Integer getEnableDays() {
            return this.enableDays;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setFlowCn(Long flowCn) {
            this.flowCn = flowCn;
            return this;
        }
        public Long getFlowCn() {
            return this.flowCn;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setFlowIntl(Long flowIntl) {
            this.flowIntl = flowIntl;
            return this;
        }
        public Long getFlowIntl() {
            return this.flowIntl;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setIpCountCn(Integer ipCountCn) {
            this.ipCountCn = ipCountCn;
            return this;
        }
        public Integer getIpCountCn() {
            return this.ipCountCn;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setIpCountIntl(Integer ipCountIntl) {
            this.ipCountIntl = ipCountIntl;
            return this;
        }
        public Integer getIpCountIntl() {
            return this.ipCountIntl;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setStandardAssetsFlowCn(Long standardAssetsFlowCn) {
            this.standardAssetsFlowCn = standardAssetsFlowCn;
            return this;
        }
        public Long getStandardAssetsFlowCn() {
            return this.standardAssetsFlowCn;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setStandardAssetsFlowIntl(Long standardAssetsFlowIntl) {
            this.standardAssetsFlowIntl = standardAssetsFlowIntl;
            return this;
        }
        public Long getStandardAssetsFlowIntl() {
            return this.standardAssetsFlowIntl;
        }

        public DescribeDdosOriginInstanceBillResponseBodyMonthlySummaryList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList extends TeaModel {
        /**
         * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>bytes</strong>: the traffic volume of regular Alibaba Cloud services in a region. Unit: bytes.</li>
         * <li><strong>memberUid</strong>: the owner account.</li>
         * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the regular Alibaba Cloud services.</li>
         * <li><strong>ip</strong>: the IP address of the regular Alibaba Cloud service protected by the Anti-DDoS Origin instance.</li>
         * <li><strong>region</strong>: the region.</li>
         * </ul>
         * <blockquote>
         * <p> If the memberUid field in the JSON struct is empty, the information about the current account is returned. The value of the bytes parameter in the outermost level of the JSON struct indicates the total traffic, and the values of the bytes parameters in inner levels indicate the traffic of the account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;bytes\&quot;:79282719,\&quot;memberUid\&quot;:\&quot;\&quot;,\&quot;regionFlows\&quot;:{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:79282719,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.57\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}}]</p>
         */
        @NameInMap("MemberFlow")
        public String memberFlow;

        /**
         * <p>The traffic distribution by region. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>bytes</strong>: the traffic volume of regular Alibaba Cloud services in a region. Unit: bytes.</li>
         * <li><strong>instanceId</strong>: the ID of the pay-as-you-go instance that protects the regular Alibaba Cloud services.</li>
         * <li><strong>ip</strong>: the IP address protected by the Anti-DDoS Origin instance.</li>
         * <li><strong>region</strong>: the region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:0,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.124\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}</p>
         */
        @NameInMap("RegionFlow")
        public String regionFlow;

        /**
         * <p>The timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679846400000</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The traffic of regular Alibaba Cloud services. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>6302081067</p>
         */
        @NameInMap("TotalFlow")
        public Long totalFlow;

        public static DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList self = new DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList setMemberFlow(String memberFlow) {
            this.memberFlow = memberFlow;
            return this;
        }
        public String getMemberFlow() {
            return this.memberFlow;
        }

        public DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList setRegionFlow(String regionFlow) {
            this.regionFlow = regionFlow;
            return this;
        }
        public String getRegionFlow() {
            return this.regionFlow;
        }

        public DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList setTotalFlow(Long totalFlow) {
            this.totalFlow = totalFlow;
            return this;
        }
        public Long getTotalFlow() {
            return this.totalFlow;
        }

    }

}
