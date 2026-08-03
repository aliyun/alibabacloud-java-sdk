// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteIndividuationProjectResponseBody extends TeaModel {
    @NameInMap("desc")
    public String desc;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static DeleteIndividuationProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndividuationProjectResponseBody self = new DeleteIndividuationProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIndividuationProjectResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DeleteIndividuationProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIndividuationProjectResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
