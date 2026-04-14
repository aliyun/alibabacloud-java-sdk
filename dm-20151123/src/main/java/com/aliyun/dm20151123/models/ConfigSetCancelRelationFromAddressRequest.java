// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCancelRelationFromAddressRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xxx.com">xxx@xxx.com</a></p>
     */
    @NameInMap("FromAddress")
    public String fromAddress;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    public static ConfigSetCancelRelationFromAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCancelRelationFromAddressRequest self = new ConfigSetCancelRelationFromAddressRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetCancelRelationFromAddressRequest setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public ConfigSetCancelRelationFromAddressRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
