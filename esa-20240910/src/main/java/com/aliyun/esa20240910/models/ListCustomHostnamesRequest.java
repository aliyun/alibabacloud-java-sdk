// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCustomHostnamesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>custom.site.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>exact</p>
     */
    @NameInMap("NameMatchType")
    public String nameMatchType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>744571165985008</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
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
