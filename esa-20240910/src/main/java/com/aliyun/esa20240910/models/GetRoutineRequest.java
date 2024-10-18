// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>GetRoutine</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetRoutineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineRequest self = new GetRoutineRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
