// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteScenarioRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenarioRequest self = new DeleteScenarioRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScenarioRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteScenarioRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
