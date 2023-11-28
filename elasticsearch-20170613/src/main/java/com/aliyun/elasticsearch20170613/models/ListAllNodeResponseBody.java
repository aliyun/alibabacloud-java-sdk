// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAllNodeResponseBody extends TeaModel {
    /**
     * <p>The zone ID of the node.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The CPU utilization.</p>
     * <br>
     * <p>>  If the **extended** request parameter is set to **true** and the monitoring information of the nodes in the cluster is being synchronized, the value of the cpuPercent parameter is null. In this case, you need to send a request again after 10 seconds to obtain the value of the cpuPercent parameter.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListAllNodeResponseBodyResult> result;

    public static ListAllNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllNodeResponseBody self = new ListAllNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllNodeResponseBody setResult(java.util.List<ListAllNodeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAllNodeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAllNodeResponseBodyResult extends TeaModel {
        /**
         * <p>The disk usage.</p>
         */
        @NameInMap("cpuPercent")
        public String cpuPercent;

        /**
         * <p>The health status of the node. Valid values: GREEN, YELLOW, RED, and GRAY.</p>
         */
        @NameInMap("diskUsedPercent")
        public String diskUsedPercent;

        @NameInMap("health")
        public String health;

        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("heapPercent")
        public String heapPercent;

        /**
         * <p>The port that is used to connect to the node.</p>
         */
        @NameInMap("host")
        public String host;

        @NameInMap("loadOneM")
        public String loadOneM;

        /**
         * <p>The 1-minute load of the node.</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        @NameInMap("port")
        public Integer port;

        /**
         * <p>The type of the nodes. Valid values:</p>
         * <br>
         * <p>*   MASTER: dedicated master node</p>
         * <p>*   WORKER: hot node</p>
         * <p>*   WORKER_WARM: warm node</p>
         * <p>*   COORDINATING: client node</p>
         * <p>*   KIBANA: Kibana node</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ListAllNodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAllNodeResponseBodyResult self = new ListAllNodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAllNodeResponseBodyResult setCpuPercent(String cpuPercent) {
            this.cpuPercent = cpuPercent;
            return this;
        }
        public String getCpuPercent() {
            return this.cpuPercent;
        }

        public ListAllNodeResponseBodyResult setDiskUsedPercent(String diskUsedPercent) {
            this.diskUsedPercent = diskUsedPercent;
            return this;
        }
        public String getDiskUsedPercent() {
            return this.diskUsedPercent;
        }

        public ListAllNodeResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListAllNodeResponseBodyResult setHeapPercent(String heapPercent) {
            this.heapPercent = heapPercent;
            return this;
        }
        public String getHeapPercent() {
            return this.heapPercent;
        }

        public ListAllNodeResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAllNodeResponseBodyResult setLoadOneM(String loadOneM) {
            this.loadOneM = loadOneM;
            return this;
        }
        public String getLoadOneM() {
            return this.loadOneM;
        }

        public ListAllNodeResponseBodyResult setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListAllNodeResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListAllNodeResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
