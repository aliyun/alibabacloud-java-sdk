// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTransportLayerApplicationsRequest extends TeaModel {
    /**
     * <p>The match type for the host record of the Layer 4 application. The default is an exact search. Valid values:</p>
     * <ul>
     * <li><p>fuzzy: fuzzy search.</p>
     * </li>
     * <li><p>exact: exact search.</p>
     * </li>
     * <li><p>prefix: prefix search.</p>
     * </li>
     * <li><p>suffix: suffix search.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The page number. The minimum value is 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 500.</p>
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
     * <p>The site ID. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain it.</p>
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
