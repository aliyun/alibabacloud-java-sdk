// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAppBySwimmingLaneGroupTagsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, java.util.List<DataValue>> data;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional request information.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAppBySwimmingLaneGroupTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppBySwimmingLaneGroupTagsResponseBody self = new ListAppBySwimmingLaneGroupTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppBySwimmingLaneGroupTagsResponseBody setData(java.util.Map<String, java.util.List<DataValue>> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, java.util.List<DataValue>> getData() {
        return this.data;
    }

    public ListAppBySwimmingLaneGroupTagsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppBySwimmingLaneGroupTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppBySwimmingLaneGroupTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppBySwimmingLaneGroupTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
