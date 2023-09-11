// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactsRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact that you want to query. Separate multiple contact IDs with spaces.</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>The name of the alert contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The email address of the alert contact.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The mobile number of the alert contact.</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of alert contacts to return on each page.</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>Specifies whether to return redundant information.</p>
     */
    @NameInMap("Verbose")
    public String verbose;

    public static DescribeContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactsRequest self = new DescribeContactsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContactsRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public DescribeContactsRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public DescribeContactsRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public DescribeContactsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeContactsRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public DescribeContactsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContactsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DescribeContactsRequest setVerbose(String verbose) {
        this.verbose = verbose;
        return this;
    }
    public String getVerbose() {
        return this.verbose;
    }

}
