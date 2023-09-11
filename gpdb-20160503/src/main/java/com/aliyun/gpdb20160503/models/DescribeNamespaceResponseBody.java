// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The queried namespace.</p>
     */
    @NameInMap("NamespaceInfo")
    public java.util.Map<String, String> namespaceInfo;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **success**</p>
     * <p>*   **fail**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResponseBody self = new DescribeNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeNamespaceResponseBody setNamespaceInfo(java.util.Map<String, String> namespaceInfo) {
        this.namespaceInfo = namespaceInfo;
        return this;
    }
    public java.util.Map<String, String> getNamespaceInfo() {
        return this.namespaceInfo;
    }

    public DescribeNamespaceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
