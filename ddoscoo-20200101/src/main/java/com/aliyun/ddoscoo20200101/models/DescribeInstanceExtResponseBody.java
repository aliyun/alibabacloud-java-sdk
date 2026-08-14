// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceExtResponseBody extends TeaModel {
    @NameInMap("InstanceExtSpecs")
    public java.util.List<DescribeInstanceExtResponseBodyInstanceExtSpecs> instanceExtSpecs;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("FunctionVersion")
        public Long functionVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NormalBandwidth")
        public Long normalBandwidth;

        @NameInMap("ProductPlan")
        public Long productPlan;

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
