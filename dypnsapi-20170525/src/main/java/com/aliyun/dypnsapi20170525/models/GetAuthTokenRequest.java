// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthTokenRequest extends TeaModel {
    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("CmApiCode")
    public Integer cmApiCode;

    @NameInMap("CtApiCode")
    public Integer ctApiCode;

    @NameInMap("CuApiCode")
    public Integer cuApiCode;

    /**
     * <p>The requested domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyundoc.com">https://www.aliyundoc.com</a></p>
     */
    @NameInMap("Origin")
    public String origin;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The URL of the requested web page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyundoc.com/">https://www.aliyundoc.com/</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("Version")
    public String version;

    public static GetAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenRequest self = new GetAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public GetAuthTokenRequest setCmApiCode(Integer cmApiCode) {
        this.cmApiCode = cmApiCode;
        return this;
    }
    public Integer getCmApiCode() {
        return this.cmApiCode;
    }

    public GetAuthTokenRequest setCtApiCode(Integer ctApiCode) {
        this.ctApiCode = ctApiCode;
        return this;
    }
    public Integer getCtApiCode() {
        return this.ctApiCode;
    }

    public GetAuthTokenRequest setCuApiCode(Integer cuApiCode) {
        this.cuApiCode = cuApiCode;
        return this;
    }
    public Integer getCuApiCode() {
        return this.cuApiCode;
    }

    public GetAuthTokenRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetAuthTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetAuthTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetAuthTokenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAuthTokenRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public GetAuthTokenRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetAuthTokenRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
