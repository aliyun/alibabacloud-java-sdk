// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlersResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListCrawlersResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCrawlersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlersResponseBody self = new ListCrawlersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrawlersResponseBody setPagingInfo(ListCrawlersResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCrawlersResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCrawlersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrawlersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0 0 2 ? * *</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig self = new ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig();
            return TeaModel.build(map, self);
        }

        public ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCrawlersResponseBodyPagingInfoCrawlers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastRunStatus")
        public String lastRunStatus;

        /**
         * <strong>example:</strong>
         * <p>starrocks:example-instance</p>
         */
        @NameInMap("MetaEntityId")
        public String metaEntityId;

        /**
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>example_crawler</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>Serverless_res_group_1234567890123456_1234567890</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ScheduleConfig")
        public ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig scheduleConfig;

        /**
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>starrocks</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCrawlersResponseBodyPagingInfoCrawlers build(java.util.Map<String, ?> map) throws Exception {
            ListCrawlersResponseBodyPagingInfoCrawlers self = new ListCrawlersResponseBodyPagingInfoCrawlers();
            return TeaModel.build(map, self);
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setMetaEntityId(String metaEntityId) {
            this.metaEntityId = metaEntityId;
            return this;
        }
        public String getMetaEntityId() {
            return this.metaEntityId;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setScheduleConfig(ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public ListCrawlersResponseBodyPagingInfoCrawlersScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListCrawlersResponseBodyPagingInfoCrawlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCrawlersResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Crawlers")
        public java.util.List<ListCrawlersResponseBodyPagingInfoCrawlers> crawlers;

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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCrawlersResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCrawlersResponseBodyPagingInfo self = new ListCrawlersResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCrawlersResponseBodyPagingInfo setCrawlers(java.util.List<ListCrawlersResponseBodyPagingInfoCrawlers> crawlers) {
            this.crawlers = crawlers;
            return this;
        }
        public java.util.List<ListCrawlersResponseBodyPagingInfoCrawlers> getCrawlers() {
            return this.crawlers;
        }

        public ListCrawlersResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCrawlersResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCrawlersResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
