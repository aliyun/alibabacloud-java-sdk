// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListContainerAppsResponseBody extends TeaModel {
    @NameInMap("ContainerApps")
    public java.util.List<ListContainerAppsResponseBodyContainerApps> containerApps;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListContainerAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerAppsResponseBody self = new ListContainerAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerAppsResponseBody setContainerApps(java.util.List<ListContainerAppsResponseBodyContainerApps> containerApps) {
        this.containerApps = containerApps;
        return this;
    }
    public java.util.List<ListContainerAppsResponseBodyContainerApps> getContainerApps() {
        return this.containerApps;
    }

    public ListContainerAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListContainerAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContainerAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContainerAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListContainerAppsResponseBodyContainerApps extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Repository")
        public String repository;

        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListContainerAppsResponseBodyContainerApps build(java.util.Map<String, ?> map) throws Exception {
            ListContainerAppsResponseBodyContainerApps self = new ListContainerAppsResponseBodyContainerApps();
            return TeaModel.build(map, self);
        }

        public ListContainerAppsResponseBodyContainerApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListContainerAppsResponseBodyContainerApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListContainerAppsResponseBodyContainerApps setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListContainerAppsResponseBodyContainerApps setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public ListContainerAppsResponseBodyContainerApps setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListContainerAppsResponseBodyContainerApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContainerAppsResponseBodyContainerApps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
