// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelArtifactBuildTaskResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The API call was successful.</p>
     * </li>
     * <li><p><code>false</code>: The API call failed.</p>
     * </li>
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
     * <p>C4C7DD0C-C9D6-437A-A7EE-121EFD70D002</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelArtifactBuildTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelArtifactBuildTaskResponseBody self = new CancelArtifactBuildTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelArtifactBuildTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelArtifactBuildTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CancelArtifactBuildTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
