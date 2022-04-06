// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskGroupRequest extends TeaModel {
    @NameInMap("ClientBaseParam")
    public String clientBaseParam;

    @NameInMap("Id")
    public String id;

    public static GetTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskGroupRequest self = new GetTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskGroupRequest setClientBaseParam(String clientBaseParam) {
        this.clientBaseParam = clientBaseParam;
        return this;
    }
    public String getClientBaseParam() {
        return this.clientBaseParam;
    }

    public GetTaskGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
