// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagScanTaskResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the API call succeeded. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The API call succeeded.</p>
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
     * <p>BC648259-91A7-4502-BED3-EDF64361FA83</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRepoTagScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTagScanTaskResponseBody self = new CreateRepoTagScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepoTagScanTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRepoTagScanTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateRepoTagScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
