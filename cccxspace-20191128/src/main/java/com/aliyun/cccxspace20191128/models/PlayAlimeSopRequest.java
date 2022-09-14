// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class PlayAlimeSopRequest extends TeaModel {
    @NameInMap("Data")
    public PlayAlimeSopRequestData data;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Uuid")
    public String uuid;

    public static PlayAlimeSopRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayAlimeSopRequest self = new PlayAlimeSopRequest();
        return TeaModel.build(map, self);
    }

    public PlayAlimeSopRequest setData(PlayAlimeSopRequestData data) {
        this.data = data;
        return this;
    }
    public PlayAlimeSopRequestData getData() {
        return this.data;
    }

    public PlayAlimeSopRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PlayAlimeSopRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class InitPlayAlimeSopRequestApp extends TeaModel {
        @NameInMap("Locale")
        public String locale;

        @NameInMap("Name")
        public String name;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("TerminalType")
        public String terminalType;

        public static InitPlayAlimeSopRequestApp build(java.util.Map<String, ?> map) throws Exception {
            InitPlayAlimeSopRequestApp self = new InitPlayAlimeSopRequestApp();
            return TeaModel.build(map, self);
        }

        public InitPlayAlimeSopRequestApp setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public InitPlayAlimeSopRequestApp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitPlayAlimeSopRequestApp setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public InitPlayAlimeSopRequestApp setTerminalType(String terminalType) {
            this.terminalType = terminalType;
            return this;
        }
        public String getTerminalType() {
            return this.terminalType;
        }

    }

    public static class InitPlayAlimeSopRequestMember extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Nick")
        public String nick;

        public static InitPlayAlimeSopRequestMember build(java.util.Map<String, ?> map) throws Exception {
            InitPlayAlimeSopRequestMember self = new InitPlayAlimeSopRequestMember();
            return TeaModel.build(map, self);
        }

        public InitPlayAlimeSopRequestMember setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InitPlayAlimeSopRequestMember setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

    }

    public static class PlayAlimeSopRequestData extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeType")
        public String nodeType;

        public static PlayAlimeSopRequestData build(java.util.Map<String, ?> map) throws Exception {
            PlayAlimeSopRequestData self = new PlayAlimeSopRequestData();
            return TeaModel.build(map, self);
        }

        public PlayAlimeSopRequestData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PlayAlimeSopRequestData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public PlayAlimeSopRequestData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

}
