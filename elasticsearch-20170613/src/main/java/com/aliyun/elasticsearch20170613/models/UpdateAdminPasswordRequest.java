// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdminPasswordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>es_password</p>
     */
    @NameInMap("esAdminPassword")
    public String esAdminPassword;

    /**
     * <p>Indicates whether the password was updated. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
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
