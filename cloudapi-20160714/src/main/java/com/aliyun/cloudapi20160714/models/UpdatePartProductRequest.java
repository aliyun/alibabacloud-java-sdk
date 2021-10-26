// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePartProductRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("Segment")
    public Integer segment;

    @NameInMap("SubscribeMode")
    public Integer subscribeMode;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("CateSecondId")
    public java.util.List<Long> cateSecondId;

    @NameInMap("UserGroup")
    public java.util.List<Long> userGroup;

    public static UpdatePartProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartProductRequest self = new UpdatePartProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePartProductRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdatePartProductRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public UpdatePartProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePartProductRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdatePartProductRequest setSegment(Integer segment) {
        this.segment = segment;
        return this;
    }
    public Integer getSegment() {
        return this.segment;
    }

    public UpdatePartProductRequest setSubscribeMode(Integer subscribeMode) {
        this.subscribeMode = subscribeMode;
        return this;
    }
    public Integer getSubscribeMode() {
        return this.subscribeMode;
    }

    public UpdatePartProductRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdatePartProductRequest setCateSecondId(java.util.List<Long> cateSecondId) {
        this.cateSecondId = cateSecondId;
        return this;
    }
    public java.util.List<Long> getCateSecondId() {
        return this.cateSecondId;
    }

    public UpdatePartProductRequest setUserGroup(java.util.List<Long> userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public java.util.List<Long> getUserGroup() {
        return this.userGroup;
    }

}
