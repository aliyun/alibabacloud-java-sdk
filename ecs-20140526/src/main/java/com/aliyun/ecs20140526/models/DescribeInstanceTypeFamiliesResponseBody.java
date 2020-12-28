// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceTypeFamilies")
    public java.util.List<DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies> instanceTypeFamilies;

    public static DescribeInstanceTypeFamiliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesResponseBody self = new DescribeInstanceTypeFamiliesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeFamiliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTypeFamiliesResponseBody setInstanceTypeFamilies(java.util.List<DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies> instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public java.util.List<DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies> getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public static class DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamilyId")
        public String instanceTypeFamilyId;

        @NameInMap("Generation")
        public String generation;

        public static DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies self = new DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies setInstanceTypeFamilyId(String instanceTypeFamilyId) {
            this.instanceTypeFamilyId = instanceTypeFamilyId;
            return this;
        }
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

        public DescribeInstanceTypeFamiliesResponseBodyInstanceTypeFamilies setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

    }

}
