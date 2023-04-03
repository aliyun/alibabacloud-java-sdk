// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainLogsRequest extends TeaModel {
    /**
     * <p>The ID of the domain name group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The keyword for the query in "%KeyWord%" mode. The keyword is not case-sensitive.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number to return. The page number starts from **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return per page. Maximum value: **100**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The start time for the query. Format: **YYYY-MM-DD**</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The type of object of which you want to query operation logs. Valid values:</p>
     * <br>
     * <p>*   domain: domain name</p>
     * <p>*   slavedns: secondary Domain Name System (DNS)</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The end time for the query. Format: **YYYY-MM-DD**</p>
     */
    @NameInMap("endDate")
    public String endDate;

    public static DescribeDomainLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainLogsRequest self = new DescribeDomainLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainLogsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainLogsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeDomainLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainLogsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeDomainLogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDomainLogsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
