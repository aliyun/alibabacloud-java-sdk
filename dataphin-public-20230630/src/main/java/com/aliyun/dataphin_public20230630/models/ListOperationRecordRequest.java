// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListOperationRecordRequest extends TeaModel {
    /**
     * <p>The query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListCommand")
    public ListOperationRecordRequestListCommand listCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListOperationRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationRecordRequest self = new ListOperationRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationRecordRequest setListCommand(ListOperationRecordRequestListCommand listCommand) {
        this.listCommand = listCommand;
        return this;
    }
    public ListOperationRecordRequestListCommand getListCommand() {
        return this.listCommand;
    }

    public ListOperationRecordRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListOperationRecordRequestListCommand extends TeaModel {
        /**
         * <p>The end of the start time range. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-31 23:59:59</p>
         */
        @NameInMap("BeginTimeEnd")
        public String beginTimeEnd;

        /**
         * <p>The beginning of the start time range. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("BeginTimeStart")
        public String beginTimeStart;

        /**
         * <p>The keyword for code search.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("CodeContent")
        public String codeContent;

        /**
         * <p>The list of code types.</p>
         */
        @NameInMap("CodeType")
        public java.util.List<Integer> codeType;

        /**
         * <p>The list of duration ranges.</p>
         */
        @NameInMap("Duration")
        public java.util.List<Integer> duration;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试脚本</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The list of object types.</p>
         */
        @NameInMap("ObjectType")
        public java.util.List<String> objectType;

        /**
         * <p>The page number. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The sort type. Valid values: 0 (start time ascending), 1 (start time descending), 2 (object name).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SortType")
        public Integer sortType;

        /**
         * <p>The list of task statuses.</p>
         */
        @NameInMap("Status")
        public java.util.List<Integer> status;

        /**
         * <p>The list of executor IDs.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static ListOperationRecordRequestListCommand build(java.util.Map<String, ?> map) throws Exception {
            ListOperationRecordRequestListCommand self = new ListOperationRecordRequestListCommand();
            return TeaModel.build(map, self);
        }

        public ListOperationRecordRequestListCommand setBeginTimeEnd(String beginTimeEnd) {
            this.beginTimeEnd = beginTimeEnd;
            return this;
        }
        public String getBeginTimeEnd() {
            return this.beginTimeEnd;
        }

        public ListOperationRecordRequestListCommand setBeginTimeStart(String beginTimeStart) {
            this.beginTimeStart = beginTimeStart;
            return this;
        }
        public String getBeginTimeStart() {
            return this.beginTimeStart;
        }

        public ListOperationRecordRequestListCommand setCodeContent(String codeContent) {
            this.codeContent = codeContent;
            return this;
        }
        public String getCodeContent() {
            return this.codeContent;
        }

        public ListOperationRecordRequestListCommand setCodeType(java.util.List<Integer> codeType) {
            this.codeType = codeType;
            return this;
        }
        public java.util.List<Integer> getCodeType() {
            return this.codeType;
        }

        public ListOperationRecordRequestListCommand setDuration(java.util.List<Integer> duration) {
            this.duration = duration;
            return this;
        }
        public java.util.List<Integer> getDuration() {
            return this.duration;
        }

        public ListOperationRecordRequestListCommand setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListOperationRecordRequestListCommand setObjectType(java.util.List<String> objectType) {
            this.objectType = objectType;
            return this;
        }
        public java.util.List<String> getObjectType() {
            return this.objectType;
        }

        public ListOperationRecordRequestListCommand setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListOperationRecordRequestListCommand setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOperationRecordRequestListCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListOperationRecordRequestListCommand setSortType(Integer sortType) {
            this.sortType = sortType;
            return this;
        }
        public Integer getSortType() {
            return this.sortType;
        }

        public ListOperationRecordRequestListCommand setStatus(java.util.List<Integer> status) {
            this.status = status;
            return this;
        }
        public java.util.List<Integer> getStatus() {
            return this.status;
        }

        public ListOperationRecordRequestListCommand setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
