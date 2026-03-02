// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateOIDCProviderRequest extends TeaModel {
    @NameInMap("ClientIds")
    public String clientIds;

    @NameInMap("IssuanceLimitTime")
    public Long issuanceLimitTime;

    @NameInMap("NewDescription")
    public String newDescription;

    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static UpdateOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOIDCProviderRequest self = new UpdateOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOIDCProviderRequest setClientIds(String clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public String getClientIds() {
        return this.clientIds;
    }

    public UpdateOIDCProviderRequest setIssuanceLimitTime(Long issuanceLimitTime) {
        this.issuanceLimitTime = issuanceLimitTime;
        return this;
    }
    public Long getIssuanceLimitTime() {
        return this.issuanceLimitTime;
    }

    public UpdateOIDCProviderRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
