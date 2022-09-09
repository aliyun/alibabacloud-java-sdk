// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateParameterSetResponseBody extends TeaModel {
    @NameInMap("parameterSetId")
    public String parameterSetId;

    @NameInMap("requestId")
    public String requestId;

    public static CreateParameterSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterSetResponseBody self = new CreateParameterSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateParameterSetResponseBody setParameterSetId(String parameterSetId) {
        this.parameterSetId = parameterSetId;
        return this;
    }
    public String getParameterSetId() {
        return this.parameterSetId;
    }

    public CreateParameterSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
