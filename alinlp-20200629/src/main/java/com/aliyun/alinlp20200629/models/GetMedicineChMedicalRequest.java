// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetMedicineChMedicalRequest extends TeaModel {
    @NameInMap("Factory")
    public String factory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("Unit")
    public String unit;

    public static GetMedicineChMedicalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMedicineChMedicalRequest self = new GetMedicineChMedicalRequest();
        return TeaModel.build(map, self);
    }

    public GetMedicineChMedicalRequest setFactory(String factory) {
        this.factory = factory;
        return this;
    }
    public String getFactory() {
        return this.factory;
    }

    public GetMedicineChMedicalRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMedicineChMedicalRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetMedicineChMedicalRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public GetMedicineChMedicalRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
