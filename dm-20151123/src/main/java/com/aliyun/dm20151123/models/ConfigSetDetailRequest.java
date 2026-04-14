// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    public static ConfigSetDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetDetailRequest self = new ConfigSetDetailRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
