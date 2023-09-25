// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDIJobResponseBody extends TeaModel {
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobResponseBody self = new CreateDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDIJobResponseBody setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public CreateDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
