// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAllNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("heapPercent")
        public String heapPercent;

        @NameInMap("zoneId")
        public String zoneId;

        @NameInMap("hostName")
        public String hostName;

        @NameInMap("cpuPercent")
        public String cpuPercent;

        @NameInMap("host")
        public String host;

        @NameInMap("nodeType")
        public String nodeType;

        @NameInMap("diskUsedPercent")
        public String diskUsedPercent;

        @NameInMap("port")
        public Integer port;

        @NameInMap("loadOneM")
        public String loadOneM;

        @NameInMap("health")
        public String health;

        public static ListAllNodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAllNodeResponseBodyResult self = new ListAllNodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAllNodeResponseBodyResult setHeapPercent(String heapPercent) {
            this.heapPercent = heapPercent;
            return this;
        }
        public String getHeapPercent() {
            return this.heapPercent;
        }

        public ListAllNodeResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListAllNodeResponseBodyResult setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListAllNodeResponseBodyResult setCpuPercent(String cpuPercent) {
            this.cpuPercent = cpuPercent;
            return this;
        }
        public String getCpuPercent() {
            return this.cpuPercent;
        }

        public ListAllNodeResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAllNodeResponseBodyResult setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListAllNodeResponseBodyResult setDiskUsedPercent(String diskUsedPercent) {
            this.diskUsedPercent = diskUsedPercent;
            return this;
        }
        public String getDiskUsedPercent() {
            return this.diskUsedPercent;
        }

        public ListAllNodeResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListAllNodeResponseBodyResult setLoadOneM(String loadOneM) {
            this.loadOneM = loadOneM;
            return this;
        }
        public String getLoadOneM() {
            return this.loadOneM;
        }

        public ListAllNodeResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

    }

}
