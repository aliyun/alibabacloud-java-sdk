// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ModifyCustomerInfoRequest extends TeaModel {
    @NameInMap("Biz")
    public String biz;

    @NameInMap("CustomerCategory")
    public String customerCategory;

    @NameInMap("CustomerSubCategory")
    public String customerSubCategory;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("Website")
    public String website;

    public static ModifyCustomerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomerInfoRequest self = new ModifyCustomerInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomerInfoRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public ModifyCustomerInfoRequest setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory;
        return this;
    }
    public String getCustomerCategory() {
        return this.customerCategory;
    }

    public ModifyCustomerInfoRequest setCustomerSubCategory(String customerSubCategory) {
        this.customerSubCategory = customerSubCategory;
        return this;
    }
    public String getCustomerSubCategory() {
        return this.customerSubCategory;
    }

    public ModifyCustomerInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ModifyCustomerInfoRequest setWebsite(String website) {
        this.website = website;
        return this;
    }
    public String getWebsite() {
        return this.website;
    }

}
