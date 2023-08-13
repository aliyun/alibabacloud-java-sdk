// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateQueryOptimizeTagRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * <br>
     * <p>The remarks can be 1 to 300 characters in length.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**: ApsaraDB RDS for MySQL</p>
     * <p>*   **PolarDBMySQL**: PolarDB for MySQL</p>
     * <p>*   **PostgreSQL**: ApsaraDB RDS for PostgreSQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SQL template IDs. You can call the [GetQueryOptimizeExecErrorStats](~~405261~~) operation to obtain the SQL template ID. Separate multiple SQL template IDs with commas (,).</p>
     */
    @NameInMap("SqlIds")
    public String sqlIds;

    /**
     * <p>The status of **Tags**. Valid values:</p>
     * <br>
     * <p>*   **0**: removes all tags added to the SQL templates that are specified by **SqlIds** and leaves **Tags** empty.</p>
     * <p>*   **1**: adds the tags specified by **Tags** to the SQL templates that are specified by **SqlIds**.</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The SQL tags. Separate multiple SQL tags with commas (,). Valid values:</p>
     * <br>
     * <p>*   **DAS_IMPORTANT**: The SQL template is important.</p>
     * <p>*   **DAS_NOT_IMPORTANT**: The SQL template is unimportant.</p>
     * <p>*   **USER_IGNORE**: The scheduling of the SQL template does not need to be optimized.</p>
     * <p>*   **DAS_IN_PLAN**: The scheduling of the SQL template needs to be optimized.</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static CreateQueryOptimizeTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueryOptimizeTagRequest self = new CreateQueryOptimizeTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueryOptimizeTagRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateQueryOptimizeTagRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateQueryOptimizeTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateQueryOptimizeTagRequest setSqlIds(String sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }
    public String getSqlIds() {
        return this.sqlIds;
    }

    public CreateQueryOptimizeTagRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateQueryOptimizeTagRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
