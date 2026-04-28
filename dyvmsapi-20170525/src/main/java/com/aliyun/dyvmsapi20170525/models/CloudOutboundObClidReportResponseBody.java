// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudOutboundObClidReportResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudOutboundObClidReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9FF70B74-1B3C-44C1-ACDF-8DF962988F0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudOutboundObClidReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudOutboundObClidReportResponseBody self = new CloudOutboundObClidReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudOutboundObClidReportResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudOutboundObClidReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudOutboundObClidReportResponseBody setData(CloudOutboundObClidReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudOutboundObClidReportResponseBodyData getData() {
        return this.data;
    }

    public CloudOutboundObClidReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudOutboundObClidReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudOutboundObClidReportResponseBodyDataList extends TeaModel {
        /**
         * <p>客户接听数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AnsweredCount")
        public String answeredCount;

        /**
         * <p>平均通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:02:12</p>
         */
        @NameInMap("AvgBridgeTime")
        public String avgBridgeTime;

        /**
         * <p>平均等待时长</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvgPreviewObWaitTime")
        public Long avgPreviewObWaitTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>01089192349</p>
         */
        @NameInMap("Clid")
        public String clid;

        /**
         * <p>号码接听率</p>
         * 
         * <strong>example:</strong>
         * <p>20%</p>
         */
        @NameInMap("ClidRate")
        public String clidRate;

        /**
         * <p>创建日期</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>客户侧计费分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("CustomerBillMinute")
        public Long customerBillMinute;

        /**
         * <p>时间范围</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("DateTimeRange")
        public String dateTimeRange;

        /**
         * <p>报表日期</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20</p>
         */
        @NameInMap("Day")
        public String day;

        /**
         * <p>企业Id</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>小时</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Hour")
        public String hour;

        /**
         * <p>最长通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:45</p>
         */
        @NameInMap("MaxBridgeTime")
        public String maxBridgeTime;

        /**
         * <p>最短通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:03</p>
         */
        @NameInMap("MinBridgeTime")
        public String minBridgeTime;

        /**
         * <p>响铃数</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("PreviewObCustomerRingingCount")
        public Long previewObCustomerRingingCount;

        /**
         * <p>响铃率</p>
         * 
         * <strong>example:</strong>
         * <p>95%</p>
         */
        @NameInMap("PreviewObCustomerRingingRate")
        public String previewObCustomerRingingRate;

        /**
         * <p>省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>格式化日期</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("RowName")
        public String rowName;

        /**
         * <p>总通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:08:48</p>
         */
        @NameInMap("TotalBridgeTime")
        public String totalBridgeTime;

        /**
         * <p>外呼总数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        /**
         * <p>中继群组代号</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TrunkGroupKey")
        public String trunkGroupKey;

        /**
         * <p>有效通话平均时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:21</p>
         */
        @NameInMap("ValidAvgBridgeTime")
        public String validAvgBridgeTime;

        /**
         * <p>有效通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ValidCalls")
        public String validCalls;

        /**
         * <p>有效通话总时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:42</p>
         */
        @NameInMap("ValidTotalBridgeTime")
        public String validTotalBridgeTime;

        public static CloudOutboundObClidReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudOutboundObClidReportResponseBodyDataList self = new CloudOutboundObClidReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudOutboundObClidReportResponseBodyDataList setAnsweredCount(String answeredCount) {
            this.answeredCount = answeredCount;
            return this;
        }
        public String getAnsweredCount() {
            return this.answeredCount;
        }

        public CloudOutboundObClidReportResponseBodyDataList setAvgBridgeTime(String avgBridgeTime) {
            this.avgBridgeTime = avgBridgeTime;
            return this;
        }
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        public CloudOutboundObClidReportResponseBodyDataList setAvgPreviewObWaitTime(Long avgPreviewObWaitTime) {
            this.avgPreviewObWaitTime = avgPreviewObWaitTime;
            return this;
        }
        public Long getAvgPreviewObWaitTime() {
            return this.avgPreviewObWaitTime;
        }

        public CloudOutboundObClidReportResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CloudOutboundObClidReportResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public CloudOutboundObClidReportResponseBodyDataList setClid(String clid) {
            this.clid = clid;
            return this;
        }
        public String getClid() {
            return this.clid;
        }

        public CloudOutboundObClidReportResponseBodyDataList setClidRate(String clidRate) {
            this.clidRate = clidRate;
            return this;
        }
        public String getClidRate() {
            return this.clidRate;
        }

        public CloudOutboundObClidReportResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudOutboundObClidReportResponseBodyDataList setCustomerBillMinute(Long customerBillMinute) {
            this.customerBillMinute = customerBillMinute;
            return this;
        }
        public Long getCustomerBillMinute() {
            return this.customerBillMinute;
        }

        public CloudOutboundObClidReportResponseBodyDataList setDateTimeRange(String dateTimeRange) {
            this.dateTimeRange = dateTimeRange;
            return this;
        }
        public String getDateTimeRange() {
            return this.dateTimeRange;
        }

        public CloudOutboundObClidReportResponseBodyDataList setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public CloudOutboundObClidReportResponseBodyDataList setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudOutboundObClidReportResponseBodyDataList setHour(String hour) {
            this.hour = hour;
            return this;
        }
        public String getHour() {
            return this.hour;
        }

        public CloudOutboundObClidReportResponseBodyDataList setMaxBridgeTime(String maxBridgeTime) {
            this.maxBridgeTime = maxBridgeTime;
            return this;
        }
        public String getMaxBridgeTime() {
            return this.maxBridgeTime;
        }

        public CloudOutboundObClidReportResponseBodyDataList setMinBridgeTime(String minBridgeTime) {
            this.minBridgeTime = minBridgeTime;
            return this;
        }
        public String getMinBridgeTime() {
            return this.minBridgeTime;
        }

        public CloudOutboundObClidReportResponseBodyDataList setPreviewObCustomerRingingCount(Long previewObCustomerRingingCount) {
            this.previewObCustomerRingingCount = previewObCustomerRingingCount;
            return this;
        }
        public Long getPreviewObCustomerRingingCount() {
            return this.previewObCustomerRingingCount;
        }

        public CloudOutboundObClidReportResponseBodyDataList setPreviewObCustomerRingingRate(String previewObCustomerRingingRate) {
            this.previewObCustomerRingingRate = previewObCustomerRingingRate;
            return this;
        }
        public String getPreviewObCustomerRingingRate() {
            return this.previewObCustomerRingingRate;
        }

        public CloudOutboundObClidReportResponseBodyDataList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public CloudOutboundObClidReportResponseBodyDataList setRowName(String rowName) {
            this.rowName = rowName;
            return this;
        }
        public String getRowName() {
            return this.rowName;
        }

        public CloudOutboundObClidReportResponseBodyDataList setTotalBridgeTime(String totalBridgeTime) {
            this.totalBridgeTime = totalBridgeTime;
            return this;
        }
        public String getTotalBridgeTime() {
            return this.totalBridgeTime;
        }

        public CloudOutboundObClidReportResponseBodyDataList setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public CloudOutboundObClidReportResponseBodyDataList setTrunkGroupKey(String trunkGroupKey) {
            this.trunkGroupKey = trunkGroupKey;
            return this;
        }
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        public CloudOutboundObClidReportResponseBodyDataList setValidAvgBridgeTime(String validAvgBridgeTime) {
            this.validAvgBridgeTime = validAvgBridgeTime;
            return this;
        }
        public String getValidAvgBridgeTime() {
            return this.validAvgBridgeTime;
        }

        public CloudOutboundObClidReportResponseBodyDataList setValidCalls(String validCalls) {
            this.validCalls = validCalls;
            return this;
        }
        public String getValidCalls() {
            return this.validCalls;
        }

        public CloudOutboundObClidReportResponseBodyDataList setValidTotalBridgeTime(String validTotalBridgeTime) {
            this.validTotalBridgeTime = validTotalBridgeTime;
            return this;
        }
        public String getValidTotalBridgeTime() {
            return this.validTotalBridgeTime;
        }

    }

    public static class CloudOutboundObClidReportResponseBodyData extends TeaModel {
        /**
         * <p>返回数据</p>
         */
        @NameInMap("List")
        public java.util.List<CloudOutboundObClidReportResponseBodyDataList> list;

        public static CloudOutboundObClidReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudOutboundObClidReportResponseBodyData self = new CloudOutboundObClidReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudOutboundObClidReportResponseBodyData setList(java.util.List<CloudOutboundObClidReportResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudOutboundObClidReportResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
