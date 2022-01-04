// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteBlueprintInstanceRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    public static DeleteBlueprintInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlueprintInstanceRequest self = new DeleteBlueprintInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlueprintInstanceRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

}
