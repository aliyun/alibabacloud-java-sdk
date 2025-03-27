// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class CreateAgAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoginEmail")
    public String loginEmail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BID</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountRequest self = new CreateAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgAccountRequest setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
        return this;
    }
    public String getLoginEmail() {
        return this.loginEmail;
    }

    public CreateAgAccountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
