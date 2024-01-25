// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteRealSceneInfoRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteRealSceneInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRealSceneInfoRequest self = new DeleteRealSceneInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRealSceneInfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteRealSceneInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
