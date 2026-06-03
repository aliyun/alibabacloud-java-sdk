// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CopyVerifySchemeRequest extends TeaModel {
    /**
     * <p>native：1，web：5</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CmApiCode")
    public Long cmApiCode;

    /**
     * <p>true，将在移动侧创建新的AppId，false将直接从模版方案中复制已经创建的移动AppId信息</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CmNewFlag")
    public Boolean cmNewFlag;

    /**
     * <p>native：3，web：8</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CtApiCode")
    public Long ctApiCode;

    /**
     * <p>true，将在电信侧创建新的AppId，false将直接从模版方案中复制已经创建的电信AppId信息</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CtNewFlag")
    public Boolean ctNewFlag;

    /**
     * <p>native：9，web：10</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("CuApiCode")
    public Long cuApiCode;

    /**
     * <p>true，将在联通侧创建新的AppId，false将直接从模版方案中复制已经创建的联通AppId信息</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CuNewFlag")
    public Boolean cuNewFlag;

    /**
     * <strong>example:</strong>
     * <p>****@xxx.com</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC1001212***32</p>
     */
    @NameInMap("ModelSceneCode")
    public String modelSceneCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CopyVerifySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyVerifySchemeRequest self = new CopyVerifySchemeRequest();
        return TeaModel.build(map, self);
    }

    public CopyVerifySchemeRequest setCmApiCode(Long cmApiCode) {
        this.cmApiCode = cmApiCode;
        return this;
    }
    public Long getCmApiCode() {
        return this.cmApiCode;
    }

    public CopyVerifySchemeRequest setCmNewFlag(Boolean cmNewFlag) {
        this.cmNewFlag = cmNewFlag;
        return this;
    }
    public Boolean getCmNewFlag() {
        return this.cmNewFlag;
    }

    public CopyVerifySchemeRequest setCtApiCode(Long ctApiCode) {
        this.ctApiCode = ctApiCode;
        return this;
    }
    public Long getCtApiCode() {
        return this.ctApiCode;
    }

    public CopyVerifySchemeRequest setCtNewFlag(Boolean ctNewFlag) {
        this.ctNewFlag = ctNewFlag;
        return this;
    }
    public Boolean getCtNewFlag() {
        return this.ctNewFlag;
    }

    public CopyVerifySchemeRequest setCuApiCode(Long cuApiCode) {
        this.cuApiCode = cuApiCode;
        return this;
    }
    public Long getCuApiCode() {
        return this.cuApiCode;
    }

    public CopyVerifySchemeRequest setCuNewFlag(Boolean cuNewFlag) {
        this.cuNewFlag = cuNewFlag;
        return this;
    }
    public Boolean getCuNewFlag() {
        return this.cuNewFlag;
    }

    public CopyVerifySchemeRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CopyVerifySchemeRequest setModelSceneCode(String modelSceneCode) {
        this.modelSceneCode = modelSceneCode;
        return this;
    }
    public String getModelSceneCode() {
        return this.modelSceneCode;
    }

    public CopyVerifySchemeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyVerifySchemeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopyVerifySchemeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
