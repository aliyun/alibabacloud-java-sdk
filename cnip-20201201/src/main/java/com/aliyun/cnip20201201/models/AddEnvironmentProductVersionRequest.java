// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionRequest extends TeaModel {
    @NameInMap("productName")
    public String productName;

    @NameInMap("productUID")
    public String productUID;

    @NameInMap("productVersion")
    public String productVersion;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static AddEnvironmentProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionRequest self = new AddEnvironmentProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public AddEnvironmentProductVersionRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public AddEnvironmentProductVersionRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public AddEnvironmentProductVersionRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
