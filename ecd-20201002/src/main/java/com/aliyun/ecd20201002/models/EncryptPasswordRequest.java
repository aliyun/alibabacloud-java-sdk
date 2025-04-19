// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class EncryptPasswordRequest extends TeaModel {
    /**
     * <p>The ID of the client. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1d40776f-e9cb-4e2b-a8da-308d10e8****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing+dir-131196****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The logon token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1b16dcff3ab21a6c5ec01652238375511cff5a1db59fd4dc49afb37e2ea7a626af6f38109fd0498b6abd9de1af7743****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing+dir-131196****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The password that you want to encrypt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ab123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c78e2e52-23d9-4401-a648-e67ac6ff****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static EncryptPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptPasswordRequest self = new EncryptPasswordRequest();
        return TeaModel.build(map, self);
    }

    public EncryptPasswordRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public EncryptPasswordRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public EncryptPasswordRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public EncryptPasswordRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public EncryptPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public EncryptPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EncryptPasswordRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
