// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentWorkloadReportRequest extends TeaModel {
    /**
     * <p>座席号；说明：根据座席工号查询指定座席的工作量统计支持按照多个座席工号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的工作量统计</p>
     * 
     * <strong>example:</strong>
     * <p>1111,2222</p>
     */
    @NameInMap("Cnos")
    public String cnos;

    /**
     * <p>说明：统计日期的结束时间，格式：yyyy-MM-dd</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-15</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>说明：根据外呼编号查询指定座席的工作量统计,默认查询账户下所有座席的工作量统计</p>
     * 
     * <strong>example:</strong>
     * <p>WH12</p>
     */
    @NameInMap("Gnos")
    public String gnos;

    /**
     * <p>查询条数；取值：最大不能超过1000，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>查询起始位置；取值：大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>说明：统计日期的开始时间，格式：yyyy-MM-dd</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-13</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>统计方法；说明：0：分时1：分日2：汇总 10：队列汇总</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StatisticMethod")
    public Long statisticMethod;

    /**
     * <p>说明：统计报表类型，1：日报表2：周报表3：月报表4：自定义时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeRangeType")
    public Long timeRangeType;

    public static CloudAgentWorkloadReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentWorkloadReportRequest self = new CloudAgentWorkloadReportRequest();
        return TeaModel.build(map, self);
    }

    public CloudAgentWorkloadReportRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public CloudAgentWorkloadReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudAgentWorkloadReportRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudAgentWorkloadReportRequest setGnos(String gnos) {
        this.gnos = gnos;
        return this;
    }
    public String getGnos() {
        return this.gnos;
    }

    public CloudAgentWorkloadReportRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudAgentWorkloadReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudAgentWorkloadReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudAgentWorkloadReportRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudAgentWorkloadReportRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CloudAgentWorkloadReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CloudAgentWorkloadReportRequest setStatisticMethod(Long statisticMethod) {
        this.statisticMethod = statisticMethod;
        return this;
    }
    public Long getStatisticMethod() {
        return this.statisticMethod;
    }

    public CloudAgentWorkloadReportRequest setTimeRangeType(Long timeRangeType) {
        this.timeRangeType = timeRangeType;
        return this;
    }
    public Long getTimeRangeType() {
        return this.timeRangeType;
    }

}
