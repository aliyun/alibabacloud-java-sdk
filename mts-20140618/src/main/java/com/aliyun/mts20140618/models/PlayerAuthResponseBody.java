// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class PlayerAuthResponseBody extends TeaModel {
    @NameInMap("LogURL")
    public String logURL;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SwitchList")
    public PlayerAuthResponseBodySwitchList switchList;

    public static PlayerAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlayerAuthResponseBody self = new PlayerAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public PlayerAuthResponseBody setLogURL(String logURL) {
        this.logURL = logURL;
        return this;
    }
    public String getLogURL() {
        return this.logURL;
    }

    public PlayerAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PlayerAuthResponseBody setSwitchList(PlayerAuthResponseBodySwitchList switchList) {
        this.switchList = switchList;
        return this;
    }
    public PlayerAuthResponseBodySwitchList getSwitchList() {
        return this.switchList;
    }

    public static class PlayerAuthResponseBodySwitchListSwitch extends TeaModel {
        @NameInMap("FunctionId")
        public String functionId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("State")
        public String state;

        @NameInMap("SwitchId")
        public String switchId;

        public static PlayerAuthResponseBodySwitchListSwitch build(java.util.Map<String, ?> map) throws Exception {
            PlayerAuthResponseBodySwitchListSwitch self = new PlayerAuthResponseBodySwitchListSwitch();
            return TeaModel.build(map, self);
        }

        public PlayerAuthResponseBodySwitchListSwitch setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public PlayerAuthResponseBodySwitchListSwitch setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public PlayerAuthResponseBodySwitchListSwitch setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public PlayerAuthResponseBodySwitchListSwitch setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

    public static class PlayerAuthResponseBodySwitchList extends TeaModel {
        @NameInMap("Switch")
        public java.util.List<PlayerAuthResponseBodySwitchListSwitch> _switch;

        public static PlayerAuthResponseBodySwitchList build(java.util.Map<String, ?> map) throws Exception {
            PlayerAuthResponseBodySwitchList self = new PlayerAuthResponseBodySwitchList();
            return TeaModel.build(map, self);
        }

        public PlayerAuthResponseBodySwitchList set_switch(java.util.List<PlayerAuthResponseBodySwitchListSwitch> _switch) {
            this._switch = _switch;
            return this;
        }
        public java.util.List<PlayerAuthResponseBodySwitchListSwitch> get_switch() {
            return this._switch;
        }

    }

}
