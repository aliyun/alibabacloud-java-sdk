// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteCircuitBreakerRulesShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ids")
    public String idsShrink;

    @NameInMap("Namespace")
    public String namespace;

    public static DeleteCircuitBreakerRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCircuitBreakerRulesShrinkRequest self = new DeleteCircuitBreakerRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCircuitBreakerRulesShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteCircuitBreakerRulesShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteCircuitBreakerRulesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public DeleteCircuitBreakerRulesShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
