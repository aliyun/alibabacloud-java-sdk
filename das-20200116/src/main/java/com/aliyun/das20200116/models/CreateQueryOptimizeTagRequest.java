// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateQueryOptimizeTagRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * <p>The value must be 1 to 300 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Slow SQL from offline synchronization. No optimization needed.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: RDS MySQL</li>
     * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL</li>
     * <li><strong>PostgreSQL</strong>: RDS PostgreSQL</li>
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
     * <p>The SQL template ID. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query SQL template IDs. You can specify multiple template IDs separated by commas (,) to add tags in batches.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6068ce044e3dc9b903979672fb0b69df,d12515c015fc9f41a0778a9e1de0****</p>
     */
    @NameInMap("SqlIds")
    public String sqlIds;

    /**
     * <p>The status of the <strong>Tags</strong> request parameter.</p>
     * <ul>
     * <li><strong>0</strong>: Clears all tags for the SQL template IDs specified by <strong>SqlIds</strong> and ignores the <strong>Tags</strong> parameter.</li>
     * <li><strong>1</strong>: Sets the tags for the SQL template IDs specified by <strong>SqlIds</strong> to the values specified by <strong>Tags</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The SQL tag. You can specify multiple values separated by commas (,).</p>
     * <ul>
     * <li><strong>DAS_IMPORTANT</strong>: important SQL.</li>
     * <li><strong>DAS_NOT_IMPORTANT</strong>: unimportant SQL.</li>
     * <li><strong>USER_IGNORE</strong>: optimization not required.</li>
     * <li><strong>DAS_IN_PLAN</strong>: scheduled for optimization.</li>
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
