// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartRepositoryResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The API call is successful.</p>
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
     * <p>12589EF7-96E2-4554-AAD7-F7209E88CAD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteChartRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChartRepositoryResponseBody self = new DeleteChartRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChartRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteChartRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteChartRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
