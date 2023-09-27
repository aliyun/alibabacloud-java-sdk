// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListNamespaceRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("NamespaceStatus")
    public String namespaceStatus;

    /**
     * <p>The list of namespaces.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceRequest self = new ListNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public ListNamespaceRequest setNamespaceStatus(String namespaceStatus) {
        this.namespaceStatus = namespaceStatus;
        return this;
    }
    public String getNamespaceStatus() {
        return this.namespaceStatus;
    }

    public ListNamespaceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListNamespaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
