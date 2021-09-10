// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DatabaseInfo")
    public ListMetaDBResponseBodyDatabaseInfo databaseInfo;

    public static ListMetaDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDBResponseBody self = new ListMetaDBResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaDBResponseBody setDatabaseInfo(ListMetaDBResponseBodyDatabaseInfo databaseInfo) {
        this.databaseInfo = databaseInfo;
        return this;
    }
    public ListMetaDBResponseBodyDatabaseInfo getDatabaseInfo() {
        return this.databaseInfo;
    }

    public static class ListMetaDBResponseBodyDatabaseInfoDbList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("UUID")
        public String UUID;

        @NameInMap("ModifiedTimeStamp")
        public Long modifiedTimeStamp;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Location")
        public String location;

        public static ListMetaDBResponseBodyDatabaseInfoDbList build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDBResponseBodyDatabaseInfoDbList self = new ListMetaDBResponseBodyDatabaseInfoDbList();
            return TeaModel.build(map, self);
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public ListMetaDBResponseBodyDatabaseInfoDbList setUUID(String UUID) {
            this.UUID = UUID;
            return this;
        }
        public String getUUID() {
            return this.UUID;
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

        public ListMetaDBResponseBodyDatabaseInfoDbList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class ListMetaDBResponseBodyDatabaseInfo extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("DbList")
        public java.util.List<ListMetaDBResponseBodyDatabaseInfoDbList> dbList;

        public static ListMetaDBResponseBodyDatabaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDBResponseBodyDatabaseInfo self = new ListMetaDBResponseBodyDatabaseInfo();
            return TeaModel.build(map, self);
        }

        public ListMetaDBResponseBodyDatabaseInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListMetaDBResponseBodyDatabaseInfo setDbList(java.util.List<ListMetaDBResponseBodyDatabaseInfoDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListMetaDBResponseBodyDatabaseInfoDbList> getDbList() {
            return this.dbList;
        }

    }

}
