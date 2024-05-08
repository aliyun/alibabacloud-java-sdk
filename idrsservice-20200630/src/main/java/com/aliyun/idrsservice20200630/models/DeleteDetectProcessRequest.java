// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteDetectProcessRequest extends TeaModel {
    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectProcessRequest self = new DeleteDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDetectProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
