// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribePatternTypesResponseBody extends TeaModel {
    /**
     * <p>The instance types that meet the specified requirements.</p>
     */
    @NameInMap("PatternTypes")
    public java.util.List<DescribePatternTypesResponseBodyPatternTypes> patternTypes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
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
        /**
         * <p>The number of vCPUs that are assigned to the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The level of the instance family.</p>
         * <ul>
         * <li>EntryLevel: entry level (shared instance types) Instance types of this level are the most cost-effective but may not provide stable computing performance. Instance types of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * <li>CreditEntryLevel: credit-based entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The name of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The memory size that are assigned to the instance type. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
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
