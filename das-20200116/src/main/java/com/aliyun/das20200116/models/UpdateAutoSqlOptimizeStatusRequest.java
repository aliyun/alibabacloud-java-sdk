// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoSqlOptimizeStatusRequest extends TeaModel {
    /**
     * <p>The database instance IDs. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>>  You can specify up to 50 instance IDs.</p>
     */
    @NameInMap("Instances")
    public String instances;

    /**
     * <p>The status of the automatic SQL optimization feature. Valid values:</p>
     * <br>
     * <p>*   **0**: The automatic SQL optimization feature is disabled.</p>
     * <p>*   **1**: **SQL diagnosis and automatic index creation** is specified.</p>
     * <p>*   **3**: **SQL diagnosis only** is specified.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static UpdateAutoSqlOptimizeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoSqlOptimizeStatusRequest self = new UpdateAutoSqlOptimizeStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoSqlOptimizeStatusRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

    public UpdateAutoSqlOptimizeStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
