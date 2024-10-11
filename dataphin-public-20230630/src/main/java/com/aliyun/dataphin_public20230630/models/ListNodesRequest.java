// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListNodesRequestListQuery listQuery;

    /**
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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DryRun")
        public Boolean dryRun;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT</p>
         */
        @NameInMap("NodeBizType")
        public String nodeBizType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeSubBizTypeList")
        public java.util.List<String> nodeSubBizTypeList;

        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12111</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
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
