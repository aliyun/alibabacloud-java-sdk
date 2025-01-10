// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetDestinationCidrBlockResponseBody extends TeaModel {
    /**
     * <p>The response status code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response content</p>
     */
    @NameInMap("Content")
    public GetDestinationCidrBlockResponseBodyContent content;

    /**
     * <p>Error message. (Indicates the reason for the anomaly when the instance status is abnormal.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of this request</p>
     * 
     * <strong>example:</strong>
     * <p>D349EE86-AF3F-5F6C-87E2-2A08D3618350</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDestinationCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDestinationCidrBlockResponseBody self = new GetDestinationCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDestinationCidrBlockResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDestinationCidrBlockResponseBody setContent(GetDestinationCidrBlockResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetDestinationCidrBlockResponseBodyContent getContent() {
        return this.content;
    }

    public GetDestinationCidrBlockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDestinationCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDestinationCidrBlockResponseBodyContent extends TeaModel {
        /**
         * <p>List of destination CIDR block information for the current network instance</p>
         */
        @NameInMap("DestinationCidrBlock")
        public java.util.List<String> destinationCidrBlock;

        public static GetDestinationCidrBlockResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetDestinationCidrBlockResponseBodyContent self = new GetDestinationCidrBlockResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetDestinationCidrBlockResponseBodyContent setDestinationCidrBlock(java.util.List<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public java.util.List<String> getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

    }

}
