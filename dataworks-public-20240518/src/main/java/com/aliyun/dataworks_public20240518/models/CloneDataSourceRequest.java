// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CloneDataSourceRequest extends TeaModel {
    /**
     * <p>The name of the target data source. The name can contain letters, digits, and underscores (_), and cannot start with a digit or an underscore. The name can be up to 60 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_holo_datasource</p>
     */
    @NameInMap("CloneDataSourceName")
    public String cloneDataSourceName;

    /**
     * <p>The ID of the data source, which is the unique identifier of the data source. You can call the ListDataSources operation to query existing data sources and their unique IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1603612</p>
     */
    @NameInMap("Id")
    public Long id;

    public static CloneDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDataSourceRequest self = new CloneDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CloneDataSourceRequest setCloneDataSourceName(String cloneDataSourceName) {
        this.cloneDataSourceName = cloneDataSourceName;
        return this;
    }
    public String getCloneDataSourceName() {
        return this.cloneDataSourceName;
    }

    public CloneDataSourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
