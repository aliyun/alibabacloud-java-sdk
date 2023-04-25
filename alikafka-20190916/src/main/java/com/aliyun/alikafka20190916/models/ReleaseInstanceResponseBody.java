// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ReleaseInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>You cannot call this operation to release a subscription Message Queue for Apache Kafka instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Releases a pay-as-you-go Message Queue for Apache Kafka instance.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReleaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceResponseBody self = new ReleaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReleaseInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
