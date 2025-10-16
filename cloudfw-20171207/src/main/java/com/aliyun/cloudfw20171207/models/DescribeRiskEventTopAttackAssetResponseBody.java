// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackAssetResponseBody extends TeaModel {
    @NameInMap("Assets")
    public java.util.List<DescribeRiskEventTopAttackAssetResponseBodyAssets> assets;

    /**
     * <strong>example:</strong>
     * <p>B9BF7C33-9A23-5096-8568-A3DACAF0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRiskEventTopAttackAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackAssetResponseBody self = new DescribeRiskEventTopAttackAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackAssetResponseBody setAssets(java.util.List<DescribeRiskEventTopAttackAssetResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<DescribeRiskEventTopAttackAssetResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public DescribeRiskEventTopAttackAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRiskEventTopAttackAssetResponseBodyAssets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AttackCnt")
        public Integer attackCnt;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DropCnt")
        public Integer dropCnt;

        /**
         * <strong>example:</strong>
         * <p>10.3.54.XXX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>i-8vbdrjrxzt78****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test_resource</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeRiskEventTopAttackAssetResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventTopAttackAssetResponseBodyAssets self = new DescribeRiskEventTopAttackAssetResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventTopAttackAssetResponseBodyAssets setAttackCnt(Integer attackCnt) {
            this.attackCnt = attackCnt;
            return this;
        }
        public Integer getAttackCnt() {
            return this.attackCnt;
        }

        public DescribeRiskEventTopAttackAssetResponseBodyAssets setDropCnt(Integer dropCnt) {
            this.dropCnt = dropCnt;
            return this;
        }
        public Integer getDropCnt() {
            return this.dropCnt;
        }

        public DescribeRiskEventTopAttackAssetResponseBodyAssets setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeRiskEventTopAttackAssetResponseBodyAssets setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRiskEventTopAttackAssetResponseBodyAssets setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeRiskEventTopAttackAssetResponseBodyAssets setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        public DescribeRiskEventTopAttackAssetResponseBodyAssets setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
