// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRedisAllSessionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
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
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
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
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The connection duration of the session. Unit: seconds.</p>
         */
        @NameInMap("Age")
        public String age;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("Client")
        public String client;

        /**
         * <p>The alias of the client.</p>
         */
        @NameInMap("ClientDesc")
        public String clientDesc;

        /**
         * <p>The command that is last executed.</p>
         */
        @NameInMap("Cmd")
        public String cmd;

        /**
         * <p>The ID of the database that the client is using.</p>
         */
        @NameInMap("Db")
        public Long db;

        /**
         * <p>The file descriptor event. Valid values:</p>
         * <br>
         * <p>* **r**: Client sockets are readable in the event loop.</p>
         * <p>* **w**: Client sockets are writable in the event loop.</p>
         */
        @NameInMap("Events")
        public String events;

        /**
         * <p>The file descriptor that is used by sockets.</p>
         */
        @NameInMap("Fd")
        public Long fd;

        /**
         * <p>The client flag. Valid values:</p>
         * <br>
         * <p>* **A**: The connection needs to be closed at the earliest opportunity.</p>
         * <p>* **b**: The client is waiting for blocked events.</p>
         * <p>* **c**: The connection is closed after all replies are written.</p>
         * <p>* **d**: The monitored keys have been modified, and the *`EXEC`* command is about to fail.</p>
         * <p>* **i**: The client is waiting for VM I/O operations. This value is deprecated.</p>
         * <p>* **M**: The client is the primary node.</p>
         * <p>* **N**: Special flags are not configured.</p>
         * <p>* **O**: The client is in monitor mode.</p>
         * <p>* **r**: The client is a cluster node in read-only mode.</p>
         * <p>* **S**: The client is a replica node in normal mode.</p>
         * <p>* **u**: The client is not blocked.</p>
         * <p>* **U**: The client is connected by using UNIX domain sockets.</p>
         * <p>* **x**: The client is executing a transaction.</p>
         */
        @NameInMap("Flags")
        public String flags;

        /**
         * <p>The client ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The duration during which the session is in the idle state. Unit: seconds.</p>
         */
        @NameInMap("Idle")
        public Long idle;

        /**
         * <p>The number of commands in *`MULTI`* or *`EXEC`*.</p>
         */
        @NameInMap("Multi")
        public Long multi;

        /**
         * <p>The name of the client.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node ID.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The size of the fixed output buffer. Unit: bytes.</p>
         */
        @NameInMap("Obl")
        public Long obl;

        /**
         * <p>The number of objects contained in the output list.</p>
         */
        @NameInMap("Oll")
        public Long oll;

        /**
         * <p>The size of the output buffer. Unit: bytes.</p>
         */
        @NameInMap("Omem")
        public Long omem;

        /**
         * <p>The number of subscriptions that match the pattern.</p>
         */
        @NameInMap("Psub")
        public Long psub;

        /**
         * <p>The size of the input buffer. Unit: bytes.</p>
         */
        @NameInMap("Qbuf")
        public Long qbuf;

        /**
         * <p>The remaining size of the input buffer. Unit: bytes.</p>
         */
        @NameInMap("QbufFree")
        public Long qbufFree;

        /**
         * <p>The number of subscribed channels.</p>
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
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The client ID data.</p>
         */
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <p>The access source.</p>
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
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total number of sessions.</p>
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
