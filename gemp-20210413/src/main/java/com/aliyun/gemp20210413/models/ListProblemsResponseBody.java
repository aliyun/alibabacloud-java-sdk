// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListProblemsResponseBodyData> data;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总条数
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
        // 服务描述
        @NameInMap("serviceDescription")
        public String serviceDescription;

        // 影响服务ID
        @NameInMap("serviceId")
        public Long serviceId;

        // 服务名字
        @NameInMap("serviceName")
        public String serviceName;

        // 修改时间
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

        // 取消时间
        @NameInMap("cancelTime")
        public String cancelTime;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 发现时间
        @NameInMap("discoverTime")
        public String discoverTime;

        // 完结时间
        @NameInMap("finishTime")
        public String finishTime;

        // 事件ID
        @NameInMap("incidentId")
        public Long incidentId;

        // 是否手动
        @NameInMap("isManual")
        public Boolean isManual;

        // 是否升级
        @NameInMap("isUpgrade")
        public Boolean isUpgrade;

        // 主要处理人ID
        @NameInMap("mainHandlerId")
        public Long mainHandlerId;

        // 主要处理人名称
        @NameInMap("mainHandlerName")
        public String mainHandlerName;

        // 故障id
        @NameInMap("problemId")
        public Long problemId;

        // 故障等级 1=P1 2=P2 3=P3 4=P4
        @NameInMap("problemLevel")
        public String problemLevel;

        // 故障名称
        @NameInMap("problemName")
        public String problemName;

        // 故障编号
        @NameInMap("problemNumber")
        public String problemNumber;

        // 故障状态  HANDLING    处理中 RECOVERED  已恢复  REPLAYING   复盘中  REPLAYED     已复盘 CANCEL        已取消
        @NameInMap("problemStatus")
        public String problemStatus;

        // 恢复时间
        @NameInMap("recoveryTime")
        public String recoveryTime;

        // 关联服务ID
        @NameInMap("relatedServiceId")
        public String relatedServiceId;

        // 复盘时间
        @NameInMap("replayTime")
        public String replayTime;

        // 关联服务名称
        @NameInMap("serviceName")
        public String serviceName;

        // 修改时间
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
