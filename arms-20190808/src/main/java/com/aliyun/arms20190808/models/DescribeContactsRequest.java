// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactsRequest extends TeaModel {
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>Indicates whether the email address was verified.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Email")
    public String email;

    @NameInMap("Page")
    public Long page;

    /**
     * <p>The ID of the alert contact.</p>
     */
    @NameInMap("Phone")
    public String phone;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Size")
    public Long size;

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
