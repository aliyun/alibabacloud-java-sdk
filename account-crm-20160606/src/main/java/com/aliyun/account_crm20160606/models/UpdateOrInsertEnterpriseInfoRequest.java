// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateOrInsertEnterpriseInfoRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Alias")
    public String alias;

    @NameInMap("CityJsonString")
    public java.util.Map<String, ?> cityJsonString;

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
    public java.util.Map<String, ?> provinceJsonString;

    @NameInMap("Years")
    public String years;

    public static UpdateOrInsertEnterpriseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrInsertEnterpriseInfoRequest self = new UpdateOrInsertEnterpriseInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrInsertEnterpriseInfoRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateOrInsertEnterpriseInfoRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public UpdateOrInsertEnterpriseInfoRequest setCityJsonString(java.util.Map<String, ?> cityJsonString) {
        this.cityJsonString = cityJsonString;
        return this;
    }
    public java.util.Map<String, ?> getCityJsonString() {
        return this.cityJsonString;
    }

    public UpdateOrInsertEnterpriseInfoRequest setEnterpriseSize(String enterpriseSize) {
        this.enterpriseSize = enterpriseSize;
        return this;
    }
    public String getEnterpriseSize() {
        return this.enterpriseSize;
    }

    public UpdateOrInsertEnterpriseInfoRequest setFax(String fax) {
        this.fax = fax;
        return this;
    }
    public String getFax() {
        return this.fax;
    }

    public UpdateOrInsertEnterpriseInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateOrInsertEnterpriseInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateOrInsertEnterpriseInfoRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateOrInsertEnterpriseInfoRequest setProvinceJsonString(java.util.Map<String, ?> provinceJsonString) {
        this.provinceJsonString = provinceJsonString;
        return this;
    }
    public java.util.Map<String, ?> getProvinceJsonString() {
        return this.provinceJsonString;
    }

    public UpdateOrInsertEnterpriseInfoRequest setYears(String years) {
        this.years = years;
        return this;
    }
    public String getYears() {
        return this.years;
    }

}
