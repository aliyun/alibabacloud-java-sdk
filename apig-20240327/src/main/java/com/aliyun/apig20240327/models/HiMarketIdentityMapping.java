// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketIdentityMapping extends TeaModel {
    @NameInMap("emailField")
    public String emailField;

    @NameInMap("userIdField")
    public String userIdField;

    @NameInMap("userNameField")
    public String userNameField;

    public static HiMarketIdentityMapping build(java.util.Map<String, ?> map) throws Exception {
        HiMarketIdentityMapping self = new HiMarketIdentityMapping();
        return TeaModel.build(map, self);
    }

    public HiMarketIdentityMapping setEmailField(String emailField) {
        this.emailField = emailField;
        return this;
    }
    public String getEmailField() {
        return this.emailField;
    }

    public HiMarketIdentityMapping setUserIdField(String userIdField) {
        this.userIdField = userIdField;
        return this;
    }
    public String getUserIdField() {
        return this.userIdField;
    }

    public HiMarketIdentityMapping setUserNameField(String userNameField) {
        this.userNameField = userNameField;
        return this;
    }
    public String getUserNameField() {
        return this.userNameField;
    }

}
