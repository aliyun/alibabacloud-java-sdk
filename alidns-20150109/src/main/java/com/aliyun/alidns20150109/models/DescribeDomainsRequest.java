// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsRequest extends TeaModel {
    /**
     * <p>The ID of the domain name group.</p>
     * <p>If you leave this parameter empty or pass an empty string, all domain names are queried.</p>
     * <p>If you set this parameter to defaultGroup, domain names in the default group are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The keyword. The search is performed in the %KeyWord% pattern and is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>com</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. The maximum value is <strong>100</strong>. The default value is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-re********</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The search mode. Valid values:</p>
     * <ul>
     * <li><p><strong>LIKE</strong>: fuzzy search</p>
     * </li>
     * <li><p><strong>EXACT</strong>: exact search</p>
     * </li>
     * </ul>
     * <p>Default value: LIKE</p>
     * 
     * <strong>example:</strong>
     * <p>LIKE</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>Specifies whether to query starred domain names. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * <p>Default value: true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Starmark")
    public Boolean starmark;

    public static DescribeDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsRequest self = new DescribeDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainsRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeDomainsRequest setStarmark(Boolean starmark) {
        this.starmark = starmark;
        return this;
    }
    public Boolean getStarmark() {
        return this.starmark;
    }

}
