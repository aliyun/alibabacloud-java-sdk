// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateCallbackRequest extends TeaModel {
    /**
     * <p>Encryption algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>SHA256</p>
     */
    @NameInMap("CryptType")
    public String cryptType;

    /**
     * <p>Plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>消息通知1</p>
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
     * <p>Review result.</p>
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
     * <p><a href="https://console.aliyun.com">https://console.aliyun.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCallbackRequest self = new CreateCallbackRequest();
        return TeaModel.build(map, self);
    }

    public CreateCallbackRequest setCryptType(String cryptType) {
        this.cryptType = cryptType;
        return this;
    }
    public String getCryptType() {
        return this.cryptType;
    }

    public CreateCallbackRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCallbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCallbackRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateCallbackRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
