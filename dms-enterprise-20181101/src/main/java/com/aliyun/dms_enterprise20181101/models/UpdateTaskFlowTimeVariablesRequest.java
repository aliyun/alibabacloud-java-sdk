// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowTimeVariablesRequest extends TeaModel {
    /**
     * <p>The ID of the task node. You can call the <a href="https://help.aliyun.com/document_detail/424711.html">GetTaskInstanceRelation</a> operation to query the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43****</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>:To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The time variables for the task flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;variables&quot;:[ {&quot;name&quot;:&quot;var&quot;, &quot;pattern&quot;:&quot;yyyy-MM-dd|+0m+0h-2d+0w+0M+1y&quot;} ]}</p>
     */
    @NameInMap("TimeVariables")
    public String timeVariables;

    public static UpdateTaskFlowTimeVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowTimeVariablesRequest self = new UpdateTaskFlowTimeVariablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowTimeVariablesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowTimeVariablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateTaskFlowTimeVariablesRequest setTimeVariables(String timeVariables) {
        this.timeVariables = timeVariables;
        return this;
    }
    public String getTimeVariables() {
        return this.timeVariables;
    }

}
