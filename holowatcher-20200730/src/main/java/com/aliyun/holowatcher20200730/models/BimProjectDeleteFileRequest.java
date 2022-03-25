// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProjectDeleteFileRequest extends TeaModel {
    // 源图纸id
    @NameInMap("Id")
    public Long id;

    public static BimProjectDeleteFileRequest build(java.util.Map<String, ?> map) throws Exception {
        BimProjectDeleteFileRequest self = new BimProjectDeleteFileRequest();
        return TeaModel.build(map, self);
    }

    public BimProjectDeleteFileRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
