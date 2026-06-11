// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataCenterTableRequest extends TeaModel {
    /**
     * <p>For frontend use only.</p>
     * 
     * <strong>example:</strong>
     * <p>仅前端使用</p>
     */
    @NameInMap("CallFrom")
    public String callFrom;

    /**
     * <p>The name of the database.</p>
     * <ul>
     * <li>If <code>ImportType</code> is <code>FILE</code>, this parameter represents the file name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>diamonds.csv</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    /**
     * <p>The import type.</p>
     * <ul>
     * <li>FILE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("ImportType")
    public String importType;

    /**
     * <p>The name of the instance.</p>
     * <ul>
     * <li>If <code>ImportType</code> is <code>FILE</code>, this parameter represents the file ID of the data center.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f-ean8u5881qk4*********xh5y</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records to return per page. Default: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword for a fuzzy search of database tables.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>diamonds</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static ListDataCenterTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCenterTableRequest self = new ListDataCenterTableRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCenterTableRequest setCallFrom(String callFrom) {
        this.callFrom = callFrom;
        return this;
    }
    public String getCallFrom() {
        return this.callFrom;
    }

    public ListDataCenterTableRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListDataCenterTableRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public ListDataCenterTableRequest setImportType(String importType) {
        this.importType = importType;
        return this;
    }
    public String getImportType() {
        return this.importType;
    }

    public ListDataCenterTableRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListDataCenterTableRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataCenterTableRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCenterTableRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListDataCenterTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
