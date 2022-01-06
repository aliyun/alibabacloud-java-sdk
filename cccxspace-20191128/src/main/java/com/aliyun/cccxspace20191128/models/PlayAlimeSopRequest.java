// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class PlayAlimeSopRequest extends TeaModel {
    // 请求数据
    @NameInMap("Data")
    public PlayAlimeSopRequestData data;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求uuid
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
        // 语言（默认zh）
        @NameInMap("Locale")
        public String locale;

        // app名称
        @NameInMap("Name")
        public String name;

        // 平台类型（默认xspace）
        @NameInMap("Platform")
        public String platform;

        // 终端类型
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
        // 会员id
        @NameInMap("Id")
        public String id;

        // 昵称
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
        // 节点数据json
        @NameInMap("Data")
        public String data;

        // 节点id
        @NameInMap("NodeId")
        public String nodeId;

        // 节点类别
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
