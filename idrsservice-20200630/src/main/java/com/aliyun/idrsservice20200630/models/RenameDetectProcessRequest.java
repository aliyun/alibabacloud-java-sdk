// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class RenameDetectProcessRequest extends TeaModel {
    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static RenameDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameDetectProcessRequest self = new RenameDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public RenameDetectProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RenameDetectProcessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
