// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListContainerAppsResponseBody extends TeaModel {
    /**
     * <p>The array of containerized applications.</p>
     */
    @NameInMap("ContainerApps")
    public ListContainerAppsResponseBodyContainerApps containerApps;

    /**
     * <p>The page number returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of containerized applications.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListContainerAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerAppsResponseBody self = new ListContainerAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerAppsResponseBody setContainerApps(ListContainerAppsResponseBodyContainerApps containerApps) {
        this.containerApps = containerApps;
        return this;
    }
    public ListContainerAppsResponseBodyContainerApps getContainerApps() {
        return this.containerApps;
    }

    public ListContainerAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListContainerAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListContainerAppsResponseBodyContainerAppsContainerApps extends TeaModel {
        /**
         * <p>The time at which the containerized application was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the containerized application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the container application.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The tags of the image.</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The name of the containerized application.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the repository.</p>
         */
        @NameInMap("Repository")
        public String repository;

        /**
         * <p>The type of the container. Set the value to singularity.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListContainerAppsResponseBodyContainerAppsContainerApps build(java.util.Map<String, ?> map) throws Exception {
            ListContainerAppsResponseBodyContainerAppsContainerApps self = new ListContainerAppsResponseBodyContainerAppsContainerApps();
            return TeaModel.build(map, self);
        }

        public ListContainerAppsResponseBodyContainerAppsContainerApps setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListContainerAppsResponseBodyContainerAppsContainerApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListContainerAppsResponseBodyContainerAppsContainerApps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListContainerAppsResponseBodyContainerAppsContainerApps setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public ListContainerAppsResponseBodyContainerAppsContainerApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContainerAppsResponseBodyContainerAppsContainerApps setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public ListContainerAppsResponseBodyContainerAppsContainerApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListContainerAppsResponseBodyContainerApps extends TeaModel {
        @NameInMap("ContainerApps")
        public java.util.List<ListContainerAppsResponseBodyContainerAppsContainerApps> containerApps;

        public static ListContainerAppsResponseBodyContainerApps build(java.util.Map<String, ?> map) throws Exception {
            ListContainerAppsResponseBodyContainerApps self = new ListContainerAppsResponseBodyContainerApps();
            return TeaModel.build(map, self);
        }

        public ListContainerAppsResponseBodyContainerApps setContainerApps(java.util.List<ListContainerAppsResponseBodyContainerAppsContainerApps> containerApps) {
            this.containerApps = containerApps;
            return this;
        }
        public java.util.List<ListContainerAppsResponseBodyContainerAppsContainerApps> getContainerApps() {
            return this.containerApps;
        }

    }

}
