// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateParameterSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pts-3b6cb9fa4751afff89a4b73779e0d</p>
     */
    @NameInMap("parameterSetId")
    public String parameterSetId;

    /**
     * <strong>example:</strong>
     * <p>7FA0FF4A-ABD4-54F6-BEAC-B4273EBA10A2</p>
     */
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
