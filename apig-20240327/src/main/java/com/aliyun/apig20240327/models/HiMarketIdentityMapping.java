// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketIdentityMapping extends TeaModel {
    /**
     * <p>The identity field name that corresponds to the mailbox.</p>
     * 
     * <strong>example:</strong>
     * <p>email</p>
     */
    @NameInMap("emailField")
    public String emailField;

    /**
     * <p>The identity field name that corresponds to the user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sub</p>
     */
    @NameInMap("userIdField")
    public String userIdField;

    /**
     * <p>The identity field name that corresponds to the username.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
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
