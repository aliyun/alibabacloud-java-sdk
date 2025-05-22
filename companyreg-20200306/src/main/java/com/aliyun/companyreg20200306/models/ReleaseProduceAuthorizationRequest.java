// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ReleaseProduceAuthorizationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1219541161213000</p>
     */
    @NameInMap("AuthorizedUserId")
    public String authorizedUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P20211117141528000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.beian_assist</p>
     */
    @NameInMap("BizType")
    public String bizType;

    public static ReleaseProduceAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProduceAuthorizationRequest self = new ReleaseProduceAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseProduceAuthorizationRequest setAuthorizedUserId(String authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
        return this;
    }
    public String getAuthorizedUserId() {
        return this.authorizedUserId;
    }

    public ReleaseProduceAuthorizationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReleaseProduceAuthorizationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
