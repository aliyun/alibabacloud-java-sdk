// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetRiskListResponseBody extends TeaModel {
    @NameInMap("AssetList")
    public java.util.List<DescribeAssetRiskListResponseBodyAssetList> assetList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAssetRiskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetRiskListResponseBody self = new DescribeAssetRiskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetRiskListResponseBody setAssetList(java.util.List<DescribeAssetRiskListResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<DescribeAssetRiskListResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public DescribeAssetRiskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetRiskListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAssetRiskListResponseBodyAssetList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpVersion")
        public Long ipVersion;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeAssetRiskListResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetRiskListResponseBodyAssetList self = new DescribeAssetRiskListResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public DescribeAssetRiskListResponseBodyAssetList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAssetRiskListResponseBodyAssetList setIpVersion(Long ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Long getIpVersion() {
            return this.ipVersion;
        }

        public DescribeAssetRiskListResponseBodyAssetList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeAssetRiskListResponseBodyAssetList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
