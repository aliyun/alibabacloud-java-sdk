// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCustomerRequest extends TeaModel {
    @NameInMap("CustomerName")
    public String customerName;

    @NameInMap("CustomerSource")
    public String customerSource;

    @NameInMap("CustomerSubTrade")
    public String customerSubTrade;

    @NameInMap("CustomerTrade")
    public String customerTrade;

    @NameInMap("Nation")
    public String nation;

    public static CreateCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerRequest self = new CreateCustomerRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomerRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public CreateCustomerRequest setCustomerSource(String customerSource) {
        this.customerSource = customerSource;
        return this;
    }
    public String getCustomerSource() {
        return this.customerSource;
    }

    public CreateCustomerRequest setCustomerSubTrade(String customerSubTrade) {
        this.customerSubTrade = customerSubTrade;
        return this;
    }
    public String getCustomerSubTrade() {
        return this.customerSubTrade;
    }

    public CreateCustomerRequest setCustomerTrade(String customerTrade) {
        this.customerTrade = customerTrade;
        return this;
    }
    public String getCustomerTrade() {
        return this.customerTrade;
    }

    public CreateCustomerRequest setNation(String nation) {
        this.nation = nation;
        return this;
    }
    public String getNation() {
        return this.nation;
    }

}
