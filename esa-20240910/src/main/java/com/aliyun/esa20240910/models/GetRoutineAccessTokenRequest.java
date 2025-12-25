// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineAccessTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine1</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetRoutineAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineAccessTokenRequest self = new GetRoutineAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineAccessTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
