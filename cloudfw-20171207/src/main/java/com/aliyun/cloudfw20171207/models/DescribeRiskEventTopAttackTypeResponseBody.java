// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BECDBF66-91DA-5B40-8B05-0D26541A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of the top attack types.</p>
     */
    @NameInMap("TopAttackTypeList")
    public java.util.List<DescribeRiskEventTopAttackTypeResponseBodyTopAttackTypeList> topAttackTypeList;

    /**
     * <p>The total number of attacks.</p>
     * 
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("TotalAttackCnt")
    public Long totalAttackCnt;

    /**
     * <p>The total number of protection triggers.</p>
     * 
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
         * <p>The number of attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("AttackCnt")
        public Long attackCnt;

        /**
         * <p>The attack type of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: abnormal connection</p>
         * </li>
         * <li><p><strong>2</strong>: command execution</p>
         * </li>
         * <li><p><strong>3</strong>: brute-force attack</p>
         * </li>
         * <li><p><strong>4</strong>: scan</p>
         * </li>
         * <li><p><strong>5</strong>: other</p>
         * </li>
         * <li><p><strong>6</strong>: information leakage</p>
         * </li>
         * <li><p><strong>7</strong>: DoS attack</p>
         * </li>
         * <li><p><strong>8</strong>: overflow attack</p>
         * </li>
         * <li><p><strong>9</strong>: web attack</p>
         * </li>
         * <li><p><strong>10</strong>: trojan and backdoor</p>
         * </li>
         * <li><p><strong>11</strong>: virus and worm</p>
         * </li>
         * <li><p><strong>12</strong>: cryptomining</p>
         * </li>
         * <li><p><strong>13</strong>: reverse shell</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>By default, this API queries for all attack types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AttackType")
        public Long attackType;

        /**
         * <p>The number of protection triggers.</p>
         * 
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
