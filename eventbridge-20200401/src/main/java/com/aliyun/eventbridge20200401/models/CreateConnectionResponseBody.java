// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateConnectionResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
