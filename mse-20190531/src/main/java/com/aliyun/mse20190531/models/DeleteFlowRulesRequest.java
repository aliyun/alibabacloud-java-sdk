// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteFlowRulesRequest extends TeaModel {
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
    public java.util.List<Long> ids;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static DeleteFlowRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRulesRequest self = new DeleteFlowRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRulesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteFlowRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteFlowRulesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public DeleteFlowRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
