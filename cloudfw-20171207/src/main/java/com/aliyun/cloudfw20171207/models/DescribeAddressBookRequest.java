// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookRequest extends TeaModel {
    /**
     * <p>Filters the query to return only address books that contain the specified port. This parameter is valid only when <strong>GroupType</strong> is set to <strong>port</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ContainPort")
    public String containPort;

    /**
     * <p>The page number for a paginated query.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The type of the address book.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the query returns both IPv4 and ECS tag address books.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The unique identifier of the address book.</p>
     * 
     * <strong>example:</strong>
     * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The language of the content in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of address books per page.</p>
     * <p>Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The search keyword for address books.</p>
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

    public DescribeAddressBookRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
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
