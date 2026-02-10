// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListRemoteADBDataSourcesResponseBody extends TeaModel {
    @NameInMap("DataSourceItems")
    public ListRemoteADBDataSourcesResponseBodyDataSourceItems dataSourceItems;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e9d60eb1-e90d-4bc6-a470-c8b767460858</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90000</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static ListRemoteADBDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemoteADBDataSourcesResponseBody self = new ListRemoteADBDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemoteADBDataSourcesResponseBody setDataSourceItems(ListRemoteADBDataSourcesResponseBodyDataSourceItems dataSourceItems) {
        this.dataSourceItems = dataSourceItems;
        return this;
    }
    public ListRemoteADBDataSourcesResponseBodyDataSourceItems getDataSourceItems() {
        return this.dataSourceItems;
    }

    public ListRemoteADBDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRemoteADBDataSourcesResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public static class ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources extends TeaModel {
        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LocalDatabase")
        public String localDatabase;

        @NameInMap("LocalInstanceName")
        public String localInstanceName;

        @NameInMap("ManagerUserName")
        public String managerUserName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemoteDatabase")
        public String remoteDatabase;

        @NameInMap("RemoteInstanceName")
        public String remoteInstanceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserName")
        public String userName;

        public static ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources self = new ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources();
            return TeaModel.build(map, self);
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setLocalDatabase(String localDatabase) {
            this.localDatabase = localDatabase;
            return this;
        }
        public String getLocalDatabase() {
            return this.localDatabase;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setLocalInstanceName(String localInstanceName) {
            this.localInstanceName = localInstanceName;
            return this;
        }
        public String getLocalInstanceName() {
            return this.localInstanceName;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setManagerUserName(String managerUserName) {
            this.managerUserName = managerUserName;
            return this;
        }
        public String getManagerUserName() {
            return this.managerUserName;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setRemoteDatabase(String remoteDatabase) {
            this.remoteDatabase = remoteDatabase;
            return this;
        }
        public String getRemoteDatabase() {
            return this.remoteDatabase;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setRemoteInstanceName(String remoteInstanceName) {
            this.remoteInstanceName = remoteInstanceName;
            return this;
        }
        public String getRemoteInstanceName() {
            return this.remoteInstanceName;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListRemoteADBDataSourcesResponseBodyDataSourceItems extends TeaModel {
        @NameInMap("RemoteDataSources")
        public java.util.List<ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources> remoteDataSources;

        public static ListRemoteADBDataSourcesResponseBodyDataSourceItems build(java.util.Map<String, ?> map) throws Exception {
            ListRemoteADBDataSourcesResponseBodyDataSourceItems self = new ListRemoteADBDataSourcesResponseBodyDataSourceItems();
            return TeaModel.build(map, self);
        }

        public ListRemoteADBDataSourcesResponseBodyDataSourceItems setRemoteDataSources(java.util.List<ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources> remoteDataSources) {
            this.remoteDataSources = remoteDataSources;
            return this;
        }
        public java.util.List<ListRemoteADBDataSourcesResponseBodyDataSourceItemsRemoteDataSources> getRemoteDataSources() {
            return this.remoteDataSources;
        }

    }

}
