// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetRiskListResponseBody extends TeaModel {
    /**
     * <p>The details of the assets.</p>
     */
    @NameInMap("AssetList")
    public java.util.List<DescribeAssetRiskListResponseBodyAssetList> assetList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>443C5781-1C03-5FCD-8EC5-FB9C0B9AC396</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
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
        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>39.108.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The IP version of the asset that is protected by Cloud Firewall.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4</li>
         * <li><strong>6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Long ipVersion;

        /**
         * <p>The reason for the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>low</strong></li>
         * <li><strong>middle</strong></li>
         * <li><strong>high</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
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
