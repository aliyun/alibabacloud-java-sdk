// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopBlueprintInstanceWorkflowRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    public static StopBlueprintInstanceWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StopBlueprintInstanceWorkflowRequest self = new StopBlueprintInstanceWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StopBlueprintInstanceWorkflowRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

}
