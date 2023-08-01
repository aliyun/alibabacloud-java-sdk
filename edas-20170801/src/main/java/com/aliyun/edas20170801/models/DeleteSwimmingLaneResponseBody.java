// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the lane is deleted.</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneResponseBody self = new DeleteSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteSwimmingLaneResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public DeleteSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
