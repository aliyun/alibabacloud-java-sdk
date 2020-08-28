// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceTypeFamilies")
    @Validation(required = true)
    public DescribeInstanceTypeFamiliesResponseInstanceTypeFamilies instanceTypeFamilies;

    public static DescribeInstanceTypeFamiliesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesResponse self = new DescribeInstanceTypeFamiliesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceTypeFamiliesResponseInstanceTypeFamiliesInstanceTypeFamily extends TeaModel {
        @NameInMap("InstanceTypeFamilyId")
        @Validation(required = true)
        public String instanceTypeFamilyId;

        @NameInMap("Generation")
        @Validation(required = true)
        public String generation;

        public static DescribeInstanceTypeFamiliesResponseInstanceTypeFamiliesInstanceTypeFamily build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypeFamiliesResponseInstanceTypeFamiliesInstanceTypeFamily self = new DescribeInstanceTypeFamiliesResponseInstanceTypeFamiliesInstanceTypeFamily();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceTypeFamiliesResponseInstanceTypeFamilies extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public java.util.List<DescribeInstanceTypeFamiliesResponseInstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily;

        public static DescribeInstanceTypeFamiliesResponseInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypeFamiliesResponseInstanceTypeFamilies self = new DescribeInstanceTypeFamiliesResponseInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

    }

}
