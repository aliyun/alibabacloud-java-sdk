// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class CreateStoreRequest extends TeaModel {
    @NameInMap("Brand")
    public String brand;

    @NameInMap("Comments")
    public String comments;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CompanyId")
    public String companyId;

    @NameInMap("Groups")
    public String groups;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreName")
    public String storeName;

    public static CreateStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoreRequest self = new CreateStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoreRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public CreateStoreRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateStoreRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public CreateStoreRequest setGroups(String groups) {
        this.groups = groups;
        return this;
    }
    public String getGroups() {
        return this.groups;
    }

    public CreateStoreRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public CreateStoreRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateStoreRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
