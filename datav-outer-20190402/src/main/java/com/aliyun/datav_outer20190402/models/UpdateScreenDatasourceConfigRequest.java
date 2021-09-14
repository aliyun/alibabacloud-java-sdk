// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class UpdateScreenDatasourceConfigRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("ComId")
    public String comId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("DataConfig")
    public String dataConfig;

    public static UpdateScreenDatasourceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScreenDatasourceConfigRequest self = new UpdateScreenDatasourceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScreenDatasourceConfigRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public UpdateScreenDatasourceConfigRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateScreenDatasourceConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateScreenDatasourceConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateScreenDatasourceConfigRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public UpdateScreenDatasourceConfigRequest setComId(String comId) {
        this.comId = comId;
        return this;
    }
    public String getComId() {
        return this.comId;
    }

    public UpdateScreenDatasourceConfigRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UpdateScreenDatasourceConfigRequest setDataConfig(String dataConfig) {
        this.dataConfig = dataConfig;
        return this;
    }
    public String getDataConfig() {
        return this.dataConfig;
    }

}
