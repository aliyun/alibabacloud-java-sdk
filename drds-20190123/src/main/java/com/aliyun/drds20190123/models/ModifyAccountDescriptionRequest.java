// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionRequest extends TeaModel {
    /**
     * <p>The name of the member account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The description of the account.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the ApsaraDB RDS for PostgreSQL instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static ModifyAccountDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionRequest self = new ModifyAccountDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAccountDescriptionRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
