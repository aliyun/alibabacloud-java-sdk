// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenDatasourceConfigRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("ComId")
    public String comId;

    public static GetScreenDatasourceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScreenDatasourceConfigRequest self = new GetScreenDatasourceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetScreenDatasourceConfigRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetScreenDatasourceConfigRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetScreenDatasourceConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetScreenDatasourceConfigRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public GetScreenDatasourceConfigRequest setComId(String comId) {
        this.comId = comId;
        return this;
    }
    public String getComId() {
        return this.comId;
    }

}
