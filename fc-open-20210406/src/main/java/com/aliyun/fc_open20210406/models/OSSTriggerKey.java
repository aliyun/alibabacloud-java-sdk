// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class OSSTriggerKey extends TeaModel {
    // prefix
    @NameInMap("prefix")
    public String prefix;

    // suffix
    @NameInMap("suffix")
    public String suffix;

    public static OSSTriggerKey build(java.util.Map<String, ?> map) throws Exception {
        OSSTriggerKey self = new OSSTriggerKey();
        return TeaModel.build(map, self);
    }

    public OSSTriggerKey setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public OSSTriggerKey setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

}
