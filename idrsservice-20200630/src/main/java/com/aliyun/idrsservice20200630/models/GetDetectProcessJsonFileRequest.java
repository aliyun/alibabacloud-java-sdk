// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessJsonFileRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetDetectProcessJsonFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectProcessJsonFileRequest self = new GetDetectProcessJsonFileRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectProcessJsonFileRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
