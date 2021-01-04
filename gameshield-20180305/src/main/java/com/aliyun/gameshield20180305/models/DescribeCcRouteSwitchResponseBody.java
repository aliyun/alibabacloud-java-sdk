// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcRouteSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Switch")
    public DescribeCcRouteSwitchResponseBody_switch _switch;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeCcRouteSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcRouteSwitchResponseBody self = new DescribeCcRouteSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcRouteSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcRouteSwitchResponseBody set_switch(DescribeCcRouteSwitchResponseBody_switch _switch) {
        this._switch = _switch;
        return this;
    }
    public DescribeCcRouteSwitchResponseBody_switch get_switch() {
        return this._switch;
    }

    public DescribeCcRouteSwitchResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeCcRouteSwitchResponseBodySwitch extends TeaModel {
        @NameInMap("Enable")
        public Integer enable;

        public static DescribeCcRouteSwitchResponseBodySwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcRouteSwitchResponseBodySwitch self = new DescribeCcRouteSwitchResponseBodySwitch();
            return TeaModel.build(map, self);
        }

        public DescribeCcRouteSwitchResponseBodySwitch setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

    }

}
