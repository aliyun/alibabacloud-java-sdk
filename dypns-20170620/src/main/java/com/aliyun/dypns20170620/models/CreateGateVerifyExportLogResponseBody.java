// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateGateVerifyExportLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C19D3BCD-2233-59DF-B459-6E6587C24405</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    public static CreateGateVerifyExportLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGateVerifyExportLogResponseBody self = new CreateGateVerifyExportLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGateVerifyExportLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGateVerifyExportLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGateVerifyExportLogResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
