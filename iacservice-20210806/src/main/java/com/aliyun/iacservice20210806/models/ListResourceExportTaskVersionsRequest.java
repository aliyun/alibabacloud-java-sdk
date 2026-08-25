// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTaskVersionsRequest extends TeaModel {
    /**
     * <p>The export version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("exportVersion")
    public String exportVersion;

    /**
     * <p>The search keyword. Fuzzy search on export version names is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The export status. Valid values:</p>
     * <ul>
     * <li>Queue: queued</li>
     * <li>Pending: preparing to run</li>
     * <li>Success: succeeded</li>
     * <li>Errored: failed</li>
     * <li>Canceled: canceled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Errored</p>
     */
    @NameInMap("status")
    public String status;

    public static ListResourceExportTaskVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExportTaskVersionsRequest self = new ListResourceExportTaskVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceExportTaskVersionsRequest setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public ListResourceExportTaskVersionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceExportTaskVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceExportTaskVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceExportTaskVersionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
