// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RelieveAccountRelationResponseBody extends TeaModel {
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
    public RelieveAccountRelationResponseBodyData data;

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

    public static RelieveAccountRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RelieveAccountRelationResponseBody self = new RelieveAccountRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public RelieveAccountRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RelieveAccountRelationResponseBody setData(RelieveAccountRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RelieveAccountRelationResponseBodyData getData() {
        return this.data;
    }

    public RelieveAccountRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RelieveAccountRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RelieveAccountRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RelieveAccountRelationResponseBodyData extends TeaModel {
        /**
         * <p>hostid</p>
         * 
         * <strong>example:</strong>
         * <p>HostId</p>
         */
        @NameInMap("HostId")
        public String hostId;

        public static RelieveAccountRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RelieveAccountRelationResponseBodyData self = new RelieveAccountRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RelieveAccountRelationResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
