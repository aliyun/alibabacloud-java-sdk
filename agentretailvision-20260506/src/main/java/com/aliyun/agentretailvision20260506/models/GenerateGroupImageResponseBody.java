// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class GenerateGroupImageResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>202</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The composite image generation result.</p>
     */
    @NameInMap("Data")
    public GenerateGroupImageResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateGroupImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateGroupImageResponseBody self = new GenerateGroupImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateGroupImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateGroupImageResponseBody setData(GenerateGroupImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateGroupImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateGroupImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateGroupImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateGroupImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateGroupImageResponseBodyData extends TeaModel {
        /**
         * <p>The composite image request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a5561c14-b5cd-49a4-ab79-01a63b10d99c</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        public static GenerateGroupImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateGroupImageResponseBodyData self = new GenerateGroupImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateGroupImageResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
