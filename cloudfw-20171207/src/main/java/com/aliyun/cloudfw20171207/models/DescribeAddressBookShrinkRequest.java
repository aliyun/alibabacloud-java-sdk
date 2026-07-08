// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookShrinkRequest extends TeaModel {
    /**
     * <p>The list of member accounts for the asset address book.</p>
     */
    @NameInMap("AssetMemberUids")
    public String assetMemberUidsShrink;

    /**
     * <p>Queries address books that contain the specified port. This parameter takes effect only when the <strong>GroupType</strong> parameter is set to <strong>port</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ContainPort")
    public String containPort;

    /**
     * <p>The page number in a paged query.</p>
     * <p>Default value: 1, which indicates that the first page of data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The type of the address book.</p>
     * <blockquote>
     * <p>If you do not set this parameter, IP address books and ECS tag-based address books are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The unique ID of the address book.</p>
     * 
     * <strong>example:</strong>
     * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The language type for the address book description. Valid values:</p>
     * <ul>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>zh</strong>: Chinese (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of address books on each page in a paged query.</p>
     * <p>Default value: 10, which indicates that each page contains 10 results. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The search condition. Enter the address book information that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("Query")
    public String query;

    public static DescribeAddressBookShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressBookShrinkRequest self = new DescribeAddressBookShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddressBookShrinkRequest setAssetMemberUidsShrink(String assetMemberUidsShrink) {
        this.assetMemberUidsShrink = assetMemberUidsShrink;
        return this;
    }
    public String getAssetMemberUidsShrink() {
        return this.assetMemberUidsShrink;
    }

    public DescribeAddressBookShrinkRequest setContainPort(String containPort) {
        this.containPort = containPort;
        return this;
    }
    public String getContainPort() {
        return this.containPort;
    }

    public DescribeAddressBookShrinkRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAddressBookShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeAddressBookShrinkRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public DescribeAddressBookShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAddressBookShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAddressBookShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
