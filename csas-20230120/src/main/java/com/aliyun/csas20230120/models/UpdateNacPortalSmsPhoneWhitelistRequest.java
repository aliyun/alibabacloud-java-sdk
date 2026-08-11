// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateNacPortalSmsPhoneWhitelistRequest extends TeaModel {
    /**
     * <p>The list of phone numbers.</p>
     */
    @NameInMap("Phones")
    public java.util.List<String> phones;

    public static UpdateNacPortalSmsPhoneWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacPortalSmsPhoneWhitelistRequest self = new UpdateNacPortalSmsPhoneWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacPortalSmsPhoneWhitelistRequest setPhones(java.util.List<String> phones) {
        this.phones = phones;
        return this;
    }
    public java.util.List<String> getPhones() {
        return this.phones;
    }

}
