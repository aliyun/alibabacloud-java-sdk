// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsResponseBody extends TeaModel {
    @NameInMap("DatasetVersions")
    public java.util.List<DatasetVersion> datasetVersions;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

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

    public ListDatasetVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDatasetVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
