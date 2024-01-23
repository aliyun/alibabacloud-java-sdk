// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceExtResponseBody extends TeaModel {
    /**
     * <p>The information about the instance.</p>
     */
    @NameInMap("InstanceExtSpecs")
    public java.util.List<DescribeInstanceExtResponseBodyInstanceExtSpecs> instanceExtSpecs;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of queried instances.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeInstanceExtResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceExtResponseBody self = new DescribeInstanceExtResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceExtResponseBody setInstanceExtSpecs(java.util.List<DescribeInstanceExtResponseBodyInstanceExtSpecs> instanceExtSpecs) {
        this.instanceExtSpecs = instanceExtSpecs;
        return this;
    }
    public java.util.List<DescribeInstanceExtResponseBodyInstanceExtSpecs> getInstanceExtSpecs() {
        return this.instanceExtSpecs;
    }

    public DescribeInstanceExtResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceExtResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceExtResponseBodyInstanceExtSpecs extends TeaModel {
        /**
         * <p>The function plan. Valid values:</p>
         * <br>
         * <p>*   **0**: Standard</p>
         * <p>*   **1**: Enhanced</p>
         */
        @NameInMap("FunctionVersion")
        public Long functionVersion;

        /**
         * <p>The instance ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The clean bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("NormalBandwidth")
        public Long normalBandwidth;

        /**
         * <p>The type of the instance. Valid value:</p>
         * <br>
         * <p>*   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan</p>
         * <p>*   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan</p>
         * <p>*   **2**: Anti-DDoS Premium instance of the CMA mitigation plan</p>
         * <p>*   **3**: Anti-DDoS Premium instance of the Secure Chinese Mainland Acceleration (Sec-CMA) plan</p>
         * <p>*   **9**: Anti-DDoS Pro instance of the Profession mitigation plan</p>
         */
        @NameInMap("ProductPlan")
        public Long productPlan;

        /**
         * <p>The Internet service provider (ISP) line resource of the Anti-DDoS Pro instance.</p>
         */
        @NameInMap("ServicePartner")
        public String servicePartner;

        public static DescribeInstanceExtResponseBodyInstanceExtSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceExtResponseBodyInstanceExtSpecs self = new DescribeInstanceExtResponseBodyInstanceExtSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceExtResponseBodyInstanceExtSpecs setFunctionVersion(Long functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public Long getFunctionVersion() {
            return this.functionVersion;
        }

        public DescribeInstanceExtResponseBodyInstanceExtSpecs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceExtResponseBodyInstanceExtSpecs setNormalBandwidth(Long normalBandwidth) {
            this.normalBandwidth = normalBandwidth;
            return this;
        }
        public Long getNormalBandwidth() {
            return this.normalBandwidth;
        }

        public DescribeInstanceExtResponseBodyInstanceExtSpecs setProductPlan(Long productPlan) {
            this.productPlan = productPlan;
            return this;
        }
        public Long getProductPlan() {
            return this.productPlan;
        }

        public DescribeInstanceExtResponseBodyInstanceExtSpecs setServicePartner(String servicePartner) {
            this.servicePartner = servicePartner;
            return this;
        }
        public String getServicePartner() {
            return this.servicePartner;
        }

    }

}
