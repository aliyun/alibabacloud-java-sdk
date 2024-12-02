// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeNamespacesRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>di-590843445844225</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("Tags")
    public java.util.List<DescribeNamespacesRequestTags> tags;

    public static DescribeNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesRequest self = new DescribeNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public DescribeNamespacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNamespacesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeNamespacesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeNamespacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNamespacesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeNamespacesRequest setTags(java.util.List<DescribeNamespacesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeNamespacesRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeNamespacesRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FLink</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNamespacesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesRequestTags self = new DescribeNamespacesRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNamespacesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
