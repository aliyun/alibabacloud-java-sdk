// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class InitPlayAlimeSopRequest extends TeaModel {
    @NameInMap("App")
    public InitPlayAlimeSopRequestApp app;

    @NameInMap("ExtParams")
    public java.util.Map<String, String> extParams;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Member")
    public InitPlayAlimeSopRequestMember member;

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

    public InitPlayAlimeSopRequest setExtParams(java.util.Map<String, String> extParams) {
        this.extParams = extParams;
        return this;
    }
    public java.util.Map<String, String> getExtParams() {
        return this.extParams;
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

}
