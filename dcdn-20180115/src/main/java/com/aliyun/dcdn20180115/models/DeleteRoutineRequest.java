// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineRequest extends TeaModel {
    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
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
