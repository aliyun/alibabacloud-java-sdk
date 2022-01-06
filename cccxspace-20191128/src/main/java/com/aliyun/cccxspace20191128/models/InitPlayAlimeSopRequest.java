// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class InitPlayAlimeSopRequest extends TeaModel {
    // 请求端app
    @NameInMap("App")
    public InitPlayAlimeSopRequestApp app;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 会员信息
    @NameInMap("Member")
    public InitPlayAlimeSopRequestMember member;

    // SOP流程标识
    @NameInMap("SopFlowId")
    public String sopFlowId;

    public static InitPlayAlimeSopRequest build(java.util.Map<String, ?> map) throws Exception {
        InitPlayAlimeSopRequest self = new InitPlayAlimeSopRequest();
        return TeaModel.build(map, self);
    }

    public InitPlayAlimeSopRequest setApp(InitPlayAlimeSopRequestApp app) {
        this.app = app;
        return this;
    }
    public InitPlayAlimeSopRequestApp getApp() {
        return this.app;
    }

    public InitPlayAlimeSopRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InitPlayAlimeSopRequest setMember(InitPlayAlimeSopRequestMember member) {
        this.member = member;
        return this;
    }
    public InitPlayAlimeSopRequestMember getMember() {
        return this.member;
    }

    public InitPlayAlimeSopRequest setSopFlowId(String sopFlowId) {
        this.sopFlowId = sopFlowId;
        return this;
    }
    public String getSopFlowId() {
        return this.sopFlowId;
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

}
