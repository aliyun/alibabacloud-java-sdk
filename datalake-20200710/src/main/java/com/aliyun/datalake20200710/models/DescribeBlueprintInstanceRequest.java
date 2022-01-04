// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeBlueprintInstanceRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    public static DescribeBlueprintInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlueprintInstanceRequest self = new DescribeBlueprintInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlueprintInstanceRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

}
