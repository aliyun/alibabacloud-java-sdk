// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackAppResponseBody extends TeaModel {
    @NameInMap("AttackApps")
    public java.util.List<DescribeRiskEventTopAttackAppResponseBodyAttackApps> attackApps;

    /**
     * <strong>example:</strong>
     * <p>C9DDAD29-C6B3-5997-B757-FFB3F1C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRiskEventTopAttackAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackAppResponseBody self = new DescribeRiskEventTopAttackAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackAppResponseBody setAttackApps(java.util.List<DescribeRiskEventTopAttackAppResponseBodyAttackApps> attackApps) {
        this.attackApps = attackApps;
        return this;
    }
    public java.util.List<DescribeRiskEventTopAttackAppResponseBodyAttackApps> getAttackApps() {
        return this.attackApps;
    }

    public DescribeRiskEventTopAttackAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRiskEventTopAttackAppResponseBodyAttackApps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>live</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AttackCnt")
        public Integer attackCnt;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DropCnt")
        public Integer dropCnt;

        public static DescribeRiskEventTopAttackAppResponseBodyAttackApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventTopAttackAppResponseBodyAttackApps self = new DescribeRiskEventTopAttackAppResponseBodyAttackApps();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventTopAttackAppResponseBodyAttackApps setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeRiskEventTopAttackAppResponseBodyAttackApps setAttackCnt(Integer attackCnt) {
            this.attackCnt = attackCnt;
            return this;
        }
        public Integer getAttackCnt() {
            return this.attackCnt;
        }

        public DescribeRiskEventTopAttackAppResponseBodyAttackApps setDropCnt(Integer dropCnt) {
            this.dropCnt = dropCnt;
            return this;
        }
        public Integer getDropCnt() {
            return this.dropCnt;
        }

    }

}
