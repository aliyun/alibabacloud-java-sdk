// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The functional module for which you want to query operation logs. If you do not specify this parameter, operation logs for all functional modules are returned. Valid values:</p>
     * <br>
     * <p>*   **PERMISSION**: permissions</p>
     * <p>*   **OWNER**: data owner</p>
     * <p>*   **SQL_CONSOLE**: data query</p>
     * <p>*   **SQL_CONSOLE_EXPORT**: query result export</p>
     * <p>*   **DATA_CHANGE**: data change</p>
     * <p>*   **DATA_EXPORT**: data export</p>
     * <p>*   **SQL_REVIEW**: SQL review</p>
     * <p>*   **DT_SYNC**: database and table synchronization</p>
     * <p>*   **DT_DETAIL**: database and table details</p>
     * <p>*   **DB_TASK**: task management</p>
     * <p>*   **INSTANCE_MANAGE**: instance management</p>
     * <p>*   **USER_MANAGE**: user management</p>
     * <p>*   **SECURITY_RULE**: security rules</p>
     * <p>*   **CONFIG_MANAGE**: configuration management</p>
     * <p>*   **RESOURCE_AUTH**: resource authorization</p>
     * <p>*   **ACCESS_WHITE_IP**: access IP address whitelist</p>
     * <p>*   **NDDL**: schema design</p>
     * <p>*   **DSQL_CONSOLE**: cross-database data query</p>
     * <p>*   **DSQL_CONSOLE_EXPORT**: cross-database query result export</p>
     * <p>*   **DATA_TRACT**: data tracking</p>
     * <p>*   **DATA_QUALITY**: data quality</p>
     * <p>*   **DATALINK_MANAGE** :DBLink management</p>
     * <p>*   **DATASEC_MANAGE**: sensitive data management</p>
     * <p>*   **SELL**: sales</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <br>
     * <p>*   30</p>
     * <p>*   50</p>
     * <p>*   100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
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
