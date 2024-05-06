// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ListHbaseInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public ListHbaseInstancesResponseBodyInstances instances;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHbaseInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHbaseInstancesResponseBody self = new ListHbaseInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHbaseInstancesResponseBody setInstances(ListHbaseInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public ListHbaseInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public ListHbaseInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHbaseInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        public static ListHbaseInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListHbaseInstancesResponseBodyInstancesInstance self = new ListHbaseInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public ListHbaseInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListHbaseInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListHbaseInstancesResponseBodyInstancesInstance setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

    public static class ListHbaseInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListHbaseInstancesResponseBodyInstancesInstance> instance;

        public static ListHbaseInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListHbaseInstancesResponseBodyInstances self = new ListHbaseInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListHbaseInstancesResponseBodyInstances setInstance(java.util.List<ListHbaseInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListHbaseInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
