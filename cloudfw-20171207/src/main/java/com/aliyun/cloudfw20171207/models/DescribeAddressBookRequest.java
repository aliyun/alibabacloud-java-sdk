// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Query")
    public String query;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("ContainPort")
    public String containPort;

    public static DescribeAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressBookRequest self = new DescribeAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAddressBookRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
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

    public DescribeAddressBookRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeAddressBookRequest setContainPort(String containPort) {
        this.containPort = containPort;
        return this;
    }
    public String getContainPort() {
        return this.containPort;
    }

}
