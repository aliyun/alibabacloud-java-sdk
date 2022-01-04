// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunBlueprintInstanceWorkflowRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    public static RunBlueprintInstanceWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RunBlueprintInstanceWorkflowRequest self = new RunBlueprintInstanceWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public RunBlueprintInstanceWorkflowRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

}
