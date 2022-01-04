// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetBlueprintInstanceRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    public static GetBlueprintInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlueprintInstanceRequest self = new GetBlueprintInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetBlueprintInstanceRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

}
