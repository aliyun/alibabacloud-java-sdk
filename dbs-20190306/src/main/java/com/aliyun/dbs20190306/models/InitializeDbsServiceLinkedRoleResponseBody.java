// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class InitializeDbsServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The value is null.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>EntityAlreadyExists.Role : The role already exists:AliyunServiceRoleForDBS\r\nRequestId : 73******-3B4D-501A-9505-FA8B9******</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>EntityAlreadyExists.Role</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static InitializeDbsServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeDbsServiceLinkedRoleResponseBody self = new InitializeDbsServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeDbsServiceLinkedRoleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
