// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaDBResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DatabaseInfo")
    @Validation(required = true)
    public ListMetaDBResponseDatabaseInfo databaseInfo;

    public static ListMetaDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDBResponse self = new ListMetaDBResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaDBResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaDBResponse setDatabaseInfo(ListMetaDBResponseDatabaseInfo databaseInfo) {
        this.databaseInfo = databaseInfo;
        return this;
    }
    public ListMetaDBResponseDatabaseInfo getDatabaseInfo() {
        return this.databaseInfo;
    }

    public static class ListMetaDBResponseDatabaseInfoDbList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("CreateTimeStamp")
        @Validation(required = true)
        public Long createTimeStamp;

        @NameInMap("ModifiedTimeStamp")
        @Validation(required = true)
        public Long modifiedTimeStamp;

        @NameInMap("UUID")
        @Validation(required = true)
        public String UUID;

        public static ListMetaDBResponseDatabaseInfoDbList build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDBResponseDatabaseInfoDbList self = new ListMetaDBResponseDatabaseInfoDbList();
            return TeaModel.build(map, self);
        }

        public ListMetaDBResponseDatabaseInfoDbList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetaDBResponseDatabaseInfoDbList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMetaDBResponseDatabaseInfoDbList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListMetaDBResponseDatabaseInfoDbList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMetaDBResponseDatabaseInfoDbList setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public ListMetaDBResponseDatabaseInfoDbList setModifiedTimeStamp(Long modifiedTimeStamp) {
            this.modifiedTimeStamp = modifiedTimeStamp;
            return this;
        }
        public Long getModifiedTimeStamp() {
            return this.modifiedTimeStamp;
        }

        public ListMetaDBResponseDatabaseInfoDbList setUUID(String UUID) {
            this.UUID = UUID;
            return this;
        }
        public String getUUID() {
            return this.UUID;
        }

    }

    public static class ListMetaDBResponseDatabaseInfo extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DbList")
        @Validation(required = true)
        public java.util.List<ListMetaDBResponseDatabaseInfoDbList> dbList;

        public static ListMetaDBResponseDatabaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDBResponseDatabaseInfo self = new ListMetaDBResponseDatabaseInfo();
            return TeaModel.build(map, self);
        }

        public ListMetaDBResponseDatabaseInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListMetaDBResponseDatabaseInfo setDbList(java.util.List<ListMetaDBResponseDatabaseInfoDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListMetaDBResponseDatabaseInfoDbList> getDbList() {
            return this.dbList;
        }

    }

}
