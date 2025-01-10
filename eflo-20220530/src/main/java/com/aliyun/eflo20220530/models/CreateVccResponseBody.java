// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Content")
    public CreateVccResponseBodyContent content;

    /**
     * <p>response message, if the success request is</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>039C3C3A-3C37-5672-80D5-D8CD48C676D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVccResponseBody self = new CreateVccResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVccResponseBody setContent(CreateVccResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVccResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVccResponseBodyContent extends TeaModel {
        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        @NameInMap("VccId")
        public String vccId;

        public static CreateVccResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVccResponseBodyContent self = new CreateVccResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVccResponseBodyContent setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

    }

}
