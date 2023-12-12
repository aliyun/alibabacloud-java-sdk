// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockDetailListRequest extends TeaModel {
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

    @NameInMap("StartTime")
    public String startTime;

    public static GetDeadLockDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockDetailListRequest self = new GetDeadLockDetailListRequest();
        return TeaModel.build(map, self);
    }

    public GetDeadLockDetailListRequest setDbNameList(String dbNameList) {
        this.dbNameList = dbNameList;
        return this;
    }
    public String getDbNameList() {
        return this.dbNameList;
    }

    public GetDeadLockDetailListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetDeadLockDetailListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDeadLockDetailListRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetDeadLockDetailListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetDeadLockDetailListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
