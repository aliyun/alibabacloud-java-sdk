// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordTemplateRequest self = new GetLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
