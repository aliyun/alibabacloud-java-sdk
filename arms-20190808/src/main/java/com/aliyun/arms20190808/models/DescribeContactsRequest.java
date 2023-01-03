// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactsRequest extends TeaModel {
    @NameInMap("ContactIds")
    public String contactIds;

    // The name of the alert contact.
    @NameInMap("ContactName")
    public String contactName;

    // The email address of the alert contact.
    @NameInMap("Email")
    public String email;

    // The number of the page to return.
    @NameInMap("Page")
    public Long page;

    // The mobile number of the alert contact.
    @NameInMap("Phone")
    public String phone;

    // The number of alert contacts to return on each page.
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
