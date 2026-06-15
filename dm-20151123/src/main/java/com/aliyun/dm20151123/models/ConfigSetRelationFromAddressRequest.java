// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetRelationFromAddressRequest extends TeaModel {
    /**
     * <p>The sender address. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xxx.com">xxx@xxx.com</a></p>
     */
    @NameInMap("FromAddress")
    public String fromAddress;

    /**
     * <p>The ID of the configuration set. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    public static ConfigSetRelationFromAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetRelationFromAddressRequest self = new ConfigSetRelationFromAddressRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetRelationFromAddressRequest setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public ConfigSetRelationFromAddressRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
