// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCustomerRequest extends TeaModel {
    /**
     * <p>The customer name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DoorBell Marketing</p>
     */
    @NameInMap("CustomerName")
    public String customerName;

    /**
     * <p>The customer source.
     * Use the Customer Source enumeration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>website</p>
     */
    @NameInMap("CustomerSource")
    public String customerSource;

    /**
     * <p>The customer sub-industry.
     * Use the Customer Sub Trade enumeration.</p>
     * 
     * <strong>example:</strong>
     * <p>020501</p>
     */
    @NameInMap("CustomerSubTrade")
    public String customerSubTrade;

    /**
     * <p>The customer industry name.
     * Use the Customer Trade enumeration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0205</p>
     */
    @NameInMap("CustomerTrade")
    public String customerTrade;

    /**
     * <p>The region to which the customer belongs. Call ListCountries to obtain the list of available regions for the current UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AR</p>
     */
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
