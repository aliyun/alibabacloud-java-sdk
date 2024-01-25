// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDataSourceDetailRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetDataSourceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceDetailRequest self = new GetDataSourceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDataSourceDetailRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
