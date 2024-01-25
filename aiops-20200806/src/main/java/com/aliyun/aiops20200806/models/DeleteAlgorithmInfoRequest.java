// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlgorithmInfoRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteAlgorithmInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlgorithmInfoRequest self = new DeleteAlgorithmInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlgorithmInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteAlgorithmInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
