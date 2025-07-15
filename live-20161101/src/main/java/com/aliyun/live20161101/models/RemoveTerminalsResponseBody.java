// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveTerminalsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4AF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the users.</p>
     */
    @NameInMap("Terminals")
    public java.util.List<RemoveTerminalsResponseBodyTerminals> terminals;

    public static RemoveTerminalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTerminalsResponseBody self = new RemoveTerminalsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTerminalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveTerminalsResponseBody setTerminals(java.util.List<RemoveTerminalsResponseBodyTerminals> terminals) {
        this.terminals = terminals;
        return this;
    }
    public java.util.List<RemoveTerminalsResponseBodyTerminals> getTerminals() {
        return this.terminals;
    }

    public static class RemoveTerminalsResponseBodyTerminals extends TeaModel {
        /**
         * <p>The returned status code. A value of 0 indicates that the request is successful. If the request fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1811****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The result of removing the specified users from the channel. Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        public static RemoveTerminalsResponseBodyTerminals build(java.util.Map<String, ?> map) throws Exception {
            RemoveTerminalsResponseBodyTerminals self = new RemoveTerminalsResponseBodyTerminals();
            return TeaModel.build(map, self);
        }

        public RemoveTerminalsResponseBodyTerminals setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public RemoveTerminalsResponseBodyTerminals setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RemoveTerminalsResponseBodyTerminals setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
