// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentPlansResponseBody extends TeaModel {
    /**
     * <p>Access Denied Detail</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public java.util.List<ListExperimentPlansResponseBodyData> data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>FA9F1DE7-103B-5C18-AE9E-EB2BFF11C685</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListExperimentPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlansResponseBody self = new ListExperimentPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlansResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListExperimentPlansResponseBody setData(java.util.List<ListExperimentPlansResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListExperimentPlansResponseBodyData> getData() {
        return this.data;
    }

    public ListExperimentPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentPlansResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentPlansResponseBodyData extends TeaModel {
        /**
         * <p>Creation Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-08 10:12:42</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>End Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-08 10:22:42</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Plan ID</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        @NameInMap("PlanId")
        public Long planId;

        /**
         * <p>Test Plan Execution Status</p>
         */
        @NameInMap("PlanTaskStatus")
        public java.util.Map<String, Integer> planTaskStatus;

        /**
         * <p>Resource Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek5behqmwbfhuy</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Associated Resource Name</p>
         * 
         * <strong>example:</strong>
         * <p>q_ecs_xpec_postpay_c</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>Start Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-08 10:12:42</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Associated Test Plan Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>Associated Test Plan Template Name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Update Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-08 10:12:42</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListExperimentPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentPlansResponseBodyData self = new ListExperimentPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExperimentPlansResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExperimentPlansResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListExperimentPlansResponseBodyData setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public ListExperimentPlansResponseBodyData setPlanTaskStatus(java.util.Map<String, Integer> planTaskStatus) {
            this.planTaskStatus = planTaskStatus;
            return this;
        }
        public java.util.Map<String, Integer> getPlanTaskStatus() {
            return this.planTaskStatus;
        }

        public ListExperimentPlansResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListExperimentPlansResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListExperimentPlansResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListExperimentPlansResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListExperimentPlansResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListExperimentPlansResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
