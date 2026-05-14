// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkStatIbRequest extends TeaModel {
    /**
     * <p>同步日期，时间格式(yyyyMMdd)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240303</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>同步日期截止，时间格式(yyyyMMdd) ，默认与date相同，查询时间范围最大支持6个月</p>
     * 
     * <strong>example:</strong>
     * <p>20240303</p>
     */
    @NameInMap("DateEnd")
    public String dateEnd;

    /**
     * <p>查询结束时间 (单位：小时，范围：0-23)，缺省值为23</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("EndHour")
    public Long endHour;

    /**
     * <p>查询结束分钟 (单位：分，范围：0、15、30、45、59)，缺省值为59 注：由startHour:startMinute和endHour:endMinute组成的开始时间和结束时间，开始时间不得晚于或等于结束时间。 只使用startHour或endHour时，请注意startMinute与endMinute的缺省值。</p>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("EndMinute")
    public Long endMinute;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8004970</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>指定需要显示的字段 (默认全部)</p>
     * 
     * <strong>example:</strong>
     * <p>ibTotalCount,ibAnsweredCount</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>热线号码，指定需要查询的热线号码 (默认全部热线号码)</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx,xxxx</p>
     */
    @NameInMap("Hotlines")
    public String hotlines;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>查询开始时间 (单位：小时，范围：0-23)，缺省值为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartHour")
    public Long startHour;

    /**
     * <p>查询开始分钟 (单位：分，范围：0、15、30、45)，缺省值为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartMinute")
    public Long startMinute;

    /**
     * <p>统计方式 (默认为2) 取值范围为[2,3]; 2:汇总统计;3:分时统计 注：分时统计下只会返回存在队列工作情况的数据，若队列在该时段没有工作或来电，则不会返回该时段的数据</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StatisticMethod")
    public Long statisticMethod;

    public static ClinkStatIbRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkStatIbRequest self = new ClinkStatIbRequest();
        return TeaModel.build(map, self);
    }

    public ClinkStatIbRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ClinkStatIbRequest setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
    public String getDateEnd() {
        return this.dateEnd;
    }

    public ClinkStatIbRequest setEndHour(Long endHour) {
        this.endHour = endHour;
        return this;
    }
    public Long getEndHour() {
        return this.endHour;
    }

    public ClinkStatIbRequest setEndMinute(Long endMinute) {
        this.endMinute = endMinute;
        return this;
    }
    public Long getEndMinute() {
        return this.endMinute;
    }

    public ClinkStatIbRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkStatIbRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ClinkStatIbRequest setHotlines(String hotlines) {
        this.hotlines = hotlines;
        return this;
    }
    public String getHotlines() {
        return this.hotlines;
    }

    public ClinkStatIbRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkStatIbRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkStatIbRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkStatIbRequest setStartHour(Long startHour) {
        this.startHour = startHour;
        return this;
    }
    public Long getStartHour() {
        return this.startHour;
    }

    public ClinkStatIbRequest setStartMinute(Long startMinute) {
        this.startMinute = startMinute;
        return this;
    }
    public Long getStartMinute() {
        return this.startMinute;
    }

    public ClinkStatIbRequest setStatisticMethod(Long statisticMethod) {
        this.statisticMethod = statisticMethod;
        return this;
    }
    public Long getStatisticMethod() {
        return this.statisticMethod;
    }

}
