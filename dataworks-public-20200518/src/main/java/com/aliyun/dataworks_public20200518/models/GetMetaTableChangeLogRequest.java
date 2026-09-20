// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogRequest extends TeaModel {
    /**
     * <p>The type of change. Valid values: CREATE_TABLE, ALTER_TABLE, DROP_TABLE, ADD_PARTITION, and DROP_PARTITION.</p>
     * 
     * <strong>example:</strong>
     * <p>ALTER_TABLE</p>
     */
    @NameInMap("ChangeType")
    public String changeType;

    /**
     * <p>The end date of the table change. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <ul>
     * <li>If the date validation fails, the system uses the current time as the end date by default.</li>
     * <li>If both the start date and end date fail validation, the system automatically retrieves the table change records from the last 30 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2020-06-02 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The type of the changed object. Valid values: TABLE and PARTITION.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The page number. Used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start date of the table change. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <ul>
     * <li>If the date validation fails, the system uses the current time as the start date by default.</li>
     * <li>If both the start date and end date fail validation, the system automatically retrieves the table change records from the last 30 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2020-06-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The globally unique identifier (GUID) of the table. Format: odps.projectName.tableName. You can call <a href="https://help.aliyun.com/document_detail/2780086.html">GetMetaDBTableList</a> to obtain the GUID of the table.</p>
     * <blockquote>
     * <p>Currently, you can call <a href="https://help.aliyun.com/document_detail/2780094.html">GetMetaTableChangeLog</a> to retrieve the change log of only MaxCompute tables.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.engine_name.table_name</p>
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
