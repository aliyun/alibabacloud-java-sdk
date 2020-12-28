// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Topologys")
    public java.util.List<DescribeInstanceTopologyResponseBodyTopologys> topologys;

    public static DescribeInstanceTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTopologyResponseBody self = new DescribeInstanceTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTopologyResponseBody setTopologys(java.util.List<DescribeInstanceTopologyResponseBodyTopologys> topologys) {
        this.topologys = topologys;
        return this;
    }
    public java.util.List<DescribeInstanceTopologyResponseBodyTopologys> getTopologys() {
        return this.topologys;
    }

    public static class DescribeInstanceTopologyResponseBodyTopologys extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("HostId")
        public String hostId;

        public static DescribeInstanceTopologyResponseBodyTopologys build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyTopologys self = new DescribeInstanceTopologyResponseBodyTopologys();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyTopologys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceTopologyResponseBodyTopologys setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
