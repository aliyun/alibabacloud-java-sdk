// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceCustomizedDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <strong>example:</strong>
     * <p>EEE92FA9-3181-5174-8A06-BE2252FA462E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceCustomizedDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceCustomizedDomainResponseBody self = new DeleteInstanceCustomizedDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceCustomizedDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInstanceCustomizedDomainResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteInstanceCustomizedDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
