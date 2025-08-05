// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDIJobResponseBody extends TeaModel {
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobResponseBody self = new CreateDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public CreateDIJobResponseBody setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public CreateDIJobResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
