// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudOutboundPreviewObReportRequest extends TeaModel {
    /**
     * <p>座席号；说明：根据座席工号查询指定座席的预览外呼统计支持按照多个座席工号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的预览外呼统计</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3008</p>
     */
    @NameInMap("Cnos")
    public String cnos;

    /**
     * <p>统计时段结束时间；取值：0~23,默认值为24时</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("EndHour")
    public Long endHour;

    /**
     * <p>说明：统计日期的结束时间，格式：yyyy-MM-dd</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-06-13</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6000001</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>查询条数；取值：最大不能超过1000，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>查询起始位置；取值：大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>统计时段开始时间；取值：0~23,默认值为0时</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartHour")
    public Long startHour;

    /**
     * <p>说明：统计日期的开始时间，格式：yyyy-MM-dd</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-06-13</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>统计方法；说明：0:分时1：分日2：汇总</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StatisticMethod")
    public Long statisticMethod;

    /**
     * <p>统计类型；说明：统计报表时间类型，1：日报表2：周报表3：月报表4：自定义时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeRangeType")
    public Long timeRangeType;

    public static CloudOutboundPreviewObReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudOutboundPreviewObReportRequest self = new CloudOutboundPreviewObReportRequest();
        return TeaModel.build(map, self);
    }

    public CloudOutboundPreviewObReportRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public CloudOutboundPreviewObReportRequest setEndHour(Long endHour) {
        this.endHour = endHour;
        return this;
    }
    public Long getEndHour() {
        return this.endHour;
    }

    public CloudOutboundPreviewObReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudOutboundPreviewObReportRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudOutboundPreviewObReportRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudOutboundPreviewObReportRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CloudOutboundPreviewObReportRequest setStartHour(Long startHour) {
        this.startHour = startHour;
        return this;
    }
    public Long getStartHour() {
        return this.startHour;
    }

    public CloudOutboundPreviewObReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CloudOutboundPreviewObReportRequest setStatisticMethod(Long statisticMethod) {
        this.statisticMethod = statisticMethod;
        return this;
    }
    public Long getStatisticMethod() {
        return this.statisticMethod;
    }

    public CloudOutboundPreviewObReportRequest setTimeRangeType(Long timeRangeType) {
        this.timeRangeType = timeRangeType;
        return this;
    }
    public Long getTimeRangeType() {
        return this.timeRangeType;
    }

}
