// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Topologys")
    public DescribeInstanceTopologyResponseBodyTopologys topologys;

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

    public DescribeInstanceTopologyResponseBody setTopologys(DescribeInstanceTopologyResponseBodyTopologys topologys) {
        this.topologys = topologys;
        return this;
    }
    public DescribeInstanceTopologyResponseBodyTopologys getTopologys() {
        return this.topologys;
    }

    public static class DescribeInstanceTopologyResponseBodyTopologysTopology extends TeaModel {
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceTopologyResponseBodyTopologysTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyTopologysTopology self = new DescribeInstanceTopologyResponseBodyTopologysTopology();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyTopologysTopology setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeInstanceTopologyResponseBodyTopologysTopology setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyTopologys extends TeaModel {
        @NameInMap("Topology")
        public java.util.List<DescribeInstanceTopologyResponseBodyTopologysTopology> topology;

        public static DescribeInstanceTopologyResponseBodyTopologys build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyTopologys self = new DescribeInstanceTopologyResponseBodyTopologys();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyTopologys setTopology(java.util.List<DescribeInstanceTopologyResponseBodyTopologysTopology> topology) {
            this.topology = topology;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyTopologysTopology> getTopology() {
            return this.topology;
        }

    }

}
