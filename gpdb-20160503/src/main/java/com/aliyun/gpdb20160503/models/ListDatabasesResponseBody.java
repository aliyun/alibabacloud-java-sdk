// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    public ListDatabasesResponseBodyDatabases databases;

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

    public static ListDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponseBody self = new ListDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponseBody setDatabases(ListDatabasesResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public ListDatabasesResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public ListDatabasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDatabasesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListDatabasesResponseBodyDatabases extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<String> databases;

        public static ListDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyDatabases self = new ListDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyDatabases setDatabases(java.util.List<String> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<String> getDatabases() {
            return this.databases;
        }

    }

}
