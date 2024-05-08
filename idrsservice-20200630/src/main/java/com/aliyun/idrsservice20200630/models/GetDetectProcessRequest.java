// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessRequest extends TeaModel {
    @NameInMap("ClientBaseParam")
    public String clientBaseParam;

    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectProcessRequest self = new GetDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectProcessRequest setClientBaseParam(String clientBaseParam) {
        this.clientBaseParam = clientBaseParam;
        return this;
    }
    public String getClientBaseParam() {
        return this.clientBaseParam;
    }

    public GetDetectProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
