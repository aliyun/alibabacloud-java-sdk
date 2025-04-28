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
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEAW</p>
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
         * 
         * <strong>example:</strong>
         * <p>8 Core 32 GB</p>
         */
        @NameInMap("DisplayValue")
        public String displayValue;

        /**
         * <p>The actual specifications of computing resources.</p>
         * 
         * <strong>example:</strong>
         * <p>8 Core 32 GB</p>
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
