// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveGroupsResponseBody extends TeaModel {
    /**
     * <p>The result of the operation. A value of success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data information.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned. This parameter is not returned if the value of Code is `success`.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true: The request is successful. false: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCloudDriveGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudDriveGroupsResponseBody self = new DeleteCloudDriveGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudDriveGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCloudDriveGroupsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteCloudDriveGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCloudDriveGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCloudDriveGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
