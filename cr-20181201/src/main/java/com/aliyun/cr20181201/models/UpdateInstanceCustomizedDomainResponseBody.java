// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateInstanceCustomizedDomainResponseBody extends TeaModel {
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
     * <p>2EFAF75C-1FA7-5254-B044-E97291C170CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceCustomizedDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceCustomizedDomainResponseBody self = new UpdateInstanceCustomizedDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceCustomizedDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstanceCustomizedDomainResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateInstanceCustomizedDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
