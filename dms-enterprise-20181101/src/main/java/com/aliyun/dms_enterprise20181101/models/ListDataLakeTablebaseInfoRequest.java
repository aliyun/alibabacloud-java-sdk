// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeTablebaseInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataRegion")
    public String dataRegion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Rows")
    public Integer rows;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListDataLakeTablebaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeTablebaseInfoRequest self = new ListDataLakeTablebaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLakeTablebaseInfoRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListDataLakeTablebaseInfoRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public ListDataLakeTablebaseInfoRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataLakeTablebaseInfoRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDataLakeTablebaseInfoRequest setRows(Integer rows) {
        this.rows = rows;
        return this;
    }
    public Integer getRows() {
        return this.rows;
    }

    public ListDataLakeTablebaseInfoRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListDataLakeTablebaseInfoRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
