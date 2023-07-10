// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Namespaces")
    public ListNamespacesResponseBodyNamespaces namespaces;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static ListNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponseBody self = new ListNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListNamespacesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNamespacesResponseBody setNamespaces(ListNamespacesResponseBodyNamespaces namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public ListNamespacesResponseBodyNamespaces getNamespaces() {
        return this.namespaces;
    }

    public ListNamespacesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespacesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListNamespacesResponseBodyNamespaces extends TeaModel {
        @NameInMap("Namespace")
        public java.util.List<String> namespace;

        public static ListNamespacesResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyNamespaces self = new ListNamespacesResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyNamespaces setNamespace(java.util.List<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public java.util.List<String> getNamespace() {
            return this.namespace;
        }

    }

}
