// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <br>
     * <p>*   By default, the system uses the current time as the value of this parameter if the time that you specify is invalid.</p>
     * <p>*   If both the values of the StartDate and EndDate parameters are invalid, the system automatically queries the change logs that are generated within the last 30 days.</p>
     */
    @NameInMap("ChangeType")
    public String changeType;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <br>
     * <p>*   By default, the system uses the current time as the value of this parameter if the time that you specify is invalid.</p>
     * <p>*   If both the values of the StartDate and EndDate parameters are invalid, the system automatically queries the change logs that are generated within the last 30 days.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The globally unique identifier (GUID) of the table. Specify the GUID in the format of odps.projectName.tableName. You can call the [GetMetaDBTableList](~~173916~~) operation to query the GUID of the table.</p>
     * <br>
     * <p>>  To query the change logs of a MaxCompute table, you must call the [GetMetaTableChangeLog](~~173925~~) operation.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The type of the change. Valid values: CREATE_TABLE, ALTER_TABLE, DROP_TABLE, ADD_PARTITION, and DROP_PARTITION.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The entity on which the change is made. Valid values: TABLE and PARTITION.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static GetMetaTableChangeLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogRequest self = new GetMetaTableChangeLogRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableChangeLogRequest setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public GetMetaTableChangeLogRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetMetaTableChangeLogRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public GetMetaTableChangeLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMetaTableChangeLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaTableChangeLogRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetMetaTableChangeLogRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
