// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakeDatabaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("DataRegion")
    public String dataRegion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataLakeDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakeDatabaseRequest self = new GetDataLakeDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetDataLakeDatabaseRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public GetDataLakeDatabaseRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public GetDataLakeDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDataLakeDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
