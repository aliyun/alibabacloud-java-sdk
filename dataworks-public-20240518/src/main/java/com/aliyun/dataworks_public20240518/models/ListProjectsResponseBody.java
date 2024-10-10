// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListProjectsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>6D24AD9A-652F-59E2-AC1F-05029300F8A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setPagingInfo(ListProjectsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListProjectsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags extends TeaModel {
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

        public static ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags self = new ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProjectsResponseBodyPagingInfoProjects extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rg-acfmzbn7pti3zfa</p>
         */
        @NameInMap("AliyunResourceGroupId")
        public String aliyunResourceGroupId;

        @NameInMap("AliyunResourceTags")
        public java.util.List<ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags> aliyunResourceTags;

        @NameInMap("Description")
        public String description;

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

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>sora_finance</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>123532153125</p>
         */
        @NameInMap("Owner")
        public String owner;

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

        public static ListProjectsResponseBodyPagingInfoProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPagingInfoProjects self = new ListProjectsResponseBodyPagingInfoProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPagingInfoProjects setAliyunResourceGroupId(String aliyunResourceGroupId) {
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }
        public String getAliyunResourceGroupId() {
            return this.aliyunResourceGroupId;
        }

        public ListProjectsResponseBodyPagingInfoProjects setAliyunResourceTags(java.util.List<ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags> aliyunResourceTags) {
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyPagingInfoProjectsAliyunResourceTags> getAliyunResourceTags() {
            return this.aliyunResourceTags;
        }

        public ListProjectsResponseBodyPagingInfoProjects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyPagingInfoProjects setDevEnvironmentEnabled(Boolean devEnvironmentEnabled) {
            this.devEnvironmentEnabled = devEnvironmentEnabled;
            return this;
        }
        public Boolean getDevEnvironmentEnabled() {
            return this.devEnvironmentEnabled;
        }

        public ListProjectsResponseBodyPagingInfoProjects setDevRoleDisabled(Boolean devRoleDisabled) {
            this.devRoleDisabled = devRoleDisabled;
            return this;
        }
        public Boolean getDevRoleDisabled() {
            return this.devRoleDisabled;
        }

        public ListProjectsResponseBodyPagingInfoProjects setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListProjectsResponseBodyPagingInfoProjects setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectsResponseBodyPagingInfoProjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyPagingInfoProjects setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectsResponseBodyPagingInfoProjects setPaiTaskEnabled(Boolean paiTaskEnabled) {
            this.paiTaskEnabled = paiTaskEnabled;
            return this;
        }
        public Boolean getPaiTaskEnabled() {
            return this.paiTaskEnabled;
        }

        public ListProjectsResponseBodyPagingInfoProjects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListProjectsResponseBodyPagingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Projects")
        public java.util.List<ListProjectsResponseBodyPagingInfoProjects> projects;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPagingInfo self = new ListProjectsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectsResponseBodyPagingInfo setProjects(java.util.List<ListProjectsResponseBodyPagingInfoProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyPagingInfoProjects> getProjects() {
            return this.projects;
        }

        public ListProjectsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
