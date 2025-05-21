// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeEIURangeResponseBody extends TeaModel {
    /**
     * <p>The queried information about the number of EIUs.</p>
     */
    @NameInMap("EIUInfo")
    public DescribeEIURangeResponseBodyEIUInfo EIUInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEIURangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEIURangeResponseBody self = new DescribeEIURangeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEIURangeResponseBody setEIUInfo(DescribeEIURangeResponseBodyEIUInfo EIUInfo) {
        this.EIUInfo = EIUInfo;
        return this;
    }
    public DescribeEIURangeResponseBodyEIUInfo getEIUInfo() {
        return this.EIUInfo;
    }

    public DescribeEIURangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEIURangeResponseBodyEIUInfo extends TeaModel {
        @NameInMap("DefaultReservedNodeSize")
        public String defaultReservedNodeSize;

        /**
         * <p>The suggested value for the number of EIUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The queried range for the number of EIUs.</p>
         */
        @NameInMap("EIURange")
        public java.util.List<Long> EIURange;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        @NameInMap("ReservedNodeSizeRange")
        public java.util.List<String> reservedNodeSizeRange;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("StorageResourceRange")
        public java.util.List<String> storageResourceRange;

        public static DescribeEIURangeResponseBodyEIUInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEIURangeResponseBodyEIUInfo self = new DescribeEIURangeResponseBodyEIUInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEIURangeResponseBodyEIUInfo setDefaultReservedNodeSize(String defaultReservedNodeSize) {
            this.defaultReservedNodeSize = defaultReservedNodeSize;
            return this;
        }
        public String getDefaultReservedNodeSize() {
            return this.defaultReservedNodeSize;
        }

        public DescribeEIURangeResponseBodyEIUInfo setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeEIURangeResponseBodyEIUInfo setEIURange(java.util.List<Long> EIURange) {
            this.EIURange = EIURange;
            return this;
        }
        public java.util.List<Long> getEIURange() {
            return this.EIURange;
        }

        public DescribeEIURangeResponseBodyEIUInfo setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public DescribeEIURangeResponseBodyEIUInfo setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public DescribeEIURangeResponseBodyEIUInfo setReservedNodeSizeRange(java.util.List<String> reservedNodeSizeRange) {
            this.reservedNodeSizeRange = reservedNodeSizeRange;
            return this;
        }
        public java.util.List<String> getReservedNodeSizeRange() {
            return this.reservedNodeSizeRange;
        }

        public DescribeEIURangeResponseBodyEIUInfo setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeEIURangeResponseBodyEIUInfo setStorageResourceRange(java.util.List<String> storageResourceRange) {
            this.storageResourceRange = storageResourceRange;
            return this;
        }
        public java.util.List<String> getStorageResourceRange() {
            return this.storageResourceRange;
        }

    }

}
