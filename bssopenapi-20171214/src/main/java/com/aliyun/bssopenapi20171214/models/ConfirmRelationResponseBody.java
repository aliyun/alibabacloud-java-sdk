// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConfirmRelationResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ConfirmRelationResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Message returned</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConfirmRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRelationResponseBody self = new ConfirmRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfirmRelationResponseBody setData(ConfirmRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfirmRelationResponseBodyData getData() {
        return this.data;
    }

    public ConfirmRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfirmRelationResponseBodyData extends TeaModel {
        /**
         * <p>HostId</p>
         * 
         * <strong>example:</strong>
         * <p>HostId</p>
         */
        @NameInMap("HostId")
        public String hostId;

        public static ConfirmRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfirmRelationResponseBodyData self = new ConfirmRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfirmRelationResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
