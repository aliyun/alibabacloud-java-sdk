// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudOutboundPreviewObReportResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudOutboundPreviewObReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudOutboundPreviewObReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudOutboundPreviewObReportResponseBody self = new CloudOutboundPreviewObReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudOutboundPreviewObReportResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudOutboundPreviewObReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudOutboundPreviewObReportResponseBody setData(CloudOutboundPreviewObReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudOutboundPreviewObReportResponseBodyData getData() {
        return this.data;
    }

    public CloudOutboundPreviewObReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudOutboundPreviewObReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudOutboundPreviewObReportResponseBodyDataList extends TeaModel {
        /**
         * <p>座席接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AgentAnsweredCount")
        public String agentAnsweredCount;

        /**
         * <p>座席姓名</p>
         * 
         * <strong>example:</strong>
         * <p>name3</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>座席接听率</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("AgentRate")
        public String agentRate;

        /**
         * <p>平均通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:12</p>
         */
        @NameInMap("AvgBridgeTime")
        public String avgBridgeTime;

        /**
         * <p>AXB双方接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AxbBothAnsweredCount")
        public String axbBothAnsweredCount;

        /**
         * <p>AXB双方接听率 = AXB双方接听数 / AXB外呼总数</p>
         * 
         * <strong>example:</strong>
         * <p>0%</p>
         */
        @NameInMap("AxbBothAnsweredRate")
        public String axbBothAnsweredRate;

        /**
         * <p>AXB外呼双方接听分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AxbBothAnsweredTime")
        public String axbBothAnsweredTime;

        /**
         * <p>AXB外呼总数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AxbObTotalCount")
        public String axbObTotalCount;

        /**
         * <p>双方接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BothAnsweredCount")
        public String bothAnsweredCount;

        /**
         * <p>双方接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BothAnsweredTime")
        public String bothAnsweredTime;

        /**
         * <p>呼叫接通率</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("CallBridgedRate")
        public String callBridgedRate;

        /**
         * <p>发起呼叫次数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallTotalCount")
        public String callTotalCount;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>3008</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CustomerAnsweredCount")
        public String customerAnsweredCount;

        /**
         * <p>客户接听率</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("CustomerRate")
        public String customerRate;

        /**
         * <p>统计周期</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("DateTimeRange")
        public String dateTimeRange;

        /**
         * <p>企业Id</p>
         * 
         * <strong>example:</strong>
         * <p>6000001</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>拦截次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InterceptionCount")
        public String interceptionCount;

        /**
         * <p>拦截率</p>
         * 
         * <strong>example:</strong>
         * <p>0%</p>
         */
        @NameInMap("InterceptionRate")
        public String interceptionRate;

        /**
         * <p>固话双方接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LandlineBothAnsweredCount")
        public String landlineBothAnsweredCount;

        /**
         * <p>固话双方接听率 = 固话双方接听数 / 固话外呼总数</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("LandlineBothAnsweredRate")
        public String landlineBothAnsweredRate;

        /**
         * <p>固话双方接听分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LandlineBothAnsweredTime")
        public String landlineBothAnsweredTime;

        /**
         * <p>固话外呼总数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LandlineObTotalCount")
        public String landlineObTotalCount;

        /**
         * <p>最长通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:14</p>
         */
        @NameInMap("MaxBridgeTime")
        public String maxBridgeTime;

        /**
         * <p>最短通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:11</p>
         */
        @NameInMap("MinBridgeTime")
        public String minBridgeTime;

        /**
         * <p>总通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:38</p>
         */
        @NameInMap("TotalBridgeTime")
        public String totalBridgeTime;

        /**
         * <p>外呼总数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        /**
         * <p>通话占比</p>
         * 
         * <strong>example:</strong>
         * <p>0%</p>
         */
        @NameInMap("VadRate")
        public String vadRate;

        /**
         * <p>有效通话平均通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:12</p>
         */
        @NameInMap("ValidAvgBridgeTime")
        public String validAvgBridgeTime;

        /**
         * <p>有效通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ValidCalls")
        public String validCalls;

        /**
         * <p>有效通话总通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:38</p>
         */
        @NameInMap("ValidTotalBridgeTime")
        public String validTotalBridgeTime;

        public static CloudOutboundPreviewObReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudOutboundPreviewObReportResponseBodyDataList self = new CloudOutboundPreviewObReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAgentAnsweredCount(String agentAnsweredCount) {
            this.agentAnsweredCount = agentAnsweredCount;
            return this;
        }
        public String getAgentAnsweredCount() {
            return this.agentAnsweredCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAgentRate(String agentRate) {
            this.agentRate = agentRate;
            return this;
        }
        public String getAgentRate() {
            return this.agentRate;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAvgBridgeTime(String avgBridgeTime) {
            this.avgBridgeTime = avgBridgeTime;
            return this;
        }
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAxbBothAnsweredCount(String axbBothAnsweredCount) {
            this.axbBothAnsweredCount = axbBothAnsweredCount;
            return this;
        }
        public String getAxbBothAnsweredCount() {
            return this.axbBothAnsweredCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAxbBothAnsweredRate(String axbBothAnsweredRate) {
            this.axbBothAnsweredRate = axbBothAnsweredRate;
            return this;
        }
        public String getAxbBothAnsweredRate() {
            return this.axbBothAnsweredRate;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAxbBothAnsweredTime(String axbBothAnsweredTime) {
            this.axbBothAnsweredTime = axbBothAnsweredTime;
            return this;
        }
        public String getAxbBothAnsweredTime() {
            return this.axbBothAnsweredTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setAxbObTotalCount(String axbObTotalCount) {
            this.axbObTotalCount = axbObTotalCount;
            return this;
        }
        public String getAxbObTotalCount() {
            return this.axbObTotalCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setBothAnsweredCount(String bothAnsweredCount) {
            this.bothAnsweredCount = bothAnsweredCount;
            return this;
        }
        public String getBothAnsweredCount() {
            return this.bothAnsweredCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setBothAnsweredTime(String bothAnsweredTime) {
            this.bothAnsweredTime = bothAnsweredTime;
            return this;
        }
        public String getBothAnsweredTime() {
            return this.bothAnsweredTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setCallBridgedRate(String callBridgedRate) {
            this.callBridgedRate = callBridgedRate;
            return this;
        }
        public String getCallBridgedRate() {
            return this.callBridgedRate;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setCallTotalCount(String callTotalCount) {
            this.callTotalCount = callTotalCount;
            return this;
        }
        public String getCallTotalCount() {
            return this.callTotalCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setCustomerAnsweredCount(String customerAnsweredCount) {
            this.customerAnsweredCount = customerAnsweredCount;
            return this;
        }
        public String getCustomerAnsweredCount() {
            return this.customerAnsweredCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setCustomerRate(String customerRate) {
            this.customerRate = customerRate;
            return this;
        }
        public String getCustomerRate() {
            return this.customerRate;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setDateTimeRange(String dateTimeRange) {
            this.dateTimeRange = dateTimeRange;
            return this;
        }
        public String getDateTimeRange() {
            return this.dateTimeRange;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setInterceptionCount(String interceptionCount) {
            this.interceptionCount = interceptionCount;
            return this;
        }
        public String getInterceptionCount() {
            return this.interceptionCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setInterceptionRate(String interceptionRate) {
            this.interceptionRate = interceptionRate;
            return this;
        }
        public String getInterceptionRate() {
            return this.interceptionRate;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setLandlineBothAnsweredCount(String landlineBothAnsweredCount) {
            this.landlineBothAnsweredCount = landlineBothAnsweredCount;
            return this;
        }
        public String getLandlineBothAnsweredCount() {
            return this.landlineBothAnsweredCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setLandlineBothAnsweredRate(String landlineBothAnsweredRate) {
            this.landlineBothAnsweredRate = landlineBothAnsweredRate;
            return this;
        }
        public String getLandlineBothAnsweredRate() {
            return this.landlineBothAnsweredRate;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setLandlineBothAnsweredTime(String landlineBothAnsweredTime) {
            this.landlineBothAnsweredTime = landlineBothAnsweredTime;
            return this;
        }
        public String getLandlineBothAnsweredTime() {
            return this.landlineBothAnsweredTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setLandlineObTotalCount(String landlineObTotalCount) {
            this.landlineObTotalCount = landlineObTotalCount;
            return this;
        }
        public String getLandlineObTotalCount() {
            return this.landlineObTotalCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setMaxBridgeTime(String maxBridgeTime) {
            this.maxBridgeTime = maxBridgeTime;
            return this;
        }
        public String getMaxBridgeTime() {
            return this.maxBridgeTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setMinBridgeTime(String minBridgeTime) {
            this.minBridgeTime = minBridgeTime;
            return this;
        }
        public String getMinBridgeTime() {
            return this.minBridgeTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setTotalBridgeTime(String totalBridgeTime) {
            this.totalBridgeTime = totalBridgeTime;
            return this;
        }
        public String getTotalBridgeTime() {
            return this.totalBridgeTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setVadRate(String vadRate) {
            this.vadRate = vadRate;
            return this;
        }
        public String getVadRate() {
            return this.vadRate;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setValidAvgBridgeTime(String validAvgBridgeTime) {
            this.validAvgBridgeTime = validAvgBridgeTime;
            return this;
        }
        public String getValidAvgBridgeTime() {
            return this.validAvgBridgeTime;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setValidCalls(String validCalls) {
            this.validCalls = validCalls;
            return this;
        }
        public String getValidCalls() {
            return this.validCalls;
        }

        public CloudOutboundPreviewObReportResponseBodyDataList setValidTotalBridgeTime(String validTotalBridgeTime) {
            this.validTotalBridgeTime = validTotalBridgeTime;
            return this;
        }
        public String getValidTotalBridgeTime() {
            return this.validTotalBridgeTime;
        }

    }

    public static class CloudOutboundPreviewObReportResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<CloudOutboundPreviewObReportResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageCount")
        public String totalPageCount;

        public static CloudOutboundPreviewObReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudOutboundPreviewObReportResponseBodyData self = new CloudOutboundPreviewObReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudOutboundPreviewObReportResponseBodyData setList(java.util.List<CloudOutboundPreviewObReportResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudOutboundPreviewObReportResponseBodyDataList> getList() {
            return this.list;
        }

        public CloudOutboundPreviewObReportResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public CloudOutboundPreviewObReportResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public CloudOutboundPreviewObReportResponseBodyData setTotalPageCount(String totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public String getTotalPageCount() {
            return this.totalPageCount;
        }

    }

}
