// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetDeleteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsForce")
    public Boolean isForce;

    public static ConfigSetDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetDeleteRequest self = new ConfigSetDeleteRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetDeleteRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ConfigSetDeleteRequest setIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }
    public Boolean getIsForce() {
        return this.isForce;
    }

}
