// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 服务连接
    @NameInMap("serviceConnections")
    public java.util.List<ListServiceConnectionsResponseBodyServiceConnections> serviceConnections;

    public static ListServiceConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsResponseBody self = new ListServiceConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceConnectionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListServiceConnectionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListServiceConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListServiceConnectionsResponseBody setServiceConnections(java.util.List<ListServiceConnectionsResponseBodyServiceConnections> serviceConnections) {
        this.serviceConnections = serviceConnections;
        return this;
    }
    public java.util.List<ListServiceConnectionsResponseBodyServiceConnections> getServiceConnections() {
        return this.serviceConnections;
    }

    public static class ListServiceConnectionsResponseBodyServiceConnections extends TeaModel {
        // 拥有者阿里云账号id
        @NameInMap("ownerAccountId")
        public Long ownerAccountId;

        // 服务连接名称
        @NameInMap("name")
        public String name;

        // 服务连接Id
        @NameInMap("id")
        public Long id;

        // 服务连接类型
        @NameInMap("type")
        public String type;

        // 创建时间
        @NameInMap("createTime")
        public Long createTime;

        public static ListServiceConnectionsResponseBodyServiceConnections build(java.util.Map<String, ?> map) throws Exception {
            ListServiceConnectionsResponseBodyServiceConnections self = new ListServiceConnectionsResponseBodyServiceConnections();
            return TeaModel.build(map, self);
        }

        public ListServiceConnectionsResponseBodyServiceConnections setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListServiceConnectionsResponseBodyServiceConnections setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

}
