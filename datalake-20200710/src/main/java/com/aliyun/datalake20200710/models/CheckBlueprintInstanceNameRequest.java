// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckBlueprintInstanceNameRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static CheckBlueprintInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBlueprintInstanceNameRequest self = new CheckBlueprintInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckBlueprintInstanceNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
