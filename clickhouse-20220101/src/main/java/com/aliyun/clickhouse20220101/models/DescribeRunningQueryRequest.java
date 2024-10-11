// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeRunningQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cc-bp1qx68m06981****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueryDurationMs")
    public Long queryDurationMs;

    /**
     * <strong>example:</strong>
     * <p>c8cbcbaf-d4ab-4e74-900d-90d7c0aecaae</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <strong>example:</strong>
     * <p>order by</p>
     */
    @NameInMap("QueryKeyWord")
    public String queryKeyWord;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QueryUser")
    public String queryUser;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vw-uf62965t8lt50****</p>
     */
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static DescribeRunningQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningQueryRequest self = new DescribeRunningQueryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRunningQueryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeRunningQueryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRunningQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunningQueryRequest setQueryDurationMs(Long queryDurationMs) {
        this.queryDurationMs = queryDurationMs;
        return this;
    }
    public Long getQueryDurationMs() {
        return this.queryDurationMs;
    }

    public DescribeRunningQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeRunningQueryRequest setQueryKeyWord(String queryKeyWord) {
        this.queryKeyWord = queryKeyWord;
        return this;
    }
    public String getQueryKeyWord() {
        return this.queryKeyWord;
    }

    public DescribeRunningQueryRequest setQueryUser(String queryUser) {
        this.queryUser = queryUser;
        return this;
    }
    public String getQueryUser() {
        return this.queryUser;
    }

    public DescribeRunningQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRunningQueryRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
