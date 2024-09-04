// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCustomerRequest extends TeaModel {
    /**
     * <p>Customer\&quot;s name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DoorBell Marketing</p>
     */
    @NameInMap("CustomerName")
    public String customerName;

    /**
     * <p>The source/channel that allow client to connected with us. Please enumerate with Customer Source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>website</p>
     */
    @NameInMap("CustomerSource")
    public String customerSource;

    /**
     * <p>The sub-industry that Customer\&quot;s business belongs to. Please enumerate with Customer Trade.</p>
     * 
     * <strong>example:</strong>
     * <p>0101</p>
     */
    @NameInMap("CustomerSubTrade")
    public String customerSubTrade;

    /**
     * <p>The industry that Customer\&quot;s business belongs to. Please enumerate with Customer Trade.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("CustomerTrade")
    public String customerTrade;

    /**
     * <p>The region that Customer choose to launch the Cloud Service. Please use ListCountries to confirm the valid region list for current UID.</p>
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
