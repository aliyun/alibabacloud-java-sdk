// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateConnectionResponseBodyData data;

    /**
     * <p>The returned message. If the request is successful, success is returned. If the request failed, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionResponseBody self = new CreateConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConnectionResponseBody setData(CreateConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateConnectionResponseBodyData getData() {
        return this.data;
    }

    public CreateConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateConnectionResponseBodyData extends TeaModel {
        /**
         * <p>The connection name.</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        public static CreateConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionResponseBodyData self = new CreateConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateConnectionResponseBodyData setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

    }

}
