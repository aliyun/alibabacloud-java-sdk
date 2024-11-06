// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyRemoteADBDataSourceResponseBody extends TeaModel {
    /**
     * <p>Returns the successfully modified data sharing service data.</p>
     */
    @NameInMap("DataSourceItem")
    public ModifyRemoteADBDataSourceResponseBodyDataSourceItem dataSourceItem;

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

    public static ModifyRemoteADBDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRemoteADBDataSourceResponseBody self = new ModifyRemoteADBDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRemoteADBDataSourceResponseBody setDataSourceItem(ModifyRemoteADBDataSourceResponseBodyDataSourceItem dataSourceItem) {
        this.dataSourceItem = dataSourceItem;
        return this;
    }
    public ModifyRemoteADBDataSourceResponseBodyDataSourceItem getDataSourceItem() {
        return this.dataSourceItem;
    }

    public ModifyRemoteADBDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRemoteADBDataSourceResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public static class ModifyRemoteADBDataSourceResponseBodyDataSourceItem extends TeaModel {
        /**
         * <p>Data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>db1_gptest1_to_db2_gp-test2</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Local database name</p>
         * 
         * <strong>example:</strong>
         * <p>db1</p>
         */
        @NameInMap("LocalDatabase")
        public String localDatabase;

        /**
         * <p>Local instance name</p>
         * 
         * <strong>example:</strong>
         * <p>gp-test1</p>
         */
        @NameInMap("LocalInstanceName")
        public String localInstanceName;

        /**
         * <p>Manager user name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ManagerUserName")
        public String managerUserName;

        /**
         * <p>Region ID where the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Remote database name</p>
         * 
         * <strong>example:</strong>
         * <p>db2</p>
         */
        @NameInMap("RemoteDatabase")
        public String remoteDatabase;

        /**
         * <p>Remote instance name</p>
         * 
         * <strong>example:</strong>
         * <p>gp-test2</p>
         */
        @NameInMap("RemoteInstanceName")
        public String remoteInstanceName;

        /**
         * <p>Data source status</p>
         * 
         * <strong>example:</strong>
         * <p>creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>User name</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ModifyRemoteADBDataSourceResponseBodyDataSourceItem build(java.util.Map<String, ?> map) throws Exception {
            ModifyRemoteADBDataSourceResponseBodyDataSourceItem self = new ModifyRemoteADBDataSourceResponseBodyDataSourceItem();
            return TeaModel.build(map, self);
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setLocalDatabase(String localDatabase) {
            this.localDatabase = localDatabase;
            return this;
        }
        public String getLocalDatabase() {
            return this.localDatabase;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setLocalInstanceName(String localInstanceName) {
            this.localInstanceName = localInstanceName;
            return this;
        }
        public String getLocalInstanceName() {
            return this.localInstanceName;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setManagerUserName(String managerUserName) {
            this.managerUserName = managerUserName;
            return this;
        }
        public String getManagerUserName() {
            return this.managerUserName;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setRemoteDatabase(String remoteDatabase) {
            this.remoteDatabase = remoteDatabase;
            return this;
        }
        public String getRemoteDatabase() {
            return this.remoteDatabase;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setRemoteInstanceName(String remoteInstanceName) {
            this.remoteInstanceName = remoteInstanceName;
            return this;
        }
        public String getRemoteInstanceName() {
            return this.remoteInstanceName;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyRemoteADBDataSourceResponseBodyDataSourceItem setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
