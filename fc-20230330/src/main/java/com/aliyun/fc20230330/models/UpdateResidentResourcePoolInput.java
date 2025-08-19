// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateResidentResourcePoolInput extends TeaModel {
    @NameInMap("name")
    public String name;

    public static UpdateResidentResourcePoolInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateResidentResourcePoolInput self = new UpdateResidentResourcePoolInput();
        return TeaModel.build(map, self);
    }

    public UpdateResidentResourcePoolInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
