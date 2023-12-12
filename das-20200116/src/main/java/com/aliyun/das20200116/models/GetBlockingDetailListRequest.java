// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetBlockingDetailListRequest extends TeaModel {
    @NameInMap("DbNameList")
    public String dbNameList;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("QueryHash")
    public String queryHash;

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
