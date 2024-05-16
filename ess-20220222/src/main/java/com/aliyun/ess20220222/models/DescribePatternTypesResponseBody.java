// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribePatternTypesResponseBody extends TeaModel {
    @NameInMap("PatternTypes")
    public java.util.List<DescribePatternTypesResponseBodyPatternTypes> patternTypes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePatternTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternTypesResponseBody self = new DescribePatternTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePatternTypesResponseBody setPatternTypes(java.util.List<DescribePatternTypesResponseBodyPatternTypes> patternTypes) {
        this.patternTypes = patternTypes;
        return this;
    }
    public java.util.List<DescribePatternTypesResponseBodyPatternTypes> getPatternTypes() {
        return this.patternTypes;
    }

    public DescribePatternTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePatternTypesResponseBodyPatternTypes extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("Memory")
        public Float memory;

        public static DescribePatternTypesResponseBodyPatternTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribePatternTypesResponseBodyPatternTypes self = new DescribePatternTypesResponseBodyPatternTypes();
            return TeaModel.build(map, self);
        }

        public DescribePatternTypesResponseBodyPatternTypes setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribePatternTypesResponseBodyPatternTypes setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public DescribePatternTypesResponseBodyPatternTypes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribePatternTypesResponseBodyPatternTypes setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribePatternTypesResponseBodyPatternTypes setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

}
