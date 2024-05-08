// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesResponseBody extends TeaModel {
    /**
     * <p>The instance families.</p>
     */
    @NameInMap("InstanceTypeFamilies")
    public DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies instanceTypeFamilies;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTypeFamiliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesResponseBody self = new DescribeInstanceTypeFamiliesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeFamiliesResponseBody setInstanceTypeFamilies(DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public DescribeInstanceTypeFamiliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily extends TeaModel {
        /**
         * <p>The generation of the instance family.</p>
         */
        @NameInMap("Generation")
        public String generation;

        /**
         * <p>The ID of the instance family.</p>
         */
        @NameInMap("InstanceTypeFamilyId")
        public String instanceTypeFamilyId;

        public static DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily self = new DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

        public DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily setInstanceTypeFamilyId(String instanceTypeFamilyId) {
            this.instanceTypeFamilyId = instanceTypeFamilyId;
            return this;
        }
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

    }

    public static class DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        public java.util.List<DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily;

        public static DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies self = new DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies setInstanceTypeFamily(java.util.List<DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public java.util.List<DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

    }

}
