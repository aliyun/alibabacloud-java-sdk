// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetListRequest extends TeaModel {
    /**
     * <p>The ID of the dataset. You can enter multiple dataset IDs. Separate the IDs with commas (,).</p>
     */
    @NameInMap("DatasetIds")
    public String datasetIds;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDatasetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetListRequest self = new DescribeDatasetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetListRequest setDatasetIds(String datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public String getDatasetIds() {
        return this.datasetIds;
    }

    public DescribeDatasetListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatasetListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatasetListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
