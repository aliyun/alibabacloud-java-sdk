// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappSyncPhoneNumberRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    public static ChatappSyncPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappSyncPhoneNumberRequest self = new ChatappSyncPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public ChatappSyncPhoneNumberRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

}
