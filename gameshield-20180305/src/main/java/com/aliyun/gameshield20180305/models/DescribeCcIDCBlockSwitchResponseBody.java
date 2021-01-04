// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcIDCBlockSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("CcSwitch")
    public DescribeCcIDCBlockSwitchResponseBodyCcSwitch ccSwitch;

    public static DescribeCcIDCBlockSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcIDCBlockSwitchResponseBody self = new DescribeCcIDCBlockSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcIDCBlockSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcIDCBlockSwitchResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeCcIDCBlockSwitchResponseBody setCcSwitch(DescribeCcIDCBlockSwitchResponseBodyCcSwitch ccSwitch) {
        this.ccSwitch = ccSwitch;
        return this;
    }
    public DescribeCcIDCBlockSwitchResponseBodyCcSwitch getCcSwitch() {
        return this.ccSwitch;
    }

    public static class DescribeCcIDCBlockSwitchResponseBodyCcSwitch extends TeaModel {
        @NameInMap("Enable")
        public Integer enable;

        public static DescribeCcIDCBlockSwitchResponseBodyCcSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcIDCBlockSwitchResponseBodyCcSwitch self = new DescribeCcIDCBlockSwitchResponseBodyCcSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeCcIDCBlockSwitchResponseBodyCcSwitch setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

    }

}
