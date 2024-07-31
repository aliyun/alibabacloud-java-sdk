// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaDBResponseBody extends TeaModel {
    /**
     * <p>The information about the metadatabases.</p>
     */
    @NameInMap("DatabaseInfo")
    public ListMetaDBResponseBodyDatabaseInfo databaseInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMetaDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDBResponseBody self = new ListMetaDBResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaDBResponseBody setDatabaseInfo(ListMetaDBResponseBodyDatabaseInfo databaseInfo) {
        this.databaseInfo = databaseInfo;
        return this;
    }
    public ListMetaDBResponseBodyDatabaseInfo getDatabaseInfo() {
        return this.databaseInfo;
    }

    public ListMetaDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMetaDBResponseBodyDatabaseInfoDbList extends TeaModel {
        /**
         * <p>The timestamp at which the metadatabase was created. You can convert the timestamp to the date based on the time zone that you use.</p>
         * 
         * <strong>example:</strong>
         * <p>1388776825</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>The URL of the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://localhost:777/user/hadoop/test.txt</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The timestamp at which the metadatabase was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1388776837</p>
         */
        @NameInMap("ModifiedTimeStamp")
        public Long modifiedTimeStamp;

        /**
         * <p>The name of the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1232</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The type of the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>HIVE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>32342</p>
         */
        @NameInMap("UUID")
        public String UUID;

        public static ListMetaDBResponseBodyDatabaseInfoDbList build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDBResponseBodyDatabaseInfoDbList self = new ListMetaDBResponseBodyDatabaseInfoDbList();
            return TeaModel.build(map, self);
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setModifiedTimeStamp(Long modifiedTimeStamp) {
            this.modifiedTimeStamp = modifiedTimeStamp;
            return this;
        }
        public Long getModifiedTimeStamp() {
            return this.modifiedTimeStamp;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setUUID(String UUID) {
            this.UUID = UUID;
            return this;
        }
        public String getUUID() {
            return this.UUID;
        }

    }

    public static class ListMetaDBResponseBodyDatabaseInfo extends TeaModel {
        /**
         * <p>The metadatabases.</p>
         */
        @NameInMap("DbList")
        public java.util.List<ListMetaDBResponseBodyDatabaseInfoDbList> dbList;

        /**
         * <p>The total number of the metadatabases returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListMetaDBResponseBodyDatabaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDBResponseBodyDatabaseInfo self = new ListMetaDBResponseBodyDatabaseInfo();
            return TeaModel.build(map, self);
        }

        public ListMetaDBResponseBodyDatabaseInfo setDbList(java.util.List<ListMetaDBResponseBodyDatabaseInfoDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListMetaDBResponseBodyDatabaseInfoDbList> getDbList() {
            return this.dbList;
        }

        public ListMetaDBResponseBodyDatabaseInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
