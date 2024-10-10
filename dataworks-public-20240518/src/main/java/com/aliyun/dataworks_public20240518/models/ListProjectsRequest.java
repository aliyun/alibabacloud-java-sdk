// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rg-acfmzbn7pti3zff</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    @NameInMap("AliyunResourceTags")
    public java.util.List<ListProjectsRequestAliyunResourceTags> aliyunResourceTags;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DevEnvironmentEnabled")
    public Boolean devEnvironmentEnabled;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DevRoleDisabled")
    public Boolean devRoleDisabled;

    @NameInMap("Ids")
    public java.util.List<Long> ids;

    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PaiTaskEnabled")
    public Boolean paiTaskEnabled;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setAliyunResourceGroupId(String aliyunResourceGroupId) {
        this.aliyunResourceGroupId = aliyunResourceGroupId;
        return this;
    }
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    public ListProjectsRequest setAliyunResourceTags(java.util.List<ListProjectsRequestAliyunResourceTags> aliyunResourceTags) {
        this.aliyunResourceTags = aliyunResourceTags;
        return this;
    }
    public java.util.List<ListProjectsRequestAliyunResourceTags> getAliyunResourceTags() {
        return this.aliyunResourceTags;
    }

    public ListProjectsRequest setDevEnvironmentEnabled(Boolean devEnvironmentEnabled) {
        this.devEnvironmentEnabled = devEnvironmentEnabled;
        return this;
    }
    public Boolean getDevEnvironmentEnabled() {
        return this.devEnvironmentEnabled;
    }

    public ListProjectsRequest setDevRoleDisabled(Boolean devRoleDisabled) {
        this.devRoleDisabled = devRoleDisabled;
        return this;
    }
    public Boolean getDevRoleDisabled() {
        return this.devRoleDisabled;
    }

    public ListProjectsRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public ListProjectsRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
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

    public ListProjectsRequest setPaiTaskEnabled(Boolean paiTaskEnabled) {
        this.paiTaskEnabled = paiTaskEnabled;
        return this;
    }
    public Boolean getPaiTaskEnabled() {
        return this.paiTaskEnabled;
    }

    public ListProjectsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListProjectsRequestAliyunResourceTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>batch</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>blue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProjectsRequestAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsRequestAliyunResourceTags self = new ListProjectsRequestAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public ListProjectsRequestAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProjectsRequestAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
