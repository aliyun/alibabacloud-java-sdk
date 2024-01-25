// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class EndScriptListRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static EndScriptListRequest build(java.util.Map<String, ?> map) throws Exception {
        EndScriptListRequest self = new EndScriptListRequest();
        return TeaModel.build(map, self);
    }

    public EndScriptListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EndScriptListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
