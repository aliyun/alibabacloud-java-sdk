// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookRequest extends TeaModel {
    /**
     * <p>The port that is included in the address book. This parameter takes effect only when the <strong>GroupType</strong> parameter is set to <strong>port</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ContainPort")
    public String containPort;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The type of the address book. Valid values:</p>
     * <ul>
     * <li><strong>ip</strong>: IP address book</li>
     * <li><strong>domain</strong>: domain address book</li>
     * <li><strong>port</strong>: port address book</li>
     * <li><strong>tag</strong>: Elastic Compute Service (ECS) tag-based address book</li>
     * <li><strong>allCloud</strong>: cloud service address book</li>
     * <li><strong>threat</strong>: threat intelligence address book</li>
     * <li><strong>ipv6</strong>: IPv6 address book<blockquote>
     * <p> If you do not specify a type, the domain address books and ECS tag-based address books are queried.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The language of the content within the request. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * <p>Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The query condition that is used to search for the address book.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
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
