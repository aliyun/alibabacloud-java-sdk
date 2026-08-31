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
     * <p>The user ID of the operator.</p>
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
         * <p>The environment identifier. Valid values:</p>
         * <ul>
         * <li>DEV: development environment.</li>
         * <li>PROD: production environment.</li>
         * </ul>
         * <p>Default value: PROD.</p>
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
         * <p>The list of creator user IDs for filtering. If left empty, no filtering is applied. Multiple values are evaluated with an OR relationship.</p>
         */
        @NameInMap("CreatorList")
        public java.util.List<String> creatorList;

        /**
         * <p>The list of development owner user IDs for filtering. If left empty, no filtering is applied. Multiple values are evaluated with an OR relationship.</p>
         */
        @NameInMap("DevelopOwnerList")
        public java.util.List<String> developOwnerList;

        /**
         * <p>The list of full folder paths to query. If left empty, the root folder is queried.</p>
         */
        @NameInMap("Directories")
        public java.util.List<String> directories;

        /**
         * <p>Specifies whether to use exact match for node names. Default value: false.</p>
         */
        @NameInMap("ExactMatch")
        public Boolean exactMatch;

        /**
         * <p>The list of node name keywords. This parameter is optional. If left empty, no filtering by name is applied. For exact match, specify full names. For fuzzy match, specify keywords. Multiple values are evaluated with an OR relationship.</p>
         */
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <p>The cursor-based pagination parameter (an opaque cursor that callers do not need to interpret). This parameter is optional. If not specified, the request is treated as a first-page request and returns the actual total count. If specified, the request is treated as a subsequent-page request. Pass the NextCursor value returned from the previous page as-is. The SQL layer automatically filters by incrementing ID to query the next page without re-querying the total count. No OFFSET is used throughout, which avoids performance degradation in deep paging scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NextCursor")
        public Long nextCursor;

        /**
         * <p>The list of O&amp;M owner user IDs for filtering. If left empty, no filtering is applied. Multiple values are evaluated with an OR relationship.</p>
         */
        @NameInMap("OpsOwnerList")
        public java.util.List<String> opsOwnerList;

        /**
         * <p>The page number. Default value: 1. Pages start from 1.</p>
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
         * <p>The list of node types. Default value: [0] (batch integration). Valid values:</p>
         * <ul>
         * <li>0: batch integration.</li>
         * <li>1: real-time integration.</li>
         * <li>13: data aggregation.</li>
         * <li>14: offline unstructured workflow.</li>
         * <li>15: real-time unstructured workflow.</li>
         * <li>16: online unstructured workflow.</li>
         * </ul>
         * <p>If null or an empty list is passed, the default value [0] is used.</p>
         */
        @NameInMap("PipelineTypeList")
        public java.util.List<Integer> pipelineTypeList;

        /**
         * <p>Specifies whether to recursively query subfolders. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Recursive")
        public Boolean recursive;

        /**
         * <p>The list of scheduling types for filtering. If left empty, no filtering is applied. Valid values:</p>
         * <ul>
         * <li>1: periodic scheduling.</li>
         * <li>3: manual scheduling.</li>
         * <li>5: real-time scheduling.</li>
         * <li>7: online workflow.</li>
         * </ul>
         */
        @NameInMap("ScheduleTypeList")
        public java.util.List<Integer> scheduleTypeList;

        /**
         * <p>The list of submit statuses for filtering. If left empty, no filtering is applied. Valid values:</p>
         * <ul>
         * <li>DRAFT: draft.</li>
         * <li>SUBMITTING: submitting.</li>
         * <li>SUBMITTED: submitted.</li>
         * <li>PUBLISHED: published.</li>
         * </ul>
         */
        @NameInMap("SubmitStatusList")
        public java.util.List<String> submitStatusList;

        /**
         * <p>The list of label names for filtering. If left empty, no filtering is applied. Multiple values are evaluated with an OR relationship.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The total number of records for cursor-based pagination. This parameter is optional and takes effect only when NextCursor is not empty. After the first-page request returns the actual total count, pass this value back as-is for subsequent pages. The server does not re-query the total count and directly echoes the value, which avoids redundant count overhead. If not specified, the system falls back to querying one extra record to determine whether a next page exists.</p>
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
