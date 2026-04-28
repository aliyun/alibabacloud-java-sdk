// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryIbCdrRequest extends TeaModel {
    /**
     * <p>座席号码</p>
     * 
     * <strong>example:</strong>
     * <p>41008502</p>
     */
    @NameInMap("CalleeNumber")
    public String calleeNumber;

    /**
     * <p>客户电话归属城市；为空表示全部，如&quot;成都&quot;，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>座席工号,此字段支持传入多个座席工号，使用英文半角逗号隔开</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>客户号码</p>
     * 
     * <strong>example:</strong>
     * <p>17750247753</p>
     */
    @NameInMap("CustomerNumber")
    public String customerNumber;

    /**
     * <p>查询结束时间；时间戳格式,精确到s。startTime与endTime不允许跨月，默认值取当前月份最后一天</p>
     * 
     * <strong>example:</strong>
     * <p>1775030413</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

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
     * <p>热线号码</p>
     * 
     * <strong>example:</strong>
     * <p>10003221</p>
     */
    @NameInMap("Hotline")
    public String hotline;

    /**
     * <p>未进入队列原因 参数说明： 4: 无座席未进入队列 , 3: 队列满未进入队列</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("JoinQueueCode")
    public Long joinQueueCode;

    /**
     * <p>离开队列原因 参数说明： 2: 队列中放弃 , 3: 队列中超时溢出 , 4: 队列中无座席溢出</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LeaveQueueCode")
    public Long leaveQueueCode;

    /**
     * <p>需要取出的数据条数；大于0，最大不能超过1000，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>客户电话归属省份；为空表示全部，如&quot;四川&quot;，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>队列号 参数说明：-1: 未进入队列</p>
     * 
     * <strong>example:</strong>
     * <p>566</p>
     */
    @NameInMap("Qno")
    public String qno;

    /**
     * <p>从第几条开始取；大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>查询开始时间；时间戳格式,精确到s。startTime与endTime不允许跨月，默认值取当前月份第一天</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>呼叫结果；参数说明： 1:座席接听 2:已呼叫座席，座席未接听 3:系统接听 4:系统未接听-IVR配置错误 5:系统未接听-停机 6:系统未接听-欠费 7:系统未接听-黑名单 8:系统未接听-未注册 9:系统未接听-彩铃 11:系统未接听-呼叫超出营帐中设置的最大限制 12:系统未接听-客户呼入系统后在系统未应答前挂机 13:其他错误 14:未进入队列 15:队列中放弃 16:队列中超时溢出 17:队列中无座席溢出 18:无座席未进入队列 19:队列满未进入队列</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>查询时间开始结束范围生效类型；通话记录startTime和endTime时间范围生效类型，当startTime和endTime不为空时生效；取值：1.呼叫开始时间 2.呼叫结束时间； 默认为1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeRangeType")
    public String timeRangeType;

    /**
     * <p>如果uniqueId值不为空，则以下其它参数无效，即仅查询电话唯一标识为uniqueId的记录信息</p>
     * 
     * <strong>example:</strong>
     * <p>uniq_1-162046xxxx.12</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    /**
     * <p>用户自定义参数指定查询value；传递该参数时必须传递userFieldKey，仅查询一个字段，不支持模糊匹配， 构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>userFieldvalue</p>
     */
    @NameInMap("UserFieldValue")
    public String userFieldValue;

    /**
     * <p>用户自定义参数指定查询key；传递该参数时必须传递userFieldValue，仅查询一个字段，不支持模糊匹配， 构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>userFieldkey</p>
     */
    @NameInMap("UserFieldkey")
    public String userFieldkey;

    public static CloudQueryIbCdrRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryIbCdrRequest self = new CloudQueryIbCdrRequest();
        return TeaModel.build(map, self);
    }

    public CloudQueryIbCdrRequest setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
        return this;
    }
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    public CloudQueryIbCdrRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CloudQueryIbCdrRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudQueryIbCdrRequest setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public CloudQueryIbCdrRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CloudQueryIbCdrRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudQueryIbCdrRequest setHotline(String hotline) {
        this.hotline = hotline;
        return this;
    }
    public String getHotline() {
        return this.hotline;
    }

    public CloudQueryIbCdrRequest setJoinQueueCode(Long joinQueueCode) {
        this.joinQueueCode = joinQueueCode;
        return this;
    }
    public Long getJoinQueueCode() {
        return this.joinQueueCode;
    }

    public CloudQueryIbCdrRequest setLeaveQueueCode(Long leaveQueueCode) {
        this.leaveQueueCode = leaveQueueCode;
        return this;
    }
    public Long getLeaveQueueCode() {
        return this.leaveQueueCode;
    }

    public CloudQueryIbCdrRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudQueryIbCdrRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CloudQueryIbCdrRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public CloudQueryIbCdrRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CloudQueryIbCdrRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CloudQueryIbCdrRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CloudQueryIbCdrRequest setTimeRangeType(String timeRangeType) {
        this.timeRangeType = timeRangeType;
        return this;
    }
    public String getTimeRangeType() {
        return this.timeRangeType;
    }

    public CloudQueryIbCdrRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CloudQueryIbCdrRequest setUserFieldValue(String userFieldValue) {
        this.userFieldValue = userFieldValue;
        return this;
    }
    public String getUserFieldValue() {
        return this.userFieldValue;
    }

    public CloudQueryIbCdrRequest setUserFieldkey(String userFieldkey) {
        this.userFieldkey = userFieldkey;
        return this;
    }
    public String getUserFieldkey() {
        return this.userFieldkey;
    }

}
