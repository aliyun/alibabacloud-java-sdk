// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateOrInsertEnterpriseInfoShrinkRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Alias")
    public String alias;

    @NameInMap("CityJsonString")
    public String cityJsonStringShrink;

    @NameInMap("EnterpriseSize")
    public String enterpriseSize;

    @NameInMap("Fax")
    public String fax;

    @NameInMap("Name")
    public String name;

    @NameInMap("PK")
    public String PK;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("ProvinceJsonString")
    public String provinceJsonStringShrink;

    @NameInMap("Years")
    public String years;

    public static UpdateOrInsertEnterpriseInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrInsertEnterpriseInfoShrinkRequest self = new UpdateOrInsertEnterpriseInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setCityJsonStringShrink(String cityJsonStringShrink) {
        this.cityJsonStringShrink = cityJsonStringShrink;
        return this;
    }
    public String getCityJsonStringShrink() {
        return this.cityJsonStringShrink;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setEnterpriseSize(String enterpriseSize) {
        this.enterpriseSize = enterpriseSize;
        return this;
    }
    public String getEnterpriseSize() {
        return this.enterpriseSize;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setFax(String fax) {
        this.fax = fax;
        return this;
    }
    public String getFax() {
        return this.fax;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setProvinceJsonStringShrink(String provinceJsonStringShrink) {
        this.provinceJsonStringShrink = provinceJsonStringShrink;
        return this;
    }
    public String getProvinceJsonStringShrink() {
        return this.provinceJsonStringShrink;
    }

    public UpdateOrInsertEnterpriseInfoShrinkRequest setYears(String years) {
        this.years = years;
        return this;
    }
    public String getYears() {
        return this.years;
    }

}
