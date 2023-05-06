// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppAdaptorRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    public static GetAppAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppAdaptorRequest self = new GetAppAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public GetAppAdaptorRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
