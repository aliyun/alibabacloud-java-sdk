// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("serviceConnections")
    public java.util.List<ListServiceConnectionsResponseBodyServiceConnections> serviceConnections;

    @NameInMap("success")
    public Boolean success;

    public static ListServiceConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsResponseBody self = new ListServiceConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListServiceConnectionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListServiceConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceConnectionsResponseBody setServiceConnections(java.util.List<ListServiceConnectionsResponseBodyServiceConnections> serviceConnections) {
        this.serviceConnections = serviceConnections;
        return this;
    }
    public java.util.List<ListServiceConnectionsResponseBodyServiceConnections> getServiceConnections() {
        return this.serviceConnections;
    }

    public ListServiceConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServiceConnectionsResponseBodyServiceConnections extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("ownerAccountId")
        public Long ownerAccountId;

        @NameInMap("type")
        public String type;

        @NameInMap("uuid")
        public String uuid;

        public static ListServiceConnectionsResponseBodyServiceConnections build(java.util.Map<String, ?> map) throws Exception {
            ListServiceConnectionsResponseBodyServiceConnections self = new ListServiceConnectionsResponseBodyServiceConnections();
            return TeaModel.build(map, self);
        }

        public ListServiceConnectionsResponseBodyServiceConnections setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
