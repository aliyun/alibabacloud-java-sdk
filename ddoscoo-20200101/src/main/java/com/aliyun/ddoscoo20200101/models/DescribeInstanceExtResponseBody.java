// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceExtResponseBody extends TeaModel {
    /**
     * <p>The extended information about the Anti-DDoS Proxy instance.</p>
     */
    @NameInMap("InstanceExtSpecs")
    public java.util.List<DescribeInstanceExtResponseBodyInstanceExtSpecs> instanceExtSpecs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of queried instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <ul>
         * <li><strong>0</strong>: Standard</li>
         * <li><strong>1</strong>: Enhanced</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FunctionVersion")
        public Long functionVersion;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-i7m25564****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The clean bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NormalBandwidth")
        public Long normalBandwidth;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan</li>
         * <li><strong>1</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan</li>
         * <li><strong>2</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Chinese Mainland Acceleration (CMA) mitigation plan</li>
         * <li><strong>3</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan</li>
         * <li><strong>9</strong>: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProductPlan")
        public Long productPlan;

        /**
         * <p>The Internet service provider (ISP) line of the Anti-DDoS Proxy (Chinese Mainland) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>coop-line-001</p>
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
