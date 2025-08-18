// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyWuyingServerAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>yourPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>ws-0bw2f11****dial</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    /**
     * <strong>example:</strong>
     * <p>exampleServerName</p>
     */
    @NameInMap("WuyingServerName")
    public String wuyingServerName;

    public static ModifyWuyingServerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWuyingServerAttributeRequest self = new ModifyWuyingServerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWuyingServerAttributeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyWuyingServerAttributeRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public ModifyWuyingServerAttributeRequest setWuyingServerName(String wuyingServerName) {
        this.wuyingServerName = wuyingServerName;
        return this;
    }
    public String getWuyingServerName() {
        return this.wuyingServerName;
    }

}
