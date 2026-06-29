// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateTokenPlanKeyRequest extends TeaModel {
    /**
     * <p>The account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acc_123456789</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The description of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>APIKEY描述</p>
     */
    @NameInMap("Description")
    public String description;

    public static CreateTokenPlanKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenPlanKeyRequest self = new CreateTokenPlanKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateTokenPlanKeyRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateTokenPlanKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
