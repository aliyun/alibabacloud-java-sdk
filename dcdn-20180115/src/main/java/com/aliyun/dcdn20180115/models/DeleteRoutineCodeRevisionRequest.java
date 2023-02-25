// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineCodeRevisionRequest extends TeaModel {
    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the version that you want to delete.</p>
     */
    @NameInMap("SelectCodeRevision")
    public String selectCodeRevision;

    public static DeleteRoutineCodeRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineCodeRevisionRequest self = new DeleteRoutineCodeRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineCodeRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteRoutineCodeRevisionRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}
