// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenAccessRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("Params")
    public String params;

    @NameInMap("MemberUId")
    public String memberUId;

    public static GetScreenAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScreenAccessRequest self = new GetScreenAccessRequest();
        return TeaModel.build(map, self);
    }

    public GetScreenAccessRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetScreenAccessRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetScreenAccessRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetScreenAccessRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GetScreenAccessRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public GetScreenAccessRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public GetScreenAccessRequest setMemberUId(String memberUId) {
        this.memberUId = memberUId;
        return this;
    }
    public String getMemberUId() {
        return this.memberUId;
    }

}
