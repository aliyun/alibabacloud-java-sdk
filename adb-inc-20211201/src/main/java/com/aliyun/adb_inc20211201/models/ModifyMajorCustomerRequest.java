// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyMajorCustomerRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomerId")
    public Long customerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomerName")
    public String customerName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("Pd")
    public String pd;

    @NameInMap("Pdsa")
    public String pdsa;

    @NameInMap("Ranking")
    public Integer ranking;

    @NameInMap("Rd")
    public String rd;

    @NameInMap("Sa")
    public String sa;

    public static ModifyMajorCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMajorCustomerRequest self = new ModifyMajorCustomerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMajorCustomerRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public ModifyMajorCustomerRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public ModifyMajorCustomerRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public ModifyMajorCustomerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMajorCustomerRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ModifyMajorCustomerRequest setPd(String pd) {
        this.pd = pd;
        return this;
    }
    public String getPd() {
        return this.pd;
    }

    public ModifyMajorCustomerRequest setPdsa(String pdsa) {
        this.pdsa = pdsa;
        return this;
    }
    public String getPdsa() {
        return this.pdsa;
    }

    public ModifyMajorCustomerRequest setRanking(Integer ranking) {
        this.ranking = ranking;
        return this;
    }
    public Integer getRanking() {
        return this.ranking;
    }

    public ModifyMajorCustomerRequest setRd(String rd) {
        this.rd = rd;
        return this;
    }
    public String getRd() {
        return this.rd;
    }

    public ModifyMajorCustomerRequest setSa(String sa) {
        this.sa = sa;
        return this;
    }
    public String getSa() {
        return this.sa;
    }

}
