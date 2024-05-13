// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNameAndDescRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](https://help.aliyun.com/document_detail/424565.html) or [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to query the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The new name that you want to specify for the task flow.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagName")
    public String dagName;

    /**
     * <p>The description that you want to specify for the task flow.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowNameAndDescRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowNameAndDescRequest self = new UpdateTaskFlowNameAndDescRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowNameAndDescRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowNameAndDescRequest setDagName(String dagName) {
        this.dagName = dagName;
        return this;
    }
    public String getDagName() {
        return this.dagName;
    }

    public UpdateTaskFlowNameAndDescRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskFlowNameAndDescRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
