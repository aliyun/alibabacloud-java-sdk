// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDeploymentPipelinesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDeploymentPipelinesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPipelinesResponseBody self = new ListDeploymentPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPipelinesResponseBody setPagingInfo(ListDeploymentPipelinesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDeploymentPipelinesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDeploymentPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages extends TeaModel {
        /**
         * <p>阶段代号</p>
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
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>步骤</p>
         */
        @NameInMap("Step")
        public Integer step;

        /**
         * <p>阶段类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages self = new ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages();
            return TeaModel.build(map, self);
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDeploymentPipelinesResponseBodyPagingInfoDeployments extends TeaModel {
        /**
         * <p>发布包创建时间戳</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>创建人</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>发布流程Id</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        /**
         * <p>修改时间</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>项目Id</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>步骤详情</p>
         */
        @NameInMap("Stages")
        public java.util.List<ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages> stages;

        /**
         * <p>发布流程状态</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDeploymentPipelinesResponseBodyPagingInfoDeployments build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentPipelinesResponseBodyPagingInfoDeployments self = new ListDeploymentPipelinesResponseBodyPagingInfoDeployments();
            return TeaModel.build(map, self);
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setStages(java.util.List<ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<ListDeploymentPipelinesResponseBodyPagingInfoDeploymentsStages> getStages() {
            return this.stages;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfoDeployments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDeploymentPipelinesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Deployments")
        public java.util.List<ListDeploymentPipelinesResponseBodyPagingInfoDeployments> deployments;

        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        public static ListDeploymentPipelinesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentPipelinesResponseBodyPagingInfo self = new ListDeploymentPipelinesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDeploymentPipelinesResponseBodyPagingInfo setDeployments(java.util.List<ListDeploymentPipelinesResponseBodyPagingInfoDeployments> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<ListDeploymentPipelinesResponseBodyPagingInfoDeployments> getDeployments() {
            return this.deployments;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListDeploymentPipelinesResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
