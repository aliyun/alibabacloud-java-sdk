// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListSyslogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<ListSyslogsResponseBodyLogs> logs;

    /**
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FE2B22C-CF9D-59DE-BF63-DC9B9B33A9D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSyslogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSyslogsResponseBody self = new ListSyslogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSyslogsResponseBody setLogs(java.util.List<ListSyslogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListSyslogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListSyslogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSyslogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSyslogsResponseBodyLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i119583961673208491760</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN_PUBLIC</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>kern</p>
         */
        @NameInMap("Facility")
        public String facility;

        /**
         * <strong>example:</strong>
         * <p>damo-m53kr8kd-0008</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>114.55.254.44</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>bond4: failed to get link speed/duplex for eth8</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-9lb36u4s601</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <strong>example:</strong>
         * <p>21A401332</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <strong>example:</strong>
         * <p>damo-m53kr8kd-0008</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("Syslogtag")
        public String syslogtag;

        /**
         * <strong>example:</strong>
         * <p>damo-m53kr8kd-0008</p>
         */
        @NameInMap("TagHostname")
        public String tagHostname;

        /**
         * <strong>example:</strong>
         * <p>D990314D3C25D7E8-1080</p>
         */
        @NameInMap("TagPackId")
        public String tagPackId;

        /**
         * <strong>example:</strong>
         * <p>/var/log/kern</p>
         */
        @NameInMap("TagPath")
        public String tagPath;

        /**
         * <strong>example:</strong>
         * <p>1687363348</p>
         */
        @NameInMap("TagReceiveTime")
        public String tagReceiveTime;

        /**
         * <strong>example:</strong>
         * <p>application_b</p>
         */
        @NameInMap("TagUserDefinedId")
        public String tagUserDefinedId;

        /**
         * <strong>example:</strong>
         * <p>1687363346</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>logserver</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static ListSyslogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListSyslogsResponseBodyLogs self = new ListSyslogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListSyslogsResponseBodyLogs setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListSyslogsResponseBodyLogs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListSyslogsResponseBodyLogs setFacility(String facility) {
            this.facility = facility;
            return this;
        }
        public String getFacility() {
            return this.facility;
        }

        public ListSyslogsResponseBodyLogs setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListSyslogsResponseBodyLogs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListSyslogsResponseBodyLogs setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListSyslogsResponseBodyLogs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListSyslogsResponseBodyLogs setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListSyslogsResponseBodyLogs setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListSyslogsResponseBodyLogs setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListSyslogsResponseBodyLogs setSyslogtag(String syslogtag) {
            this.syslogtag = syslogtag;
            return this;
        }
        public String getSyslogtag() {
            return this.syslogtag;
        }

        public ListSyslogsResponseBodyLogs setTagHostname(String tagHostname) {
            this.tagHostname = tagHostname;
            return this;
        }
        public String getTagHostname() {
            return this.tagHostname;
        }

        public ListSyslogsResponseBodyLogs setTagPackId(String tagPackId) {
            this.tagPackId = tagPackId;
            return this;
        }
        public String getTagPackId() {
            return this.tagPackId;
        }

        public ListSyslogsResponseBodyLogs setTagPath(String tagPath) {
            this.tagPath = tagPath;
            return this;
        }
        public String getTagPath() {
            return this.tagPath;
        }

        public ListSyslogsResponseBodyLogs setTagReceiveTime(String tagReceiveTime) {
            this.tagReceiveTime = tagReceiveTime;
            return this;
        }
        public String getTagReceiveTime() {
            return this.tagReceiveTime;
        }

        public ListSyslogsResponseBodyLogs setTagUserDefinedId(String tagUserDefinedId) {
            this.tagUserDefinedId = tagUserDefinedId;
            return this;
        }
        public String getTagUserDefinedId() {
            return this.tagUserDefinedId;
        }

        public ListSyslogsResponseBodyLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListSyslogsResponseBodyLogs setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
