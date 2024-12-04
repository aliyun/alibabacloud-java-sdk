// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CloneDataSourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the cloned data source.</p>
     * 
     * <strong>example:</strong>
     * <p>19715</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>FCD583B9-346B-5E75-82C1-4A7C192C48DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneDataSourceResponseBody self = new CloneDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneDataSourceResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CloneDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
