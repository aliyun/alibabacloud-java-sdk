// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTransportLayerApplicationsRequest extends TeaModel {
    /**
     * <p>The query type for the host record of Layer 4 applications. The following four types are supported, and the default is exact match.</p>
     * <ul>
     * <li>fuzzy: Fuzzy match.</li>
     * <li>exact: Exact match.</li>
     * <li>prefix: Prefix match.</li>
     * <li>suffix: Suffix match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The page number for paginated queries. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paginated queries. Valid values: 1-500.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The host record of the Layer 4 application.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>Site ID. You can obtain it by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListTransportLayerApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransportLayerApplicationsRequest self = new ListTransportLayerApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransportLayerApplicationsRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public ListTransportLayerApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransportLayerApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransportLayerApplicationsRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public ListTransportLayerApplicationsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
