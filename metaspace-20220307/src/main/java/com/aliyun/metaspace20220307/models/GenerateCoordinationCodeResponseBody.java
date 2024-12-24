// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class GenerateCoordinationCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PA3MU***</p>
     */
    @NameInMap("CoordinationCode")
    public String coordinationCode;

    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateCoordinationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCoordinationCodeResponseBody self = new GenerateCoordinationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCoordinationCodeResponseBody setCoordinationCode(String coordinationCode) {
        this.coordinationCode = coordinationCode;
        return this;
    }
    public String getCoordinationCode() {
        return this.coordinationCode;
    }

    public GenerateCoordinationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
