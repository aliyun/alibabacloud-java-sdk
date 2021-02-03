// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("Starmark")
    public Boolean starmark;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Tag")
    public java.util.List<DescribeDomainsRequestTag> tag;

    public static DescribeDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsRequest self = new DescribeDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeDomainsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeDomainsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

    public DescribeDomainsRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeDomainsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeDomainsRequest setStarmark(Boolean starmark) {
        this.starmark = starmark;
        return this;
    }
    public Boolean getStarmark() {
        return this.starmark;
    }

    public DescribeDomainsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeDomainsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDomainsRequest setTag(java.util.List<DescribeDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDomainsRequestTag extends TeaModel {
        public static DescribeDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsRequestTag self = new DescribeDomainsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
