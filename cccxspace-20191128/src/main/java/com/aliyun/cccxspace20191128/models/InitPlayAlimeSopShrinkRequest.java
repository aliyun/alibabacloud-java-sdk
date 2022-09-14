// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class InitPlayAlimeSopShrinkRequest extends TeaModel {
    @NameInMap("App")
    public InitPlayAlimeSopShrinkRequestApp app;

    @NameInMap("ExtParams")
    public String extParamsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Member")
    public InitPlayAlimeSopShrinkRequestMember member;

    @NameInMap("SopFlowId")
    public String sopFlowId;

    public static InitPlayAlimeSopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InitPlayAlimeSopShrinkRequest self = new InitPlayAlimeSopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InitPlayAlimeSopShrinkRequest setApp(InitPlayAlimeSopShrinkRequestApp app) {
        this.app = app;
        return this;
    }
    public InitPlayAlimeSopShrinkRequestApp getApp() {
        return this.app;
    }

    public InitPlayAlimeSopShrinkRequest setExtParamsShrink(String extParamsShrink) {
        this.extParamsShrink = extParamsShrink;
        return this;
    }
    public String getExtParamsShrink() {
        return this.extParamsShrink;
    }

    public InitPlayAlimeSopShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InitPlayAlimeSopShrinkRequest setMember(InitPlayAlimeSopShrinkRequestMember member) {
        this.member = member;
        return this;
    }
    public InitPlayAlimeSopShrinkRequestMember getMember() {
        return this.member;
    }

    public InitPlayAlimeSopShrinkRequest setSopFlowId(String sopFlowId) {
        this.sopFlowId = sopFlowId;
        return this;
    }
    public String getSopFlowId() {
        return this.sopFlowId;
    }

    public static class InitPlayAlimeSopShrinkRequestApp extends TeaModel {
        @NameInMap("Locale")
        public String locale;

        @NameInMap("Name")
        public String name;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("TerminalType")
        public String terminalType;

        public static InitPlayAlimeSopShrinkRequestApp build(java.util.Map<String, ?> map) throws Exception {
            InitPlayAlimeSopShrinkRequestApp self = new InitPlayAlimeSopShrinkRequestApp();
            return TeaModel.build(map, self);
        }

        public InitPlayAlimeSopShrinkRequestApp setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public InitPlayAlimeSopShrinkRequestApp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitPlayAlimeSopShrinkRequestApp setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public InitPlayAlimeSopShrinkRequestApp setTerminalType(String terminalType) {
            this.terminalType = terminalType;
            return this;
        }
        public String getTerminalType() {
            return this.terminalType;
        }

    }

    public static class InitPlayAlimeSopShrinkRequestMember extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Nick")
        public String nick;

        public static InitPlayAlimeSopShrinkRequestMember build(java.util.Map<String, ?> map) throws Exception {
            InitPlayAlimeSopShrinkRequestMember self = new InitPlayAlimeSopShrinkRequestMember();
            return TeaModel.build(map, self);
        }

        public InitPlayAlimeSopShrinkRequestMember setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InitPlayAlimeSopShrinkRequestMember setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

    }

}
