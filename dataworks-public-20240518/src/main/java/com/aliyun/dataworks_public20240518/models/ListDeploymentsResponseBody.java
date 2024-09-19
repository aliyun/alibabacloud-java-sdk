// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDeploymentsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF02XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponseBody self = new ListDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponseBody setPagingInfo(ListDeploymentsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDeploymentsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDeploymentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentsResponseBodyPagingInfoDeploymentsStages extends TeaModel {
        /**
         * <p>阶段代号</p>
         * 
         * <strong>example:</strong>
         * <p>DEV_CHECK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>阶段描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>阶段详细信息</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>阶段信息</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>阶段名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>阶段状态</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>步骤</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        /**
         * <p>阶段类型</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDeploymentsResponseBodyPagingInfoDeploymentsStages build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyPagingInfoDeploymentsStages self = new ListDeploymentsResponseBodyPagingInfoDeploymentsStages();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public ListDeploymentsResponseBodyPagingInfoDeploymentsStages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDeploymentsResponseBodyPagingInfoDeployments extends TeaModel {
        /**
         * <p>发布包创建时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1702736654000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>创建人</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>发布流程Id</p>
         * 
         * <strong>example:</strong>
         * <p>ddf354a5-03df-48fc-94c1-cc973f79XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        /**
         * <p>修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1702736654000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>项目Id</p>
         * 
         * <strong>example:</strong>
         * <p>44683</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>步骤详情</p>
         */
        @NameInMap("Stages")
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeploymentsStages> stages;

        /**
         * <p>发布流程状态</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDeploymentsResponseBodyPagingInfoDeployments build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyPagingInfoDeployments self = new ListDeploymentsResponseBodyPagingInfoDeployments();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setStages(java.util.List<ListDeploymentsResponseBodyPagingInfoDeploymentsStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeploymentsStages> getStages() {
            return this.stages;
        }

        public ListDeploymentsResponseBodyPagingInfoDeployments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDeploymentsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Deployments")
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeployments> deployments;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>2524</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListDeploymentsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyPagingInfo self = new ListDeploymentsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyPagingInfo setDeployments(java.util.List<ListDeploymentsResponseBodyPagingInfoDeployments> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<ListDeploymentsResponseBodyPagingInfoDeployments> getDeployments() {
            return this.deployments;
        }

        public ListDeploymentsResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListDeploymentsResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListDeploymentsResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
