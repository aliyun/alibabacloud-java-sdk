// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListEmrHiveDatabasesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListEmrHiveDatabasesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEmrHiveDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmrHiveDatabasesResponseBody self = new ListEmrHiveDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmrHiveDatabasesResponseBody setData(java.util.List<ListEmrHiveDatabasesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEmrHiveDatabasesResponseBodyData> getData() {
        return this.data;
    }

    public ListEmrHiveDatabasesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEmrHiveDatabasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListEmrHiveDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEmrHiveDatabasesResponseBodyData extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerType")
        public String ownerType;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListEmrHiveDatabasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEmrHiveDatabasesResponseBodyData self = new ListEmrHiveDatabasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEmrHiveDatabasesResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListEmrHiveDatabasesResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListEmrHiveDatabasesResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListEmrHiveDatabasesResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListEmrHiveDatabasesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEmrHiveDatabasesResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListEmrHiveDatabasesResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListEmrHiveDatabasesResponseBodyData setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public ListEmrHiveDatabasesResponseBodyData setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListEmrHiveDatabasesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListEmrHiveDatabasesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEmrHiveDatabasesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
