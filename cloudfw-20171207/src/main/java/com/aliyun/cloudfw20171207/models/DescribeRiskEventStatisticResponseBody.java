// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AttackAppCnt")
    public Integer attackAppCnt;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AttackCnt")
    public Integer attackCnt;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AttackIpCnt")
    public Integer attackIpCnt;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DropCnt")
    public Integer dropCnt;

    /**
     * <strong>example:</strong>
     * <p>F93A490D-9E92-5AA4-BA79-600FFC09****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRiskEventStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventStatisticResponseBody self = new DescribeRiskEventStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventStatisticResponseBody setAttackAppCnt(Integer attackAppCnt) {
        this.attackAppCnt = attackAppCnt;
        return this;
    }
    public Integer getAttackAppCnt() {
        return this.attackAppCnt;
    }

    public DescribeRiskEventStatisticResponseBody setAttackCnt(Integer attackCnt) {
        this.attackCnt = attackCnt;
        return this;
    }
    public Integer getAttackCnt() {
        return this.attackCnt;
    }

    public DescribeRiskEventStatisticResponseBody setAttackIpCnt(Integer attackIpCnt) {
        this.attackIpCnt = attackIpCnt;
        return this;
    }
    public Integer getAttackIpCnt() {
        return this.attackIpCnt;
    }

    public DescribeRiskEventStatisticResponseBody setDropCnt(Integer dropCnt) {
        this.dropCnt = dropCnt;
        return this;
    }
    public Integer getDropCnt() {
        return this.dropCnt;
    }

    public DescribeRiskEventStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
