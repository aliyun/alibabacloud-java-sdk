// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockDetailListRequest extends TeaModel {
    /**
     * <p>The database name list.</p>
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
     * <p>1702360530292</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze2016723b328gs2</p>
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
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1701755730292</p>
     */
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
