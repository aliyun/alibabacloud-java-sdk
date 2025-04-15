// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupSpecResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>10226189-4391-5B10-97AF-5CA5XXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Specs")
    public java.util.List<DescribeResourceGroupSpecResponseBodySpecs> specs;

    public static DescribeResourceGroupSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceGroupSpecResponseBody self = new DescribeResourceGroupSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceGroupSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceGroupSpecResponseBody setSpecs(java.util.List<DescribeResourceGroupSpecResponseBodySpecs> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<DescribeResourceGroupSpecResponseBodySpecs> getSpecs() {
        return this.specs;
    }

    public static class DescribeResourceGroupSpecResponseBodySpecs extends TeaModel {
        @NameInMap("AllocateUnits")
        public java.util.List<String> allocateUnits;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxQuantity")
        public Integer maxQuantity;

        /**
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeResourceGroupSpecResponseBodySpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceGroupSpecResponseBodySpecs self = new DescribeResourceGroupSpecResponseBodySpecs();
            return TeaModel.build(map, self);
        }

        public DescribeResourceGroupSpecResponseBodySpecs setAllocateUnits(java.util.List<String> allocateUnits) {
            this.allocateUnits = allocateUnits;
            return this;
        }
        public java.util.List<String> getAllocateUnits() {
            return this.allocateUnits;
        }

        public DescribeResourceGroupSpecResponseBodySpecs setMaxQuantity(Integer maxQuantity) {
            this.maxQuantity = maxQuantity;
            return this;
        }
        public Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        public DescribeResourceGroupSpecResponseBodySpecs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceGroupSpecResponseBodySpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
