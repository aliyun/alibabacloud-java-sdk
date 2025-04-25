// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceBootConfigurationResponseBody extends TeaModel {
    /**
     * <p>Schema of Response</p>
     */
    @NameInMap("Instances")
    public DescribeInstanceBootConfigurationResponseBodyInstances instances;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceBootConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBootConfigurationResponseBody self = new DescribeInstanceBootConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBootConfigurationResponseBody setInstances(DescribeInstanceBootConfigurationResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstanceBootConfigurationResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstanceBootConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceBootConfigurationResponseBodyInstances extends TeaModel {
        /**
         * <p>The startup method.</p>
         * 
         * <strong>example:</strong>
         * <p>legacy</p>
         */
        @NameInMap("BootSet")
        public String bootSet;

        /**
         * <p>The startup type.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("BootType")
        public String bootType;

        /**
         * <p>Specifies whether the startup depends on the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DiskSet")
        public String diskSet;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceBootConfigurationResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceBootConfigurationResponseBodyInstances self = new DescribeInstanceBootConfigurationResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceBootConfigurationResponseBodyInstances setBootSet(String bootSet) {
            this.bootSet = bootSet;
            return this;
        }
        public String getBootSet() {
            return this.bootSet;
        }

        public DescribeInstanceBootConfigurationResponseBodyInstances setBootType(String bootType) {
            this.bootType = bootType;
            return this;
        }
        public String getBootType() {
            return this.bootType;
        }

        public DescribeInstanceBootConfigurationResponseBodyInstances setDiskSet(String diskSet) {
            this.diskSet = diskSet;
            return this;
        }
        public String getDiskSet() {
            return this.diskSet;
        }

        public DescribeInstanceBootConfigurationResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
