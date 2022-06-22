// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetNamespaceListByUserIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetNamespaceListByUserIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetNamespaceListByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceListByUserIdResponseBody self = new GetNamespaceListByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNamespaceListByUserIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNamespaceListByUserIdResponseBody setData(java.util.List<GetNamespaceListByUserIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNamespaceListByUserIdResponseBodyData> getData() {
        return this.data;
    }

    public GetNamespaceListByUserIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNamespaceListByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNamespaceListByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNamespaceListByUserIdResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("regionId")
        public String regionId;

        public static GetNamespaceListByUserIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNamespaceListByUserIdResponseBodyData self = new GetNamespaceListByUserIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNamespaceListByUserIdResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNamespaceListByUserIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNamespaceListByUserIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNamespaceListByUserIdResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetNamespaceListByUserIdResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
