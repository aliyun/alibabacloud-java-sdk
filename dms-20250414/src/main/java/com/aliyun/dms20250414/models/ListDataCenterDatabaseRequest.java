// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataCenterDatabaseRequest extends TeaModel {
    /**
     * <p>This parameter is for internal use.</p>
     * 
     * <strong>example:</strong>
     * <p>Frontend only</p>
     */
    @NameInMap("CallFrom")
    public String callFrom;

    /**
     * <p>The DMS unit.</p>
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
     * <p>This parameter is for internal use.</p>
     * 
     * <strong>example:</strong>
     * <p>Frontend only</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The keyword for a fuzzy search for databases.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    public static ListDataCenterDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCenterDatabaseRequest self = new ListDataCenterDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCenterDatabaseRequest setCallFrom(String callFrom) {
        this.callFrom = callFrom;
        return this;
    }
    public String getCallFrom() {
        return this.callFrom;
    }

    public ListDataCenterDatabaseRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public ListDataCenterDatabaseRequest setImportType(String importType) {
        this.importType = importType;
        return this;
    }
    public String getImportType() {
        return this.importType;
    }

    public ListDataCenterDatabaseRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListDataCenterDatabaseRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
