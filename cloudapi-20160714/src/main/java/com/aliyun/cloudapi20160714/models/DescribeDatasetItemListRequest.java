// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemListRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("DatasetItemIds")
    public String datasetItemIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

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
