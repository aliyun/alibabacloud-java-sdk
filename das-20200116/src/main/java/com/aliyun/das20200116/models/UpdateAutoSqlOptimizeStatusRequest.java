// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoSqlOptimizeStatusRequest extends TeaModel {
    /**
     * <p>The database instance IDs. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can specify up to 50 instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp10usoc1erj7****,rm-bp10usoc1erj7****</p>
     */
    @NameInMap("Instances")
    public String instances;

    /**
     * <p>The status of the automatic SQL optimization feature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The automatic SQL optimization feature is disabled.</li>
     * <li><strong>1</strong>: <strong>SQL diagnosis and automatic index creation</strong> is specified.</li>
     * <li><strong>3</strong>: <strong>SQL diagnosis only</strong> is specified.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
