// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeDataSourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cl-0003jyv******fsku5m</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>ds-000******2nqeo</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>MyLocalNas</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <strong>example:</strong>
     * <p>COMMON_NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

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

    public static DescribeDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcesRequest self = new DescribeDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDataSourcesRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeDataSourcesRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public DescribeDataSourcesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DescribeDataSourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
