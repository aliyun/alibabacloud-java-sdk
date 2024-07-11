// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxySQLExecAuditLogRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1636962846000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The execution status of the SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>FAIL</strong>: The execution of the SQL statement fails.</li>
     * <li><strong>CANCEL</strong>: The execution of the SQL statement is canceled.</li>
     * <li><strong>SUCCESS</strong>: The SQL statement is executed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("ExecState")
    public String execState;

    /**
     * <p>The alias of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>testNickName</p>
     */
    @NameInMap("OpUserName")
    public String opUserName;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum values: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>SELECT</strong></li>
     * <li><strong>INSERT</strong></li>
     * <li><strong>DELETE</strong></li>
     * <li><strong>CREATE_TABLE</strong></li>
     * </ul>
     * <blockquote>
     * <p> You can choose Operation Audit &gt; Secure Access Proxy in the top navigation bar of the DMS console to view more types of SQL statements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SQLType")
    public String SQLType;

    /**
     * <p>The name of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The beginning of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1636876446000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListProxySQLExecAuditLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProxySQLExecAuditLogRequest self = new ListProxySQLExecAuditLogRequest();
        return TeaModel.build(map, self);
    }

    public ListProxySQLExecAuditLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListProxySQLExecAuditLogRequest setExecState(String execState) {
        this.execState = execState;
        return this;
    }
    public String getExecState() {
        return this.execState;
    }

    public ListProxySQLExecAuditLogRequest setOpUserName(String opUserName) {
        this.opUserName = opUserName;
        return this;
    }
    public String getOpUserName() {
        return this.opUserName;
    }

    public ListProxySQLExecAuditLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProxySQLExecAuditLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProxySQLExecAuditLogRequest setSQLType(String SQLType) {
        this.SQLType = SQLType;
        return this;
    }
    public String getSQLType() {
        return this.SQLType;
    }

    public ListProxySQLExecAuditLogRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListProxySQLExecAuditLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListProxySQLExecAuditLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
