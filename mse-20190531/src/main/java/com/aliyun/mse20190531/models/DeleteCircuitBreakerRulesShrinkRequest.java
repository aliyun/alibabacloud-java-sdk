// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteCircuitBreakerRulesShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh and en. Default value: zh. The value zh indicates Chinese, and the value en indicates English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The IDs of the rules that you want to delete.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     */
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
