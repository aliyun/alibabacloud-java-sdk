// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNamespaceRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. Default value: zh. The value zh indicates Chinese, and the value en indicates English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    public static DeleteNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNamespaceRequest self = new DeleteNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNamespaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteNamespaceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
