// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DebtStatus")
    public Long debtStatus;

    @NameInMap("FlowList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyFlowList> flowList;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;cn-hongkong\&quot;: 166491566}</p>
     */
    @NameInMap("FlowRegion")
    public java.util.Map<String, ?> flowRegion;

    /**
     * <strong>example:</strong>
     * <p>ddosorigin_cn-u7c3lcr9r02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IpCount")
    public Long ipCount;

    @NameInMap("IpCountOrFunctionList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList> ipCountOrFunctionList;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;eipCnIpCount\&quot;:6,\&quot;eipOvIpCount\&quot;:17,\&quot;standardAssetsCnIpCount\&quot;:2,\&quot;standardAssetsOvIpCount\&quot;:0}</p>
     */
    @NameInMap("IpInfo")
    public String ipInfo;

    /**
     * <strong>example:</strong>
     * <p>72155560-F343-55C8-82FE-ED4D7E4AA97E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StandardAssetsFlowList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList> standardAssetsFlowList;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;cn-hongkong\&quot;: 166491566}</p>
     */
    @NameInMap("StandardAssetsFlowRegion")
    public java.util.Map<String, ?> standardAssetsFlowRegion;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StandardAssetsTotalFlowCn")
    public Long standardAssetsTotalFlowCn;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StandardAssetsTotalFlowOv")
    public Long standardAssetsTotalFlowOv;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <strong>example:</strong>
     * <p>6302081067</p>
     */
    @NameInMap("TotalFlowCn")
    public Long totalFlowCn;

    /**
     * <strong>example:</strong>
     * <p>6204918019</p>
     */
    @NameInMap("TotalFlowOv")
    public Long totalFlowOv;

    public static DescribeDdosOriginInstanceBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosOriginInstanceBillResponseBody self = new DescribeDdosOriginInstanceBillResponseBody();
        return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p>[{\&quot;bytes\&quot;:79282719,\&quot;memberUid\&quot;:\&quot;\&quot;,\&quot;regionFlows\&quot;:{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:79282719,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.57\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}}]</p>
         */
        @NameInMap("MemberFlow")
        public String memberFlow;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:0,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.124\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}</p>
         */
        @NameInMap("RegionFlow")
        public String regionFlow;

        /**
         * <strong>example:</strong>
         * <p>1620951900</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
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
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IpCntCn")
        public Long ipCntCn;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IpCntOv")
        public Long ipCntOv;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;eipCnIpCount\&quot;:3,\&quot;eipOvIpCount\&quot;:18,\&quot;memberUid\&quot;:\&quot;\&quot;,\&quot;standardAssetsCnIpCount\&quot;:2,\&quot;standardAssetsOvIpCount\&quot;:0},{\&quot;eipCnIpCount\&quot;:3,\&quot;eipOvIpCount\&quot;:0,\&quot;memberUid\&quot;:\&quot;1776997906319249\&quot;,\&quot;standardAssetsCnIpCount\&quot;:0,\&quot;standardAssetsOvIpCount\&quot;:0}]</p>
         */
        @NameInMap("MemberIpCnt")
        public String memberIpCnt;

        /**
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

    public static class DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{\&quot;bytes\&quot;:79282719,\&quot;memberUid\&quot;:\&quot;\&quot;,\&quot;regionFlows\&quot;:{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:79282719,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.57\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}}]</p>
         */
        @NameInMap("MemberFlow")
        public String memberFlow;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;cn-hangzhou\&quot;:[{\&quot;bytes\&quot;:0,\&quot;instanceId\&quot;:\&quot;ddosorigin_cn-u7c3lcr9r02\&quot;,\&quot;ip\&quot;:\&quot;47.118.168.124\&quot;,\&quot;region\&quot;:\&quot;cn-hangzhou\&quot;}]}</p>
         */
        @NameInMap("RegionFlow")
        public String regionFlow;

        /**
         * <strong>example:</strong>
         * <p>1679846400000</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
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
