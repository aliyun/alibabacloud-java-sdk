// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CloneConfigurationRequest extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("NamespaceFrom")
    public String namespaceFrom;

    @NameInMap("NamespaceTo")
    public String namespaceTo;

    @NameInMap("Data")
    public String data;

    public static CloneConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneConfigurationRequest self = new CloneConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CloneConfigurationRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CloneConfigurationRequest setNamespaceFrom(String namespaceFrom) {
        this.namespaceFrom = namespaceFrom;
        return this;
    }
    public String getNamespaceFrom() {
        return this.namespaceFrom;
    }

    public CloneConfigurationRequest setNamespaceTo(String namespaceTo) {
        this.namespaceTo = namespaceTo;
        return this;
    }
    public String getNamespaceTo() {
        return this.namespaceTo;
    }

    public CloneConfigurationRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
