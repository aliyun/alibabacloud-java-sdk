// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListProblemsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListProblemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProblemsResponseBody self = new ListProblemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProblemsResponseBody setData(java.util.List<ListProblemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProblemsResponseBodyData> getData() {
        return this.data;
    }

    public ListProblemsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListProblemsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProblemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProblemsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProblemsResponseBodyDataAffectServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>服务描述</p>
         */
        @NameInMap("serviceDescription")
        public String serviceDescription;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("serviceId")
        public Long serviceId;

        /**
         * <strong>example:</strong>
         * <p>冲上云霄</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListProblemsResponseBodyDataAffectServices build(java.util.Map<String, ?> map) throws Exception {
            ListProblemsResponseBodyDataAffectServices self = new ListProblemsResponseBodyDataAffectServices();
            return TeaModel.build(map, self);
        }

        public ListProblemsResponseBodyDataAffectServices setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        public ListProblemsResponseBodyDataAffectServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListProblemsResponseBodyDataAffectServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListProblemsResponseBodyDataAffectServices setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListProblemsResponseBodyData extends TeaModel {
        @NameInMap("affectServices")
        public java.util.List<ListProblemsResponseBodyDataAffectServices> affectServices;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("cancelTime")
        public String cancelTime;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("discoverTime")
        public String discoverTime;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("finishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("incidentId")
        public Long incidentId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isManual")
        public Boolean isManual;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isUpgrade")
        public Boolean isUpgrade;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("mainHandlerId")
        public Long mainHandlerId;

        @NameInMap("mainHandlerIsValid")
        public Long mainHandlerIsValid;

        /**
         * <strong>example:</strong>
         * <p>王宇</p>
         */
        @NameInMap("mainHandlerName")
        public String mainHandlerName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("problemId")
        public Long problemId;

        /**
         * <strong>example:</strong>
         * <p>P1</p>
         */
        @NameInMap("problemLevel")
        public String problemLevel;

        /**
         * <strong>example:</strong>
         * <p>故障</p>
         */
        @NameInMap("problemName")
        public String problemName;

        /**
         * <strong>example:</strong>
         * <p>P34438300000001116258132229577472</p>
         */
        @NameInMap("problemNumber")
        public String problemNumber;

        /**
         * <strong>example:</strong>
         * <p>HANDLING</p>
         */
        @NameInMap("problemStatus")
        public String problemStatus;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("recoveryTime")
        public String recoveryTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relatedServiceId")
        public String relatedServiceId;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("replayTime")
        public String replayTime;

        @NameInMap("serviceDeletedType")
        public Integer serviceDeletedType;

        /**
         * <strong>example:</strong>
         * <p>服务1</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:59:59</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListProblemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProblemsResponseBodyData self = new ListProblemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProblemsResponseBodyData setAffectServices(java.util.List<ListProblemsResponseBodyDataAffectServices> affectServices) {
            this.affectServices = affectServices;
            return this;
        }
        public java.util.List<ListProblemsResponseBodyDataAffectServices> getAffectServices() {
            return this.affectServices;
        }

        public ListProblemsResponseBodyData setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public String getCancelTime() {
            return this.cancelTime;
        }

        public ListProblemsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProblemsResponseBodyData setDiscoverTime(String discoverTime) {
            this.discoverTime = discoverTime;
            return this;
        }
        public String getDiscoverTime() {
            return this.discoverTime;
        }

        public ListProblemsResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListProblemsResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public ListProblemsResponseBodyData setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

        public ListProblemsResponseBodyData setIsUpgrade(Boolean isUpgrade) {
            this.isUpgrade = isUpgrade;
            return this;
        }
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        public ListProblemsResponseBodyData setMainHandlerId(Long mainHandlerId) {
            this.mainHandlerId = mainHandlerId;
            return this;
        }
        public Long getMainHandlerId() {
            return this.mainHandlerId;
        }

        public ListProblemsResponseBodyData setMainHandlerIsValid(Long mainHandlerIsValid) {
            this.mainHandlerIsValid = mainHandlerIsValid;
            return this;
        }
        public Long getMainHandlerIsValid() {
            return this.mainHandlerIsValid;
        }

        public ListProblemsResponseBodyData setMainHandlerName(String mainHandlerName) {
            this.mainHandlerName = mainHandlerName;
            return this;
        }
        public String getMainHandlerName() {
            return this.mainHandlerName;
        }

        public ListProblemsResponseBodyData setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

        public ListProblemsResponseBodyData setProblemLevel(String problemLevel) {
            this.problemLevel = problemLevel;
            return this;
        }
        public String getProblemLevel() {
            return this.problemLevel;
        }

        public ListProblemsResponseBodyData setProblemName(String problemName) {
            this.problemName = problemName;
            return this;
        }
        public String getProblemName() {
            return this.problemName;
        }

        public ListProblemsResponseBodyData setProblemNumber(String problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }
        public String getProblemNumber() {
            return this.problemNumber;
        }

        public ListProblemsResponseBodyData setProblemStatus(String problemStatus) {
            this.problemStatus = problemStatus;
            return this;
        }
        public String getProblemStatus() {
            return this.problemStatus;
        }

        public ListProblemsResponseBodyData setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public ListProblemsResponseBodyData setRelatedServiceId(String relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public String getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public ListProblemsResponseBodyData setReplayTime(String replayTime) {
            this.replayTime = replayTime;
            return this;
        }
        public String getReplayTime() {
            return this.replayTime;
        }

        public ListProblemsResponseBodyData setServiceDeletedType(Integer serviceDeletedType) {
            this.serviceDeletedType = serviceDeletedType;
            return this;
        }
        public Integer getServiceDeletedType() {
            return this.serviceDeletedType;
        }

        public ListProblemsResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListProblemsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
