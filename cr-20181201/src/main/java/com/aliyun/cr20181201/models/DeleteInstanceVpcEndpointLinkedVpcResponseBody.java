// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceVpcEndpointLinkedVpcResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20FE7A66-0044-4E23-BBEC-C434EADBD7AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceVpcEndpointLinkedVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceVpcEndpointLinkedVpcResponseBody self = new DeleteInstanceVpcEndpointLinkedVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteInstanceVpcEndpointLinkedVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
