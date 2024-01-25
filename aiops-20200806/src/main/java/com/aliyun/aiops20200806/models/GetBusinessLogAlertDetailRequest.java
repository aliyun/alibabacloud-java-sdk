// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessLogAlertDetailRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessLogAlertDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessLogAlertDetailRequest self = new GetBusinessLogAlertDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessLogAlertDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetBusinessLogAlertDetailRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
