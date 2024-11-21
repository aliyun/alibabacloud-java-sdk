// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerRecordsRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The match mode to filter the record names:</p>
     * <ul>
     * <li><strong>fuzzy</strong></li>
     * <li><strong>prefix</strong></li>
     * <li><strong>suffix</strong></li>
     * <li><strong>exact</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("RecordMatchType")
    public String recordMatchType;

    /**
     * <p>The record name.</p>
     * 
     * <strong>example:</strong>
     * <p>a.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListEdgeContainerRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerRecordsRequest self = new ListEdgeContainerRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeContainerRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeContainerRecordsRequest setRecordMatchType(String recordMatchType) {
        this.recordMatchType = recordMatchType;
        return this;
    }
    public String getRecordMatchType() {
        return this.recordMatchType;
    }

    public ListEdgeContainerRecordsRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public ListEdgeContainerRecordsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
