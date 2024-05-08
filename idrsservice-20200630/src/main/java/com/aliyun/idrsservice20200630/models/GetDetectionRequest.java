// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectionRequest extends TeaModel {
    @NameInMap("ClientBaseParam")
    public String clientBaseParam;

    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionRequest self = new GetDetectionRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectionRequest setClientBaseParam(String clientBaseParam) {
        this.clientBaseParam = clientBaseParam;
        return this;
    }
    public String getClientBaseParam() {
        return this.clientBaseParam;
    }

    public GetDetectionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
