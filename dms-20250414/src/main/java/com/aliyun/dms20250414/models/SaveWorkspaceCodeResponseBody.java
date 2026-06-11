// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SaveWorkspaceCodeResponseBody extends TeaModel {
    /**
     * <p>返回数据</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>错误码</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>http状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>错误信息，在接口失败时，返回具体错误信息，成功时则为空</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to publish，repo branch empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功。</p>
     * <ul>
     * <li><strong>true</strong>：调用成功。</li>
     * <li><strong>false</strong>：调用失败。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveWorkspaceCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWorkspaceCodeResponseBody self = new SaveWorkspaceCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWorkspaceCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveWorkspaceCodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SaveWorkspaceCodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveWorkspaceCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveWorkspaceCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveWorkspaceCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
