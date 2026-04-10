// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class ExchangeEntitlementRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>your_user_id_001</p>
     */
    @NameInMap("externalUserId")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>a1b2c3d4e5f6...</p>
     */
    @NameInMap("keyHash")
    public String keyHash;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>req_20240101_001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("templateId")
    public Long templateId;

    /**
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("userName")
    public String userName;

    public static ExchangeEntitlementRequest build(java.util.Map<String, ?> map) throws Exception {
        ExchangeEntitlementRequest self = new ExchangeEntitlementRequest();
        return TeaModel.build(map, self);
    }

    public ExchangeEntitlementRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ExchangeEntitlementRequest setKeyHash(String keyHash) {
        this.keyHash = keyHash;
        return this;
    }
    public String getKeyHash() {
        return this.keyHash;
    }

    public ExchangeEntitlementRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExchangeEntitlementRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ExchangeEntitlementRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
