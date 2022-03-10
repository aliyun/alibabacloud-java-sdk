// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListNamespaceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("NamespaceStatus")
    public String namespaceStatus;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<ListNamespaceRequestTag> tag;

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

    public ListNamespaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListNamespaceRequest setTag(java.util.List<ListNamespaceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListNamespaceRequestTag> getTag() {
        return this.tag;
    }

    public static class ListNamespaceRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListNamespaceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceRequestTag self = new ListNamespaceRequestTag();
            return TeaModel.build(map, self);
        }

        public ListNamespaceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListNamespaceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
