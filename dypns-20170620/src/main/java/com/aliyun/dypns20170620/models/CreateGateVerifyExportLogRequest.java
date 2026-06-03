// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateGateVerifyExportLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthenticationType")
    public Integer authenticationType;

    /**
     * <strong>example:</strong>
     * <p>Android</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202211</p>
     */
    @NameInMap("QueryMonth")
    public String queryMonth;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>FC100*******4175</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static CreateGateVerifyExportLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGateVerifyExportLogRequest self = new CreateGateVerifyExportLogRequest();
        return TeaModel.build(map, self);
    }

    public CreateGateVerifyExportLogRequest setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    public CreateGateVerifyExportLogRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateGateVerifyExportLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGateVerifyExportLogRequest setQueryMonth(String queryMonth) {
        this.queryMonth = queryMonth;
        return this;
    }
    public String getQueryMonth() {
        return this.queryMonth;
    }

    public CreateGateVerifyExportLogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateGateVerifyExportLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateGateVerifyExportLogRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
