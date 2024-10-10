// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CloneDataSourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo_holo_datasource</p>
     */
    @NameInMap("CloneDataSourceName")
    public String cloneDataSourceName;

    /**
     * <strong>example:</strong>
     * <p>16036</p>
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
