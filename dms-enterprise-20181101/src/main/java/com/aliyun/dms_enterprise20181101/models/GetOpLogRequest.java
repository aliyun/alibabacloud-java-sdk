// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogRequest extends TeaModel {
    /**
     * <p>DatabaseName.</p>
     * 
     * <strong>example:</strong>
     * <p>dmstest@rm-bp1qb97d4b****.mysql.rds.aliyuncs.com:3306[poc_dev]</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-29 10:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The functional module for which you want to query operation logs. If you do not specify this parameter, operation logs for all functional modules are returned. Valid values:</p>
     * <ul>
     * <li><strong>PERMISSION</strong>: permissions</li>
     * <li><strong>OWNER</strong>: data owner</li>
     * <li><strong>SQL_CONSOLE</strong>: data query</li>
     * <li><strong>SQL_CONSOLE_EXPORT</strong>: query result export</li>
     * <li><strong>DATA_CHANGE</strong>: data change</li>
     * <li><strong>DATA_EXPORT</strong>: data export</li>
     * <li><strong>SQL_REVIEW</strong>: SQL review</li>
     * <li><strong>DT_SYNC</strong>: database and table synchronization</li>
     * <li><strong>DT_DETAIL</strong>: database and table details</li>
     * <li><strong>DB_TASK</strong>: task management</li>
     * <li><strong>INSTANCE_MANAGE</strong>: instance management</li>
     * <li><strong>USER_MANAGE</strong>: user management</li>
     * <li><strong>SECURITY_RULE</strong>: security rules</li>
     * <li><strong>CONFIG_MANAGE</strong>: configuration management</li>
     * <li><strong>RESOURCE_AUTH</strong>: resource authorization</li>
     * <li><strong>ACCESS_WHITE_IP</strong>: access IP address whitelist</li>
     * <li><strong>NDDL</strong>: schema design</li>
     * <li><strong>DSQL_CONSOLE</strong>: cross-database data query</li>
     * <li><strong>DSQL_CONSOLE_EXPORT</strong>: cross-database query result export</li>
     * <li><strong>DATA_TRACT</strong>: data tracking</li>
     * <li><strong>DATA_QUALITY</strong>: data quality</li>
     * <li><strong>DATALINK_MANAGE</strong> :DBLink management</li>
     * <li><strong>DATASEC_MANAGE</strong>: sensitive data management</li>
     * <li><strong>SELL</strong>: sales</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SECURITY_RULE</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li>30</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-23 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>UserNick.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("UserNick")
    public String userNick;

    public static GetOpLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpLogRequest self = new GetOpLogRequest();
        return TeaModel.build(map, self);
    }

    public GetOpLogRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
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

    public GetOpLogRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
