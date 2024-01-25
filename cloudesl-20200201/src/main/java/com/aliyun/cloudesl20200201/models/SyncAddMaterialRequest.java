// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class SyncAddMaterialRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Name")
    public String name;

    public static SyncAddMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAddMaterialRequest self = new SyncAddMaterialRequest();
        return TeaModel.build(map, self);
    }

    public SyncAddMaterialRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SyncAddMaterialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
