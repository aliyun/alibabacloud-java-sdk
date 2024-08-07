// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemListRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>602e1f6b3543200eaab0a89e********</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The ID of the data entry. You can enter multiple IDs. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>5045****</p>
     */
    @NameInMap("DatasetItemIds")
    public String datasetItemIds;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDatasetItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetItemListRequest self = new DescribeDatasetItemListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetItemListRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DescribeDatasetItemListRequest setDatasetItemIds(String datasetItemIds) {
        this.datasetItemIds = datasetItemIds;
        return this;
    }
    public String getDatasetItemIds() {
        return this.datasetItemIds;
    }

    public DescribeDatasetItemListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatasetItemListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatasetItemListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
