// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppAdaptorImageRequest extends TeaModel {
    @NameInMap("AdaptorUid")
    public String adaptorUid;

    public static CreateAppAdaptorImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAdaptorImageRequest self = new CreateAppAdaptorImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppAdaptorImageRequest setAdaptorUid(String adaptorUid) {
        this.adaptorUid = adaptorUid;
        return this;
    }
    public String getAdaptorUid() {
        return this.adaptorUid;
    }

}
