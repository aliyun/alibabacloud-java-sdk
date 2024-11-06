// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateRemoteADBDataSourceResponseBody extends TeaModel {
    /**
     * <p>Returns the successfully added data sharing service data.</p>
     */
    @NameInMap("DataSourceItem")
    public CreateRemoteADBDataSourceResponseBodyDataSourceItem dataSourceItem;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e9d60eb1-e90d-4bc6-a470-c8b767460858</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Workflow task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90000</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static CreateRemoteADBDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRemoteADBDataSourceResponseBody self = new CreateRemoteADBDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRemoteADBDataSourceResponseBody setDataSourceItem(CreateRemoteADBDataSourceResponseBodyDataSourceItem dataSourceItem) {
        this.dataSourceItem = dataSourceItem;
        return this;
    }
    public CreateRemoteADBDataSourceResponseBodyDataSourceItem getDataSourceItem() {
        return this.dataSourceItem;
    }

    public CreateRemoteADBDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRemoteADBDataSourceResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public static class CreateRemoteADBDataSourceResponseBodyDataSourceItem extends TeaModel {
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
         * <p>userName</p>
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
         * <p>Management account user name</p>
         * 
         * <strong>example:</strong>
         * <p>manager_user</p>
         */
        @NameInMap("ManagerUserName")
        public String managerUserName;

        /**
         * <p>Region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> API to view available region IDs.</p>
         * </blockquote>
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
         * <p>Synchronization status</p>
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

        public static CreateRemoteADBDataSourceResponseBodyDataSourceItem build(java.util.Map<String, ?> map) throws Exception {
            CreateRemoteADBDataSourceResponseBodyDataSourceItem self = new CreateRemoteADBDataSourceResponseBodyDataSourceItem();
            return TeaModel.build(map, self);
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setLocalDatabase(String localDatabase) {
            this.localDatabase = localDatabase;
            return this;
        }
        public String getLocalDatabase() {
            return this.localDatabase;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setLocalInstanceName(String localInstanceName) {
            this.localInstanceName = localInstanceName;
            return this;
        }
        public String getLocalInstanceName() {
            return this.localInstanceName;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setManagerUserName(String managerUserName) {
            this.managerUserName = managerUserName;
            return this;
        }
        public String getManagerUserName() {
            return this.managerUserName;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setRemoteDatabase(String remoteDatabase) {
            this.remoteDatabase = remoteDatabase;
            return this;
        }
        public String getRemoteDatabase() {
            return this.remoteDatabase;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setRemoteInstanceName(String remoteInstanceName) {
            this.remoteInstanceName = remoteInstanceName;
            return this;
        }
        public String getRemoteInstanceName() {
            return this.remoteInstanceName;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateRemoteADBDataSourceResponseBodyDataSourceItem setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
