// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetAccountRequest extends TeaModel {
    /**
     * <p>The name of the initial account. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The name must start with a lowercase letter and end with a lowercase letter or digit.</li>
     * <li>The name cannot start with gp.</li>
     * <li>The name must be 2 to 16 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can specify up to 30 instance IDs for batch operations. Separate multiple instance IDs with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static GetAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountRequest self = new GetAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetAccountRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
