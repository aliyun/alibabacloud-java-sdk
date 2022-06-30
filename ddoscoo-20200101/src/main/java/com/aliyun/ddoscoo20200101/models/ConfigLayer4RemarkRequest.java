// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RemarkRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    public static ConfigLayer4RemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RemarkRequest self = new ConfigLayer4RemarkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RemarkRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
