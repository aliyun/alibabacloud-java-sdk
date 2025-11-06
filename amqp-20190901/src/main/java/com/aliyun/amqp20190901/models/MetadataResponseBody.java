// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class MetadataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public MetadataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MetadataResponseBody self = new MetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public MetadataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MetadataResponseBody setData(MetadataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MetadataResponseBodyData getData() {
        return this.data;
    }

    public MetadataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MetadataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MetadataResponseBodyData extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("HasPretendPermission")
        public Boolean hasPretendPermission;

        @NameInMap("InternalEndpoint")
        public String internalEndpoint;

        @NameInMap("PretendUserId")
        public String pretendUserId;

        @NameInMap("UserStatus")
        public Integer userStatus;

        public static MetadataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MetadataResponseBodyData self = new MetadataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MetadataResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public MetadataResponseBodyData setHasPretendPermission(Boolean hasPretendPermission) {
            this.hasPretendPermission = hasPretendPermission;
            return this;
        }
        public Boolean getHasPretendPermission() {
            return this.hasPretendPermission;
        }

        public MetadataResponseBodyData setInternalEndpoint(String internalEndpoint) {
            this.internalEndpoint = internalEndpoint;
            return this;
        }
        public String getInternalEndpoint() {
            return this.internalEndpoint;
        }

        public MetadataResponseBodyData setPretendUserId(String pretendUserId) {
            this.pretendUserId = pretendUserId;
            return this;
        }
        public String getPretendUserId() {
            return this.pretendUserId;
        }

        public MetadataResponseBodyData setUserStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public Integer getUserStatus() {
            return this.userStatus;
        }

    }

}
