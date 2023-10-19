// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteFlowRulesShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application name.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The IDs of the rules to be deleted.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static DeleteFlowRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRulesShrinkRequest self = new DeleteFlowRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRulesShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteFlowRulesShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteFlowRulesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public DeleteFlowRulesShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
