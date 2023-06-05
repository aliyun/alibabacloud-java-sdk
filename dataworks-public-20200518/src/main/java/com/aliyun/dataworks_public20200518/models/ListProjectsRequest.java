// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tag key.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tag value.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListProjectsRequestTags> tags;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ListProjectsRequest setTags(java.util.List<ListProjectsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListProjectsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListProjectsRequestTags extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The results that are returned.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProjectsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsRequestTags self = new ListProjectsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListProjectsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProjectsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
