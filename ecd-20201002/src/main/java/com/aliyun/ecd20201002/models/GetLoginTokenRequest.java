// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetLoginTokenRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientId")
    @Validation(required = true)
    public String clientId;

    @NameInMap("DirectoryId")
    @Validation(required = true)
    public String directoryId;

    @NameInMap("EndUserId")
    @Validation(required = true)
    public String endUserId;

    @NameInMap("Password")
    @Validation(required = true)
    public String password;

    public static GetLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenRequest self = new GetLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLoginTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetLoginTokenRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetLoginTokenRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetLoginTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
