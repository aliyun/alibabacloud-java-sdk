// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNameAndDescRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("DagName")
    public String dagName;

    @NameInMap("Description")
    public String description;

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
