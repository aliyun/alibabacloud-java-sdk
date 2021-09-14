// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenConfigRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ScreenId")
    public Integer screenId;

    public static GetScreenConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScreenConfigRequest self = new GetScreenConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetScreenConfigRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetScreenConfigRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetScreenConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetScreenConfigRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

}
