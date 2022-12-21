// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogRequest extends TeaModel {
    // The end of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.
    @NameInMap("EndTime")
    public String endTime;

    // The functional module for which you want to query operation logs. If you do not specify this parameter, operation logs for all functional modules are returned. Valid values:
    // 
    // *   **PERMISSION**: permissions
    // *   **OWNER**: data owner
    // *   **SQL_CONSOLE**: data query
    // *   **SQL_CONSOLE_EXPORT**: query result export
    // *   **DATA_CHANGE**: data change
    // *   **DATA_EXPORT**: data export
    // *   **SQL_REVIEW**: SQL review
    // *   **DT_SYNC**: database and table synchronization
    // *   **DT_DETAIL**: database and table details
    // *   **DB_TASK**: task management
    // *   **INSTANCE_MANAGE**: instance management
    // *   **USER_MANAGE**: user management
    // *   **SECURITY_RULE**: security rule
    // *   **CONFIG_MANAGE**: configuration management
    // *   **RESOURCE_AUTH**: resource authorization
    // *   **ACCESS_WHITE_IP**: access IP address allowlist
    @NameInMap("Module")
    public String module;

    // The number of the page to return. Pages start from page 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values:
    // 
    // *   30
    // *   50
    // *   100
    @NameInMap("PageSize")
    public Integer pageSize;

    // The beginning of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.
    @NameInMap("StartTime")
    public String startTime;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static GetOpLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpLogRequest self = new GetOpLogRequest();
        return TeaModel.build(map, self);
    }

    public GetOpLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetOpLogRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public GetOpLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetOpLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOpLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetOpLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
