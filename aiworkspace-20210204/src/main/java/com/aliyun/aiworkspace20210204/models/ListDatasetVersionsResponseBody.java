// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsResponseBody extends TeaModel {
    /**
     * <p>The list of dataset versions.</p>
     */
    @NameInMap("DatasetVersions")
    public java.util.List<DatasetVersion> datasetVersions;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0648C5BB-68D0-54D2-92A5-607135B8806B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of resources that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDatasetVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetVersionsResponseBody self = new ListDatasetVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetVersionsResponseBody setDatasetVersions(java.util.List<DatasetVersion> datasetVersions) {
        this.datasetVersions = datasetVersions;
        return this;
    }
    public java.util.List<DatasetVersion> getDatasetVersions() {
        return this.datasetVersions;
    }

    public ListDatasetVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
