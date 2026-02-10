// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSchemasResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schemas")
    public ListSchemasResponseBodySchemas schemas;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchemasResponseBody self = new ListSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchemasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSchemasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchemasResponseBody setSchemas(ListSchemasResponseBodySchemas schemas) {
        this.schemas = schemas;
        return this;
    }
    public ListSchemasResponseBodySchemas getSchemas() {
        return this.schemas;
    }

    public ListSchemasResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListSchemasResponseBodySchemas extends TeaModel {
        @NameInMap("Schemas")
        public java.util.List<String> schemas;

        public static ListSchemasResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            ListSchemasResponseBodySchemas self = new ListSchemasResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public ListSchemasResponseBodySchemas setSchemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<String> getSchemas() {
            return this.schemas;
        }

    }

}
