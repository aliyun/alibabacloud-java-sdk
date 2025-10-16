// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingAssetListResponseBody extends TeaModel {
    @NameInMap("AssetList")
    public java.util.List<DescribeOutgoingAssetListResponseBodyAssetList> assetList;

    /**
     * <strong>example:</strong>
     * <p>7A515672-FAAE-584F-B51C-B2586E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingAssetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingAssetListResponseBody self = new DescribeOutgoingAssetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingAssetListResponseBody setAssetList(java.util.List<DescribeOutgoingAssetListResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<DescribeOutgoingAssetListResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public DescribeOutgoingAssetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingAssetListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingAssetListResponseBodyAssetList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-8vbcmllue4d94nto****</p>
         */
        @NameInMap("AssetInstanceId")
        public String assetInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AssetInstanceName")
        public String assetInstanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AssetsRegion")
        public String assetsRegion;

        /**
         * <strong>example:</strong>
         * <p>subscribe</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>244438.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IpsHitCnt")
        public Long ipsHitCnt;

        /**
         * <strong>example:</strong>
         * <p>ngw-bp1utx6wj4x9qu9tl****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <strong>example:</strong>
         * <p>ngw-test</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OutgoingDomainCnt")
        public Long outgoingDomainCnt;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("OutgoingDstIPCnt")
        public Long outgoingDstIPCnt;

        /**
         * <strong>example:</strong>
         * <p>10.21.242XXX</p>
         */
        @NameInMap("PrivateIP")
        public String privateIP;

        @NameInMap("PrivateIPList")
        public java.util.List<String> privateIPList;

        /**
         * <strong>example:</strong>
         * <p>47.96.181.XXX</p>
         */
        @NameInMap("PublicIP")
        public String publicIP;

        /**
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("SecurityRisk")
        public String securityRisk;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>12498767</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        public static DescribeOutgoingAssetListResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingAssetListResponseBodyAssetList self = new DescribeOutgoingAssetListResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setAssetInstanceId(String assetInstanceId) {
            this.assetInstanceId = assetInstanceId;
            return this;
        }
        public String getAssetInstanceId() {
            return this.assetInstanceId;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setAssetInstanceName(String assetInstanceName) {
            this.assetInstanceName = assetInstanceName;
            return this;
        }
        public String getAssetInstanceName() {
            return this.assetInstanceName;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setAssetsRegion(String assetsRegion) {
            this.assetsRegion = assetsRegion;
            return this;
        }
        public String getAssetsRegion() {
            return this.assetsRegion;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setIpsHitCnt(Long ipsHitCnt) {
            this.ipsHitCnt = ipsHitCnt;
            return this;
        }
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setOutgoingDomainCnt(Long outgoingDomainCnt) {
            this.outgoingDomainCnt = outgoingDomainCnt;
            return this;
        }
        public Long getOutgoingDomainCnt() {
            return this.outgoingDomainCnt;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setOutgoingDstIPCnt(Long outgoingDstIPCnt) {
            this.outgoingDstIPCnt = outgoingDstIPCnt;
            return this;
        }
        public Long getOutgoingDstIPCnt() {
            return this.outgoingDstIPCnt;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setPrivateIPList(java.util.List<String> privateIPList) {
            this.privateIPList = privateIPList;
            return this;
        }
        public java.util.List<String> getPrivateIPList() {
            return this.privateIPList;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setSecurityRisk(String securityRisk) {
            this.securityRisk = securityRisk;
            return this;
        }
        public String getSecurityRisk() {
            return this.securityRisk;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeOutgoingAssetListResponseBodyAssetList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

    }

}
