// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateChartNamespaceResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the API request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: successful</li>
     * <li><code>false</code>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6877B80A-2895-44C4-BC9E-703B157DEE66</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateChartNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateChartNamespaceResponseBody self = new UpdateChartNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateChartNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateChartNamespaceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateChartNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
