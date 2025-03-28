// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPersistentAppInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PersistentAppInstanceModels")
    public java.util.List<ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels> persistentAppInstanceModels;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPersistentAppInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersistentAppInstancesResponseBody self = new ListPersistentAppInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersistentAppInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersistentAppInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersistentAppInstancesResponseBody setPersistentAppInstanceModels(java.util.List<ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels> persistentAppInstanceModels) {
        this.persistentAppInstanceModels = persistentAppInstanceModels;
        return this;
    }
    public java.util.List<ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels> getPersistentAppInstanceModels() {
        return this.persistentAppInstanceModels;
    }

    public ListPersistentAppInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersistentAppInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aig-0bxls9m9arax6****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <strong>example:</strong>
         * <p>ai-azn3kmwruh1vl****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <strong>example:</strong>
         * <p>p-0cc7s3mw2fg4j****</p>
         */
        @NameInMap("AppInstancePersistentId")
        public String appInstancePersistentId;

        /**
         * <strong>example:</strong>
         * <p>test-persistent-name</p>
         */
        @NameInMap("AppInstancePersistentName")
        public String appInstancePersistentName;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AppInstancePersistentStatus")
        public String appInstancePersistentStatus;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AppInstanceStatus")
        public String appInstanceStatus;

        @NameInMap("AuthorizedUsers")
        public java.util.List<String> authorizedUsers;

        /**
         * <strong>example:</strong>
         * <p>2025-03-13T03:22:18.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        public static ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels self = new ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels();
            return TeaModel.build(map, self);
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setAppInstancePersistentId(String appInstancePersistentId) {
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }
        public String getAppInstancePersistentId() {
            return this.appInstancePersistentId;
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setAppInstancePersistentName(String appInstancePersistentName) {
            this.appInstancePersistentName = appInstancePersistentName;
            return this;
        }
        public String getAppInstancePersistentName() {
            return this.appInstancePersistentName;
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setAppInstancePersistentStatus(String appInstancePersistentStatus) {
            this.appInstancePersistentStatus = appInstancePersistentStatus;
            return this;
        }
        public String getAppInstancePersistentStatus() {
            return this.appInstancePersistentStatus;
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setAppInstanceStatus(String appInstanceStatus) {
            this.appInstanceStatus = appInstanceStatus;
            return this;
        }
        public String getAppInstanceStatus() {
            return this.appInstanceStatus;
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setAuthorizedUsers(java.util.List<String> authorizedUsers) {
            this.authorizedUsers = authorizedUsers;
            return this;
        }
        public java.util.List<String> getAuthorizedUsers() {
            return this.authorizedUsers;
        }

        public ListPersistentAppInstancesResponseBodyPersistentAppInstanceModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

    }

}
