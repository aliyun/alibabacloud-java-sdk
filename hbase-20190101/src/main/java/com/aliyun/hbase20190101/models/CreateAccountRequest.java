// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The account name. The name must meet the following requirements:</p>
     * <ul>
     * <li>Starts with a lowercase letter and ends with a letter or digit.</li>
     * <li>Contains only lowercase letters, digits, or underscores.</li>
     * <li>Is 2 to 16 characters in length.</li>
     * <li>Cannot be a reserved username such as root or admin.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account. The password must meet the following requirements:</p>
     * <ul>
     * <li>Contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>The supported special characters are <code>!@#$%^&amp;*()_+-=</code>.</li>
     * <li>Is 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test*****</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
