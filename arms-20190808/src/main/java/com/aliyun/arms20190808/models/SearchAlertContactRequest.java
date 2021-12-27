// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactRequest extends TeaModel {
    @NameInMap("ContactIds")
    public String contactIds;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("Email")
    public String email;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("RegionId")
    public String regionId;

    public static SearchAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactRequest self = new SearchAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public SearchAlertContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SearchAlertContactRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public SearchAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SearchAlertContactRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SearchAlertContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SearchAlertContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
