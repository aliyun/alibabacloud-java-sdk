// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SynchronizeResourceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned for the request.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the resources are synchronized. Valid values:</p>
     * <br>
     * <p>*   **true**: The resources are synchronized.</p>
     * <p>*   **false**: The resources fail to be synchronized.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SynchronizeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeResourceResponseBody self = new SynchronizeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SynchronizeResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SynchronizeResourceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SynchronizeResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SynchronizeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SynchronizeResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
