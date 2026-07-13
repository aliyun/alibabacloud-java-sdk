// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticsRequest extends TeaModel {
    /**
     * <p>The primary domain name to query.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end date of the query. Use the YYYY-MM-DD format.</p>
     * <p>The default value is the current date.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-14</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language of the request and response. The default value is <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
     * <p>The number of entries to return on each page for a paged query. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The start date of the query. Use the YYYY-MM-DD format.</p>
     * <p>You can query data from the last 90 days only.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-14</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The subdomain for which to view statistics.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The type of request statistics to query. Valid values:</p>
     * <ul>
     * <li><p>DOMAIN: queries statistics by domain name.</p>
     * </li>
     * <li><p>SUB_DOMAIN: queries statistics by subdomain.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribePdnsRequestStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsRequestStatisticsRequest self = new DescribePdnsRequestStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsRequestStatisticsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribePdnsRequestStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribePdnsRequestStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePdnsRequestStatisticsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsRequestStatisticsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsRequestStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribePdnsRequestStatisticsRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribePdnsRequestStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
