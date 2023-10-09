// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllInstanceIdListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The IDs of instances that are managed by the Alibaba Cloud account in all the regions.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.Map<String, ?> instanceIds;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAllInstanceIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllInstanceIdListResponseBody self = new GetAllInstanceIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllInstanceIdListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllInstanceIdListResponseBody setInstanceIds(java.util.Map<String, ?> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.Map<String, ?> getInstanceIds() {
        return this.instanceIds;
    }

    public GetAllInstanceIdListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllInstanceIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllInstanceIdListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
