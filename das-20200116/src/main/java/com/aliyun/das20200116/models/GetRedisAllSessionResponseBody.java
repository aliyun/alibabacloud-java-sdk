// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRedisAllSessionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetRedisAllSessionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Addr")
        public String addr;

        @NameInMap("Age")
        public String age;

        @NameInMap("Client")
        public String client;

        @NameInMap("ClientDesc")
        public String clientDesc;

        @NameInMap("Cmd")
        public String cmd;

        @NameInMap("Db")
        public Long db;

        @NameInMap("Events")
        public String events;

        @NameInMap("Fd")
        public Long fd;

        @NameInMap("Flags")
        public String flags;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Idle")
        public Long idle;

        @NameInMap("Multi")
        public Long multi;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Obl")
        public Long obl;

        @NameInMap("Oll")
        public Long oll;

        @NameInMap("Omem")
        public Long omem;

        @NameInMap("Psub")
        public Long psub;

        @NameInMap("Qbuf")
        public Long qbuf;

        @NameInMap("QbufFree")
        public Long qbufFree;

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
        @NameInMap("Count")
        public String count;

        @NameInMap("Ids")
        public java.util.List<Long> ids;

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
        @NameInMap("Sessions")
        public java.util.List<GetRedisAllSessionResponseBodyDataSessions> sessions;

        @NameInMap("SourceStats")
        public java.util.List<GetRedisAllSessionResponseBodyDataSourceStats> sourceStats;

        @NameInMap("Timestamp")
        public Long timestamp;

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
