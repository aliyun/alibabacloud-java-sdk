// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class BindProduceAuthorizationRequest extends TeaModel {
    @NameInMap("AuthorizedUserIds")
    public String authorizedUserIds;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    public static BindProduceAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        BindProduceAuthorizationRequest self = new BindProduceAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public BindProduceAuthorizationRequest setAuthorizedUserIds(String authorizedUserIds) {
        this.authorizedUserIds = authorizedUserIds;
        return this;
    }
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    public BindProduceAuthorizationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BindProduceAuthorizationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
