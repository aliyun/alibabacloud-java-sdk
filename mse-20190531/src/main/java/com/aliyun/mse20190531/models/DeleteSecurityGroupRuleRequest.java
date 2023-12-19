// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("CascadingDelete")
    public Boolean cascadingDelete;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The destination ID.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteSecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupRuleRequest self = new DeleteSecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteSecurityGroupRuleRequest setCascadingDelete(Boolean cascadingDelete) {
        this.cascadingDelete = cascadingDelete;
        return this;
    }
    public Boolean getCascadingDelete() {
        return this.cascadingDelete;
    }

    public DeleteSecurityGroupRuleRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public DeleteSecurityGroupRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
