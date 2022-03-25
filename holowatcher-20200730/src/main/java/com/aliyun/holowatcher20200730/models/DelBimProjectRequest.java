// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DelBimProjectRequest extends TeaModel {
    // 项目id
    @NameInMap("Id")
    public Long id;

    public static DelBimProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DelBimProjectRequest self = new DelBimProjectRequest();
        return TeaModel.build(map, self);
    }

    public DelBimProjectRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
