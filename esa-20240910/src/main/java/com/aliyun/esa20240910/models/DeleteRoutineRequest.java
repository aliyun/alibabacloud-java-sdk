// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-routine1</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteRoutineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineRequest self = new DeleteRoutineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
