// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateScenestatusRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateScenestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScenestatusRequest self = new UpdateScenestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScenestatusRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public UpdateScenestatusRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
