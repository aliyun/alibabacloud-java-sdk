// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class SetInstanceRecordConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParamter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Parameter is null or invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Root")
    public Boolean root;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetInstanceRecordConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceRecordConfigResponseBody self = new SetInstanceRecordConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstanceRecordConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetInstanceRecordConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetInstanceRecordConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetInstanceRecordConfigResponseBody setRoot(Boolean root) {
        this.root = root;
        return this;
    }
    public Boolean getRoot() {
        return this.root;
    }

    public SetInstanceRecordConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
