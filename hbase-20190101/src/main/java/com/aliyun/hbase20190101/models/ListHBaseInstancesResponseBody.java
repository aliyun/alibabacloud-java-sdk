// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListHBaseInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public ListHBaseInstancesResponseBodyInstances instances;

    /**
     * <strong>example:</strong>
     * <p>89F81C30-320B-4550-91DB-C37C81D2358F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHBaseInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHBaseInstancesResponseBody self = new ListHBaseInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHBaseInstancesResponseBody setInstances(ListHBaseInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public ListHBaseInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public ListHBaseInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHBaseInstancesResponseBodyInstancesInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hb-t4naqsay5gn****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>name_test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        public static ListHBaseInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListHBaseInstancesResponseBodyInstancesInstance self = new ListHBaseInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public ListHBaseInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListHBaseInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListHBaseInstancesResponseBodyInstancesInstance setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

    public static class ListHBaseInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListHBaseInstancesResponseBodyInstancesInstance> instance;

        public static ListHBaseInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListHBaseInstancesResponseBodyInstances self = new ListHBaseInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListHBaseInstancesResponseBodyInstances setInstance(java.util.List<ListHBaseInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListHBaseInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
