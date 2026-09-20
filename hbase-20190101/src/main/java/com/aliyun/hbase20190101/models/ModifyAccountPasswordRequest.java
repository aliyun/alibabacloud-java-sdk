// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordRequest extends TeaModel {
    /**
     * <p>The name of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The ID of target instance. You can call the DescribeInstances operation to obtain target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The new password of the account. The password must meet the following requirements:</p>
     * <ul>
     * <li>Contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Is 8 to 32 characters in length.</li>
     * <li>Special characters include <code>!@#$%^&amp;*()_+-=</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test*****</p>
     */
    @NameInMap("NewAccountPassword")
    public String newAccountPassword;

    public static ModifyAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordRequest self = new ModifyAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountPasswordRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyAccountPasswordRequest setNewAccountPassword(String newAccountPassword) {
        this.newAccountPassword = newAccountPassword;
        return this;
    }
    public String getNewAccountPassword() {
        return this.newAccountPassword;
    }

}
