// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyAccountRelationResponseBody extends TeaModel {
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
    public ModifyAccountRelationResponseBodyData data;

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

    public static ModifyAccountRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountRelationResponseBody self = new ModifyAccountRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyAccountRelationResponseBody setData(ModifyAccountRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyAccountRelationResponseBodyData getData() {
        return this.data;
    }

    public ModifyAccountRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAccountRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAccountRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyAccountRelationResponseBodyData extends TeaModel {
        /**
         * <p>HostId</p>
         * 
         * <strong>example:</strong>
         * <p>HostId</p>
         */
        @NameInMap("HostId")
        public String hostId;

        public static ModifyAccountRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyAccountRelationResponseBodyData self = new ModifyAccountRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyAccountRelationResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
