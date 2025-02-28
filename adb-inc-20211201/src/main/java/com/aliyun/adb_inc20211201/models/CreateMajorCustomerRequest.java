// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class CreateMajorCustomerRequest extends TeaModel {
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

    public static CreateMajorCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorCustomerRequest self = new CreateMajorCustomerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMajorCustomerRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public CreateMajorCustomerRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public CreateMajorCustomerRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public CreateMajorCustomerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMajorCustomerRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateMajorCustomerRequest setPd(String pd) {
        this.pd = pd;
        return this;
    }
    public String getPd() {
        return this.pd;
    }

    public CreateMajorCustomerRequest setPdsa(String pdsa) {
        this.pdsa = pdsa;
        return this;
    }
    public String getPdsa() {
        return this.pdsa;
    }

    public CreateMajorCustomerRequest setRanking(Integer ranking) {
        this.ranking = ranking;
        return this;
    }
    public Integer getRanking() {
        return this.ranking;
    }

    public CreateMajorCustomerRequest setRd(String rd) {
        this.rd = rd;
        return this;
    }
    public String getRd() {
        return this.rd;
    }

    public CreateMajorCustomerRequest setSa(String sa) {
        this.sa = sa;
        return this;
    }
    public String getSa() {
        return this.sa;
    }

}
