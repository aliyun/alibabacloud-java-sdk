// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeTagRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**: ApsaraDB RDS for MySQL</p>
     * <p>*   **PolarDBMySQL**: PolarDB for MySQL</p>
     * <p>*   **PostgreSQL**: ApsaraDB RDS for PostgreSQL</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SQL template ID. You can call the [GetQueryOptimizeDataStats](https://help.aliyun.com/document_detail/405261.html) operation to query the SQL template ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    public static GetQueryOptimizeTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeTagRequest self = new GetQueryOptimizeTagRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeTagRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQueryOptimizeTagRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

}
