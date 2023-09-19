// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeComputeResourceResponseBody extends TeaModel {
    /**
     * <p>The queried specifications of computing resources.</p>
     */
    @NameInMap("ComputeResource")
    public java.util.List<DescribeComputeResourceResponseBodyComputeResource> computeResource;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComputeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeResourceResponseBody self = new DescribeComputeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComputeResourceResponseBody setComputeResource(java.util.List<DescribeComputeResourceResponseBodyComputeResource> computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public java.util.List<DescribeComputeResourceResponseBodyComputeResource> getComputeResource() {
        return this.computeResource;
    }

    public DescribeComputeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComputeResourceResponseBodyComputeResource extends TeaModel {
        /**
         * <p>The specifications of computing resources displayed in the console.</p>
         */
        @NameInMap("DisplayValue")
        public String displayValue;

        /**
         * <p>The actual specifications of computing resources.</p>
         */
        @NameInMap("RealValue")
        public String realValue;

        public static DescribeComputeResourceResponseBodyComputeResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeComputeResourceResponseBodyComputeResource self = new DescribeComputeResourceResponseBodyComputeResource();
            return TeaModel.build(map, self);
        }

        public DescribeComputeResourceResponseBodyComputeResource setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        public String getDisplayValue() {
            return this.displayValue;
        }

        public DescribeComputeResourceResponseBodyComputeResource setRealValue(String realValue) {
            this.realValue = realValue;
            return this;
        }
        public String getRealValue() {
            return this.realValue;
        }

    }

}
