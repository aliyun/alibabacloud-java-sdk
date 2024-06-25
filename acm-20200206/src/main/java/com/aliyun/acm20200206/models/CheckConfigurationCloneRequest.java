// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CheckConfigurationCloneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NamespaceFrom")
    public String namespaceFrom;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NamespaceTo")
    public String namespaceTo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Policy")
    public String policy;

    public static CheckConfigurationCloneRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigurationCloneRequest self = new CheckConfigurationCloneRequest();
        return TeaModel.build(map, self);
    }

    public CheckConfigurationCloneRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckConfigurationCloneRequest setNamespaceFrom(String namespaceFrom) {
        this.namespaceFrom = namespaceFrom;
        return this;
    }
    public String getNamespaceFrom() {
        return this.namespaceFrom;
    }

    public CheckConfigurationCloneRequest setNamespaceTo(String namespaceTo) {
        this.namespaceTo = namespaceTo;
        return this;
    }
    public String getNamespaceTo() {
        return this.namespaceTo;
    }

    public CheckConfigurationCloneRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

}
