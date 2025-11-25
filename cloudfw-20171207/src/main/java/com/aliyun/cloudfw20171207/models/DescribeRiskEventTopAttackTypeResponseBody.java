// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BECDBF66-91DA-5B40-8B05-0D26541A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TopAttackTypeList")
    public java.util.List<DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList> topAttackTypeList;

    /**
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("TotalAttackCnt")
    public Long totalAttackCnt;

    /**
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("TotalProtectCnt")
    public Long totalProtectCnt;

    public static DescribeRiskEventTopAttackTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackTypeResponseBody self = new DescribeRiskEventTopAttackTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskEventTopAttackTypeResponseBody setTopAttackTypeList(java.util.List<DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList> topAttackTypeList) {
        this.topAttackTypeList = topAttackTypeList;
        return this;
    }
    public java.util.List<DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList> getTopAttackTypeList() {
        return this.topAttackTypeList;
    }

    public DescribeRiskEventTopAttackTypeResponseBody setTotalAttackCnt(Long totalAttackCnt) {
        this.totalAttackCnt = totalAttackCnt;
        return this;
    }
    public Long getTotalAttackCnt() {
        return this.totalAttackCnt;
    }

    public DescribeRiskEventTopAttackTypeResponseBody setTotalProtectCnt(Long totalProtectCnt) {
        this.totalProtectCnt = totalProtectCnt;
        return this;
    }
    public Long getTotalProtectCnt() {
        return this.totalProtectCnt;
    }

    public static class DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("AttackCnt")
        public Long attackCnt;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AttackType")
        public Long attackType;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("ProtectCnt")
        public Long protectCnt;

        public static DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList self = new DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList setAttackCnt(Long attackCnt) {
            this.attackCnt = attackCnt;
            return this;
        }
        public Long getAttackCnt() {
            return this.attackCnt;
        }

        public DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList setAttackType(Long attackType) {
            this.attackType = attackType;
            return this;
        }
        public Long getAttackType() {
            return this.attackType;
        }

        public DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList setProtectCnt(Long protectCnt) {
            this.protectCnt = protectCnt;
            return this;
        }
        public Long getProtectCnt() {
            return this.protectCnt;
        }

    }

}
