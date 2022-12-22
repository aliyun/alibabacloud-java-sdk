// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookRequest extends TeaModel {
    // The port that is included in the address book. This parameter takes effect only when the **GroupType** parameter is set to **port**.
    @NameInMap("ContainPort")
    public String containPort;

    // The number of the page to return.
    // 
    // Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The type of the address book. Valid values:
    // 
    // * **ip**: IP address book
    // * **domain**: domain address book
    // * **port**: port address book
    // * **tag**: Elastic Compute Service (ECS) tag-based address book
    // * **allCloud**: cloud service address book
    // * **threat**: threat intelligence address book
    // 
    // > If you do not specify a type, the domain address books and ECS tag-based address books are queried.
    @NameInMap("GroupType")
    public String groupType;

    // The language of the content within the request. Valid values:
    // 
    // * **zh**: Chinese (default)
    // * **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page.
    // 
    // Default value: 10. Maximum value: 50.
    @NameInMap("PageSize")
    public String pageSize;

    // The query condition that is used to search for the address book.
    @NameInMap("Query")
    public String query;

    public static DescribeAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressBookRequest self = new DescribeAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddressBookRequest setContainPort(String containPort) {
        this.containPort = containPort;
        return this;
    }
    public String getContainPort() {
        return this.containPort;
    }

    public DescribeAddressBookRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAddressBookRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAddressBookRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAddressBookRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
