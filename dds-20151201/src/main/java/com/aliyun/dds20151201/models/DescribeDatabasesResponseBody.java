// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    public DescribeDatabasesResponseBodyDatabases databases;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>009D2572-6839-43C0-8D89-44DB46CBA2EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponseBody self = new DescribeDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponseBody setDatabases(DescribeDatabasesResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDatabasesResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public DescribeDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDatabasesResponseBodyDatabases extends TeaModel {
        @NameInMap("Database")
        public java.util.List<String> database;

        public static DescribeDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabases self = new DescribeDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabases setDatabase(java.util.List<String> database) {
            this.database = database;
            return this;
        }
        public java.util.List<String> getDatabase() {
            return this.database;
        }

    }

}
