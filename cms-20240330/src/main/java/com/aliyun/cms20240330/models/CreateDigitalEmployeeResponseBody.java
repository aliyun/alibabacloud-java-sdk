// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>3B311FD9-A60B-55E0-A896-A0C73*********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateDigitalEmployeeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalEmployeeResponseBody self = new CreateDigitalEmployeeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDigitalEmployeeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDigitalEmployeeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
