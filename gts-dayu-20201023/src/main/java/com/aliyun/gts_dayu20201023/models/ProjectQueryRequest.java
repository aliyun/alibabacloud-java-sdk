// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class ProjectQueryRequest extends TeaModel {
    // A short description of struct
    @NameInMap("Name")
    public String name;

    public static ProjectQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectQueryRequest self = new ProjectQueryRequest();
        return TeaModel.build(map, self);
    }

    public ProjectQueryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
