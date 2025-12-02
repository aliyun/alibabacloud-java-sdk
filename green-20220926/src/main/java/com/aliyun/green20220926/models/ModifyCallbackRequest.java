// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyCallbackRequest extends TeaModel {
    /**
     * <p>Encryption algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>SHA256</p>
     */
    @NameInMap("CryptType")
    public String cryptType;

    /**
     * <p>Primary key ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>112</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Name.</p>
     * 
     * <strong>example:</strong>
     * <p>回调通知</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Result scope.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>Callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyuncs.com">https://www.aliyuncs.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static ModifyCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCallbackRequest self = new ModifyCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCallbackRequest setCryptType(String cryptType) {
        this.cryptType = cryptType;
        return this;
    }
    public String getCryptType() {
        return this.cryptType;
    }

    public ModifyCallbackRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyCallbackRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCallbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCallbackRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ModifyCallbackRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
