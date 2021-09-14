// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class PublishScreenRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("NeedToken")
    public Boolean needToken;

    @NameInMap("Password")
    public String password;

    @NameInMap("AuthTime")
    public Integer authTime;

    public static PublishScreenRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishScreenRequest self = new PublishScreenRequest();
        return TeaModel.build(map, self);
    }

    public PublishScreenRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public PublishScreenRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public PublishScreenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PublishScreenRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public PublishScreenRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public PublishScreenRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public PublishScreenRequest setNeedToken(Boolean needToken) {
        this.needToken = needToken;
        return this;
    }
    public Boolean getNeedToken() {
        return this.needToken;
    }

    public PublishScreenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public PublishScreenRequest setAuthTime(Integer authTime) {
        this.authTime = authTime;
        return this;
    }
    public Integer getAuthTime() {
        return this.authTime;
    }

}
