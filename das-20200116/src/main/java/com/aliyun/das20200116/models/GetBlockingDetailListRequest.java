// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetBlockingDetailListRequest extends TeaModel {
    /**
     * <p>The database name list.</p>
     * <ul>
     * <li>Separate multiple database names with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>school1,school2</p>
     */
    @NameInMap("DbNameList")
    public String dbNameList;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1682490480548</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4nfalp2ap421312z</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page. The value must be an integer that is greater than 0. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The hash value of the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>DC08B955CAD25E7B</p>
     */
    @NameInMap("QueryHash")
    public String queryHash;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1679429913757</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetBlockingDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockingDetailListRequest self = new GetBlockingDetailListRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockingDetailListRequest setDbNameList(String dbNameList) {
        this.dbNameList = dbNameList;
        return this;
    }
    public String getDbNameList() {
        return this.dbNameList;
    }

    public GetBlockingDetailListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetBlockingDetailListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetBlockingDetailListRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetBlockingDetailListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetBlockingDetailListRequest setQueryHash(String queryHash) {
        this.queryHash = queryHash;
        return this;
    }
    public String getQueryHash() {
        return this.queryHash;
    }

    public GetBlockingDetailListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
