// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCustomHostnamesRequest extends TeaModel {
    /**
     * <p>The SaaS domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>custom.site.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The search match mode for the SaaS domain name. Default value: exact. Valid values:</p>
     * <ul>
     * <li><strong>prefix</strong>: prefix match.</li>
     * <li><strong>suffix</strong>: suffix match.</li>
     * <li><strong>exact</strong>: exact match.</li>
     * <li><strong>fuzzy</strong>: fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exact</p>
     */
    @NameInMap("NameMatchType")
    public String nameMatchType;

    /**
     * <p>The page number for a paged query. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The associated record ID. You can call the <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> operation to obtain the record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>744571165985008</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The SaaS domain name status. Valid values:</p>
     * <ul>
     * <li><strong>pending</strong>: pending verification.</li>
     * <li><strong>active</strong>: activated.</li>
     * <li><strong>conflicted</strong>: occupied.</li>
     * <li><strong>offline</strong>: offline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCustomHostnamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomHostnamesRequest self = new ListCustomHostnamesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomHostnamesRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ListCustomHostnamesRequest setNameMatchType(String nameMatchType) {
        this.nameMatchType = nameMatchType;
        return this;
    }
    public String getNameMatchType() {
        return this.nameMatchType;
    }

    public ListCustomHostnamesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomHostnamesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomHostnamesRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public ListCustomHostnamesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListCustomHostnamesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
