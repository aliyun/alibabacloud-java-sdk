// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillResponseBody extends TeaModel {
    @NameInMap("DebtStatus")
    public Long debtStatus;

    @NameInMap("FlowList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyFlowList> flowList;

    @NameInMap("FlowRegion")
    public java.util.Map<String, ?> flowRegion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpCount")
    public Long ipCount;

    @NameInMap("IpCountOrFunctionList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyIpCountOrFunctionList> ipCountOrFunctionList;

    @NameInMap("IpInfo")
    public String ipInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StandardAssetsFlowList")
    public java.util.List<DescribeDdosOriginInstanceBillResponseBodyStandardAssetsFlowList> standardAssetsFlowList;

    @NameInMap("StandardAssetsFlowRegion")
    public java.util.Map<String, ?> standardAssetsFlowRegion;

    @NameInMap("StandardAssetsTotalFlowCn")
    public Long standardAssetsTotalFlowCn;

    @NameInMap("StandardAssetsTotalFlowOv")
    public Long standardAssetsTotalFlowOv;

    @NameInMap("Status")
    public Long status;

    @NameInMap("TotalFlowCn")
    public Long totalFlowCn;

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
        @NameInMap("MemberFlow")
        public String memberFlow;

        @NameInMap("RegionFlow")
        public String regionFlow;

        @NameInMap("Time")
        public Long time;

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
        @NameInMap("Coverage")
        public String coverage;

        @NameInMap("IpCntCn")
        public Long ipCntCn;

        @NameInMap("IpCntOv")
        public Long ipCntOv;

        @NameInMap("MemberIpCnt")
        public String memberIpCnt;

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
        @NameInMap("MemberFlow")
        public String memberFlow;

        @NameInMap("RegionFlow")
        public String regionFlow;

        @NameInMap("Time")
        public Long time;

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
