// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    /**
     * <p>The request context.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public ListPipelinesRequestContext context;

    /**
     * <p>The query parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListCommand")
    public ListPipelinesRequestListCommand listCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesRequest self = new ListPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesRequest setContext(ListPipelinesRequestContext context) {
        this.context = context;
        return this;
    }
    public ListPipelinesRequestContext getContext() {
        return this.context;
    }

    public ListPipelinesRequest setListCommand(ListPipelinesRequestListCommand listCommand) {
        this.listCommand = listCommand;
        return this;
    }
    public ListPipelinesRequestListCommand getListCommand() {
        return this.listCommand;
    }

    public ListPipelinesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListPipelinesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListPipelinesRequestContext extends TeaModel {
        /**
         * <p>The environment identifier. Valid values: DEV: development environment. PROD: production environment. Default value: PROD.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7128268454335680</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ListPipelinesRequestContext build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesRequestContext self = new ListPipelinesRequestContext();
            return TeaModel.build(map, self);
        }

        public ListPipelinesRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListPipelinesRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListPipelinesRequestListCommand extends TeaModel {
        /**
         * <p>The user IDs of the creators used for filtering. If this parameter is left empty, no filtering is performed. If multiple IDs are specified, they are evaluated by using the OR operator.</p>
         */
        @NameInMap("CreatorList")
        public java.util.List<String> creatorList;

        /**
         * <p>The user IDs of the development owners used for filtering. If this parameter is left empty, no filtering is performed. If multiple IDs are specified, they are evaluated by using the OR operator.</p>
         */
        @NameInMap("DevelopOwnerList")
        public java.util.List<String> developOwnerList;

        /**
         * <p>The full paths of the directories to query. If this parameter is left empty, the root directory is queried.</p>
         */
        @NameInMap("Directories")
        public java.util.List<String> directories;

        /**
         * <p>Specifies whether an exact match is performed on the node name. Default value: false.</p>
         */
        @NameInMap("ExactMatch")
        public Boolean exactMatch;

        /**
         * <p>The keywords used to filter task names. This parameter is optional. If this parameter is left empty, tasks are not filtered by name. If exact match is enabled, this parameter specifies a list of full names. If fuzzy match is used, this parameter specifies a list of keywords. If multiple keywords are specified, they are evaluated by using the OR operator.</p>
         */
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <p>The cursor for the next page. Leave this parameter empty for the first page. For subsequent pages, pass the NextCursor value returned from the previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NextCursor")
        public Long nextCursor;

        /**
         * <p>The user IDs of the O&amp;M owners used for filtering. If this parameter is left empty, no filtering is performed. If multiple IDs are specified, they are evaluated by using the OR operator.</p>
         */
        @NameInMap("OpsOwnerList")
        public java.util.List<String> opsOwnerList;

        /**
         * <p>The page number. Default value: 1. The value starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The task types. Default value: [0]. Valid values: 0: offline integration. 1: real-time integration. 13: data ingestion. 14: offline unstructured workflow. 15: real-time unstructured workflow. 16: online unstructured workflow. If you pass null or an empty list, the default value [0] is used.</p>
         */
        @NameInMap("PipelineTypeList")
        public java.util.List<Integer> pipelineTypeList;

        /**
         * <p>Specifies whether to recursively query subdirectories. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Recursive")
        public Boolean recursive;

        /**
         * <p>The schedule types used for filtering. If this parameter is left empty, no filtering is performed. Valid values: 1: periodic scheduling. 3: manual scheduling. 5: real-time scheduling. 7: online workflow.</p>
         */
        @NameInMap("ScheduleTypeList")
        public java.util.List<Integer> scheduleTypeList;

        /**
         * <p>The submit statuses used for filtering. If this parameter is left empty, no filtering is performed. Valid values: DRAFT: draft. SUBMITTING: submitting. SUBMITTED: submitted. PUBLISHED: published.</p>
         */
        @NameInMap("SubmitStatusList")
        public java.util.List<String> submitStatusList;

        /**
         * <p>The tag names used for filtering. If this parameter is left empty, no filtering is performed. If multiple names are specified, they are evaluated by using the OR operator.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1233</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPipelinesRequestListCommand build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesRequestListCommand self = new ListPipelinesRequestListCommand();
            return TeaModel.build(map, self);
        }

        public ListPipelinesRequestListCommand setCreatorList(java.util.List<String> creatorList) {
            this.creatorList = creatorList;
            return this;
        }
        public java.util.List<String> getCreatorList() {
            return this.creatorList;
        }

        public ListPipelinesRequestListCommand setDevelopOwnerList(java.util.List<String> developOwnerList) {
            this.developOwnerList = developOwnerList;
            return this;
        }
        public java.util.List<String> getDevelopOwnerList() {
            return this.developOwnerList;
        }

        public ListPipelinesRequestListCommand setDirectories(java.util.List<String> directories) {
            this.directories = directories;
            return this;
        }
        public java.util.List<String> getDirectories() {
            return this.directories;
        }

        public ListPipelinesRequestListCommand setExactMatch(Boolean exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }
        public Boolean getExactMatch() {
            return this.exactMatch;
        }

        public ListPipelinesRequestListCommand setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public ListPipelinesRequestListCommand setNextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }
        public Long getNextCursor() {
            return this.nextCursor;
        }

        public ListPipelinesRequestListCommand setOpsOwnerList(java.util.List<String> opsOwnerList) {
            this.opsOwnerList = opsOwnerList;
            return this;
        }
        public java.util.List<String> getOpsOwnerList() {
            return this.opsOwnerList;
        }

        public ListPipelinesRequestListCommand setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListPipelinesRequestListCommand setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPipelinesRequestListCommand setPipelineTypeList(java.util.List<Integer> pipelineTypeList) {
            this.pipelineTypeList = pipelineTypeList;
            return this;
        }
        public java.util.List<Integer> getPipelineTypeList() {
            return this.pipelineTypeList;
        }

        public ListPipelinesRequestListCommand setRecursive(Boolean recursive) {
            this.recursive = recursive;
            return this;
        }
        public Boolean getRecursive() {
            return this.recursive;
        }

        public ListPipelinesRequestListCommand setScheduleTypeList(java.util.List<Integer> scheduleTypeList) {
            this.scheduleTypeList = scheduleTypeList;
            return this;
        }
        public java.util.List<Integer> getScheduleTypeList() {
            return this.scheduleTypeList;
        }

        public ListPipelinesRequestListCommand setSubmitStatusList(java.util.List<String> submitStatusList) {
            this.submitStatusList = submitStatusList;
            return this;
        }
        public java.util.List<String> getSubmitStatusList() {
            return this.submitStatusList;
        }

        public ListPipelinesRequestListCommand setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public ListPipelinesRequestListCommand setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
