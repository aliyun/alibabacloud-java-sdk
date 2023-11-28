// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdminPasswordRequest extends TeaModel {
    @NameInMap("esAdminPassword")
    public String esAdminPassword;

    /**
     * <p>Indicates whether the password was updated. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateAdminPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdminPasswordRequest self = new UpdateAdminPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAdminPasswordRequest setEsAdminPassword(String esAdminPassword) {
        this.esAdminPassword = esAdminPassword;
        return this;
    }
    public String getEsAdminPassword() {
        return this.esAdminPassword;
    }

    public UpdateAdminPasswordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
