// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappMigrationRegisterRequest extends TeaModel {
    /**
     * <p>None</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29348393884****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static ChatappMigrationRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappMigrationRegisterRequest self = new ChatappMigrationRegisterRequest();
        return TeaModel.build(map, self);
    }

    public ChatappMigrationRegisterRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ChatappMigrationRegisterRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
