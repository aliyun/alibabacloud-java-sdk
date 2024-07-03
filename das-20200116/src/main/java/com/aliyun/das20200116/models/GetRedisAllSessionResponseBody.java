// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRedisAllSessionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The session data.</p>
     */
    @NameInMap("Data")
    public GetRedisAllSessionResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40C6E9AF-6C23-5614-AA83-34344CC6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRedisAllSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRedisAllSessionResponseBody self = new GetRedisAllSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRedisAllSessionResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetRedisAllSessionResponseBody setData(GetRedisAllSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRedisAllSessionResponseBodyData getData() {
        return this.data;
    }

    public GetRedisAllSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRedisAllSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRedisAllSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRedisAllSessionResponseBodyDataSessions extends TeaModel {
        /**
         * <p>The IP address and port number of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX:53458</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The connection duration of the session. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Age")
        public String age;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Client")
        public String client;

        /**
         * <p>The alias of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>prod ip</p>
         */
        @NameInMap("ClientDesc")
        public String clientDesc;

        /**
         * <p>The command that was last run.</p>
         * 
         * <strong>example:</strong>
         * <p>PING</p>
         */
        @NameInMap("Cmd")
        public String cmd;

        /**
         * <p>The ID of the database that the client is using.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Db")
        public Long db;

        /**
         * <p>The file descriptor event. Valid values:</p>
         * <ul>
         * <li><strong>r</strong>: Client sockets are readable in the event loop.</li>
         * <li><strong>w</strong>: Client sockets are writable in the event loop.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>r</p>
         */
        @NameInMap("Events")
        public String events;

        /**
         * <p>The file descriptor that is used by sockets.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("Fd")
        public Long fd;

        /**
         * <p>The client flag. Valid values:</p>
         * <ul>
         * <li><strong>A</strong>: The connection needs to be closed at the earliest opportunity.</li>
         * <li><strong>b</strong>: The client is waiting for blocked events.</li>
         * <li><strong>c</strong>: The connection is closed after all replies are written.</li>
         * <li><strong>d</strong>: The monitored keys have been modified, and the <code>EXEC</code> command is about to fail.</li>
         * <li><strong>i</strong>: The client is waiting for VM I/O operations. This value is no longer used.</li>
         * <li><strong>M</strong>: The client is the primary node.</li>
         * <li><strong>N</strong>: No special flags are configured.</li>
         * <li><strong>O</strong>: The client is in monitor mode.</li>
         * <li><strong>r</strong>: The client is a cluster node in read-only mode.</li>
         * <li><strong>S</strong>: The client is a replica node in normal mode.</li>
         * <li><strong>u</strong>: The client is not blocked.</li>
         * <li><strong>U</strong>: The client is connected by using UNIX domain sockets.</li>
         * <li><strong>x</strong>: The client is executing a transaction.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("Flags")
        public String flags;

        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9080586</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The duration during which the session is in the idle state. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Idle")
        public Long idle;

        /**
         * <p>The number of commands in <code>MULTI</code> or <code>EXEC</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Multi")
        public Long multi;

        /**
         * <p>The name of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-2zemyfd1sh1u2i****-proxy-14#1679****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The size of the fixed output buffer. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Obl")
        public Long obl;

        /**
         * <p>The number of objects contained in the output list.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Oll")
        public Long oll;

        /**
         * <p>The size of the output buffer. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Omem")
        public Long omem;

        /**
         * <p>The number of subscriptions that match the pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Psub")
        public Long psub;

        /**
         * <p>The size of the input buffer. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Qbuf")
        public Long qbuf;

        /**
         * <p>The remaining size of the input buffer. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QbufFree")
        public Long qbufFree;

        /**
         * <p>The number of subscribed channels.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Sub")
        public Long sub;

        public static GetRedisAllSessionResponseBodyDataSessions build(java.util.Map<String, ?> map) throws Exception {
            GetRedisAllSessionResponseBodyDataSessions self = new GetRedisAllSessionResponseBodyDataSessions();
            return TeaModel.build(map, self);
        }

        public GetRedisAllSessionResponseBodyDataSessions setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public GetRedisAllSessionResponseBodyDataSessions setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public GetRedisAllSessionResponseBodyDataSessions setClient(String client) {
            this.client = client;
            return this;
        }
        public String getClient() {
            return this.client;
        }

        public GetRedisAllSessionResponseBodyDataSessions setClientDesc(String clientDesc) {
            this.clientDesc = clientDesc;
            return this;
        }
        public String getClientDesc() {
            return this.clientDesc;
        }

        public GetRedisAllSessionResponseBodyDataSessions setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public GetRedisAllSessionResponseBodyDataSessions setDb(Long db) {
            this.db = db;
            return this;
        }
        public Long getDb() {
            return this.db;
        }

        public GetRedisAllSessionResponseBodyDataSessions setEvents(String events) {
            this.events = events;
            return this;
        }
        public String getEvents() {
            return this.events;
        }

        public GetRedisAllSessionResponseBodyDataSessions setFd(Long fd) {
            this.fd = fd;
            return this;
        }
        public Long getFd() {
            return this.fd;
        }

        public GetRedisAllSessionResponseBodyDataSessions setFlags(String flags) {
            this.flags = flags;
            return this;
        }
        public String getFlags() {
            return this.flags;
        }

        public GetRedisAllSessionResponseBodyDataSessions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRedisAllSessionResponseBodyDataSessions setIdle(Long idle) {
            this.idle = idle;
            return this;
        }
        public Long getIdle() {
            return this.idle;
        }

        public GetRedisAllSessionResponseBodyDataSessions setMulti(Long multi) {
            this.multi = multi;
            return this;
        }
        public Long getMulti() {
            return this.multi;
        }

        public GetRedisAllSessionResponseBodyDataSessions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRedisAllSessionResponseBodyDataSessions setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetRedisAllSessionResponseBodyDataSessions setObl(Long obl) {
            this.obl = obl;
            return this;
        }
        public Long getObl() {
            return this.obl;
        }

        public GetRedisAllSessionResponseBodyDataSessions setOll(Long oll) {
            this.oll = oll;
            return this;
        }
        public Long getOll() {
            return this.oll;
        }

        public GetRedisAllSessionResponseBodyDataSessions setOmem(Long omem) {
            this.omem = omem;
            return this;
        }
        public Long getOmem() {
            return this.omem;
        }

        public GetRedisAllSessionResponseBodyDataSessions setPsub(Long psub) {
            this.psub = psub;
            return this;
        }
        public Long getPsub() {
            return this.psub;
        }

        public GetRedisAllSessionResponseBodyDataSessions setQbuf(Long qbuf) {
            this.qbuf = qbuf;
            return this;
        }
        public Long getQbuf() {
            return this.qbuf;
        }

        public GetRedisAllSessionResponseBodyDataSessions setQbufFree(Long qbufFree) {
            this.qbufFree = qbufFree;
            return this;
        }
        public Long getQbufFree() {
            return this.qbufFree;
        }

        public GetRedisAllSessionResponseBodyDataSessions setSub(Long sub) {
            this.sub = sub;
            return this;
        }
        public Long getSub() {
            return this.sub;
        }

    }

    public static class GetRedisAllSessionResponseBodyDataSourceStats extends TeaModel {
        /**
         * <p>The total number of sessions from the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The client IDs.</p>
         */
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <p>The access source.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Key")
        public String key;

        public static GetRedisAllSessionResponseBodyDataSourceStats build(java.util.Map<String, ?> map) throws Exception {
            GetRedisAllSessionResponseBodyDataSourceStats self = new GetRedisAllSessionResponseBodyDataSourceStats();
            return TeaModel.build(map, self);
        }

        public GetRedisAllSessionResponseBodyDataSourceStats setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public GetRedisAllSessionResponseBodyDataSourceStats setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public GetRedisAllSessionResponseBodyDataSourceStats setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetRedisAllSessionResponseBodyData extends TeaModel {
        /**
         * <p>The information about the sessions.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<GetRedisAllSessionResponseBodyDataSessions> sessions;

        /**
         * <p>The statistics on the access source.</p>
         */
        @NameInMap("SourceStats")
        public java.util.List<GetRedisAllSessionResponseBodyDataSourceStats> sourceStats;

        /**
         * <p>The time when the instance sessions were returned. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1660100753556</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetRedisAllSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRedisAllSessionResponseBodyData self = new GetRedisAllSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRedisAllSessionResponseBodyData setSessions(java.util.List<GetRedisAllSessionResponseBodyDataSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<GetRedisAllSessionResponseBodyDataSessions> getSessions() {
            return this.sessions;
        }

        public GetRedisAllSessionResponseBodyData setSourceStats(java.util.List<GetRedisAllSessionResponseBodyDataSourceStats> sourceStats) {
            this.sourceStats = sourceStats;
            return this;
        }
        public java.util.List<GetRedisAllSessionResponseBodyDataSourceStats> getSourceStats() {
            return this.sourceStats;
        }

        public GetRedisAllSessionResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetRedisAllSessionResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
