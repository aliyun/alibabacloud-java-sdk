// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GenerateCoordinationCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CSHGDK</p>
     */
    @NameInMap("CoordinatorCode")
    public String coordinatorCode;

    /**
     * <strong>example:</strong>
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateCoordinationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCoordinationCodeResponseBody self = new GenerateCoordinationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCoordinationCodeResponseBody setCoordinatorCode(String coordinatorCode) {
        this.coordinatorCode = coordinatorCode;
        return this;
    }
    public String getCoordinatorCode() {
        return this.coordinatorCode;
    }

    public GenerateCoordinationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
