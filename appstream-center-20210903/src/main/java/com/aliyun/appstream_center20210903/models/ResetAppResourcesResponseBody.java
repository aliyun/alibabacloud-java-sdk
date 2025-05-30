// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ResetAppResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidAppInstanceGroup.NotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>The app instance group is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ResetAppResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAppResourcesResponseBody self = new ResetAppResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAppResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetAppResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetAppResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetAppResourcesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
