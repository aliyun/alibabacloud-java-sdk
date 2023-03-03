// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact.</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>The name of the alert contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The email address of the alert contact.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The mobile number of the alert contact.</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The ID of the region. Set the value to `cn-hangzhou`.</p>
     */
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
