// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: development environment </li>
     * <li>PROD (default): production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListNodesRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListNodesRequest setListQuery(ListNodesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListNodesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListNodesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListNodesRequestListQuery extends TeaModel {
        /**
         * <p>Specifies whether to perform a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DryRun")
        public Boolean dryRun;

        /**
         * <p>The node business type. Valid values:</p>
         * <ul>
         * <li>SCRIPT: script</li>
         * <li>LOGICAL_TABLE: logical table.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT</p>
         */
        @NameInMap("NodeBizType")
        public String nodeBizType;

        /**
         * <p>The sub-business types. Valid values:</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL</li>
         * <li>HIVE_SQL</li>
         * <li>SHELL</li>
         * <li>PYTHON</li>
         * <li>ONE_SERVICE_SQL</li>
         * <li>DATABASE_SQL.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeSubBizTypeList")
        public java.util.List<String> nodeSubBizTypeList;

        /**
         * <p>The user IDs of the owners.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The node priorities. Valid values:</p>
         * <ul>
         * <li>HIGHEST</li>
         * <li>HIGH</li>
         * <li>MIDDLE</li>
         * <li>LOW</li>
         * <li>LOWEST.</li>
         * </ul>
         */
        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12111</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Specifies whether scheduling is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        /**
         * <p>The scheduling periods. Valid values:</p>
         * <ul>
         * <li>YEARLY</li>
         * <li>MONTHLY</li>
         * <li>WEEKLY</li>
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * <li>MINUTELY.</li>
         * </ul>
         */
        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <p>The node scheduling type. Valid values:</p>
         * <ul>
         * <li>NORMAL: periodic scheduling</li>
         * <li>SUPPLEMENT: data backfill</li>
         * <li>MANUAL: manual scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>The search keyword. Fuzzy search by node name and exact search by node ID are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchText")
        public String searchText;

        public static ListNodesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListNodesRequestListQuery self = new ListNodesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListNodesRequestListQuery setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListNodesRequestListQuery setNodeBizType(String nodeBizType) {
            this.nodeBizType = nodeBizType;
            return this;
        }
        public String getNodeBizType() {
            return this.nodeBizType;
        }

        public ListNodesRequestListQuery setNodeSubBizTypeList(java.util.List<String> nodeSubBizTypeList) {
            this.nodeSubBizTypeList = nodeSubBizTypeList;
            return this;
        }
        public java.util.List<String> getNodeSubBizTypeList() {
            return this.nodeSubBizTypeList;
        }

        public ListNodesRequestListQuery setOwnerList(java.util.List<String> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
        }

        public ListNodesRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListNodesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNodesRequestListQuery setPriorityList(java.util.List<String> priorityList) {
            this.priorityList = priorityList;
            return this;
        }
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        public ListNodesRequestListQuery setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListNodesRequestListQuery setSchedulePaused(Boolean schedulePaused) {
            this.schedulePaused = schedulePaused;
            return this;
        }
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        public ListNodesRequestListQuery setSchedulePeriodList(java.util.List<String> schedulePeriodList) {
            this.schedulePeriodList = schedulePeriodList;
            return this;
        }
        public java.util.List<String> getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        public ListNodesRequestListQuery setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListNodesRequestListQuery setSearchText(String searchText) {
            this.searchText = searchText;
            return this;
        }
        public String getSearchText() {
            return this.searchText;
        }

    }

}
