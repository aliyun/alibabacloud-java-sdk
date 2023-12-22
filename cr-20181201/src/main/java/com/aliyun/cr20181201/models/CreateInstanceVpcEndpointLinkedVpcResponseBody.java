// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceVpcEndpointLinkedVpcResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>*   `true`: The request is successful.</p>
     * <p>*   `false`: The request fails.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceVpcEndpointLinkedVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceVpcEndpointLinkedVpcResponseBody self = new CreateInstanceVpcEndpointLinkedVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceVpcEndpointLinkedVpcResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateInstanceVpcEndpointLinkedVpcResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateInstanceVpcEndpointLinkedVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
