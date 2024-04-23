// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRiskLevelsResponseBody extends TeaModel {
    /**
     * <p>The information about the instances.</p>
     */
    @NameInMap("InstanceRisks")
    public java.util.List<DescribeInstanceRiskLevelsResponseBodyInstanceRisks> instanceRisks;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceRiskLevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRiskLevelsResponseBody self = new DescribeInstanceRiskLevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRiskLevelsResponseBody setInstanceRisks(java.util.List<DescribeInstanceRiskLevelsResponseBodyInstanceRisks> instanceRisks) {
        this.instanceRisks = instanceRisks;
        return this;
    }
    public java.util.List<DescribeInstanceRiskLevelsResponseBodyInstanceRisks> getInstanceRisks() {
        return this.instanceRisks;
    }

    public DescribeInstanceRiskLevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails extends TeaModel {
        /**
         * <p>The IP addresses of servers.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The risk levels. Valid values:</p>
         * <br>
         * <p>*   **medium**</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The type.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails self = new DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstanceRiskLevelsResponseBodyInstanceRisks extends TeaModel {
        /**
         * <p>The risk levels of the Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("Details")
        public java.util.List<DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails> details;

        /**
         * <p>The instance ID of your Cloud Firewall.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The risk levels. Valid values:</p>
         * <br>
         * <p>*   **medium**</p>
         */
        @NameInMap("Level")
        public String level;

        public static DescribeInstanceRiskLevelsResponseBodyInstanceRisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRiskLevelsResponseBodyInstanceRisks self = new DescribeInstanceRiskLevelsResponseBodyInstanceRisks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRiskLevelsResponseBodyInstanceRisks setDetails(java.util.List<DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeInstanceRiskLevelsResponseBodyInstanceRisksDetails> getDetails() {
            return this.details;
        }

        public DescribeInstanceRiskLevelsResponseBodyInstanceRisks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceRiskLevelsResponseBodyInstanceRisks setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
