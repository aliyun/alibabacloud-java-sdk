// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordTemplateRequest self = new DeleteLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
