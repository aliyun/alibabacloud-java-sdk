// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateQueryOptimizeTagRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * <p>The remarks can be 1 to 300 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Slow SQL queries of offline synchronization. No optimization is required.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL</li>
     * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL</li>
     * <li><strong>PostgreSQL</strong>: ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SQL template IDs. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeExecErrorStats</a> operation to obtain the SQL template ID. Separate multiple SQL template IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6068ce044e3dc9b903979672fb0b69df,d12515c015fc9f41a0778a9e1de0e941</p>
     */
    @NameInMap("SqlIds")
    public String sqlIds;

    /**
     * <p>The status of <strong>Tags</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: removes all tags added to the SQL templates that are specified by <strong>SqlIds</strong> and leaves <strong>Tags</strong> empty.</li>
     * <li><strong>1</strong>: adds the tags specified by <strong>Tags</strong> to the SQL templates that are specified by <strong>SqlIds</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The SQL tags. Separate multiple SQL tags with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>DAS_IMPORTANT</strong>: The SQL template is important.</li>
     * <li><strong>DAS_NOT_IMPORTANT</strong>: The SQL template is unimportant.</li>
     * <li><strong>USER_IGNORE</strong>: The scheduling of the SQL template does not need to be optimized.</li>
     * <li><strong>DAS_IN_PLAN</strong>: The scheduling of the SQL template needs to be optimized.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAS_IN_PLAN,DAS_NOT_IMPORTANT</p>
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
