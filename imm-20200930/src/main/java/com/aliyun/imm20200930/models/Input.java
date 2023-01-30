// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Input extends TeaModel {
    @NameInMap("OSS")
    public InputOSS OSS;

    public static Input build(java.util.Map<String, ?> map) throws Exception {
        Input self = new Input();
        return TeaModel.build(map, self);
    }

    public Input setOSS(InputOSS OSS) {
        this.OSS = OSS;
        return this;
    }
    public InputOSS getOSS() {
        return this.OSS;
    }

}
