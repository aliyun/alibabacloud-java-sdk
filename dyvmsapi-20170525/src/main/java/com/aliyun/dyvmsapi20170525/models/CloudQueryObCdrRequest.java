// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryObCdrRequest extends TeaModel {
    /**
     * <p>座席姓名</p>
     * 
     * <strong>example:</strong>
     * <p>name3</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>座席号码</p>
     * 
     * <strong>example:</strong>
     * <p>41008502</p>
     */
    @NameInMap("AgentNumber")
    public String agentNumber;

    /**
     * <p>呼叫类型；为空表示全部，可选值为：4:预览外呼 6:主叫外呼 9:内部呼叫</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CallType")
    public Long callType;

    /**
     * <p>客户电话归属城市；为空表示全部，如&quot;成都&quot;，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>客户侧外显号码过滤条件</p>
     * 
     * <strong>example:</strong>
     * <p>4100</p>
     */
    @NameInMap("Clid")
    public String clid;

    /**
     * <p>座席工号，单个座席工号3-10位，支持一个或多个座席工号查询，多个座席工号以英文逗号隔开，一次最多支持100个。不支持模糊匹配。</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>客户号码，支持一个或多个客户号码查询，多个客户号码以英文逗号隔开，一次最多支持100个。不支持模糊匹配。</p>
     * 
     * <strong>example:</strong>
     * <p>13322223333</p>
     */
    @NameInMap("CustomerNumber")
    public String customerNumber;

    /**
     * <p>是否呼叫降级；0-否, 1-是</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DownGrade")
    public Long downGrade;

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
     * <p>座席所属外呼组 单个外呼组号2-20位，支持一个或多个座席工号查询，多个座席工号以英文逗号隔开，一次最多支持10个。不支持模糊匹配。</p>
     * 
     * <strong>example:</strong>
     * <p>455</p>
     */
    @NameInMap("Gno")
    public String gno;

    /**
     * <p>真人接听；取值说明：1-是、0-否</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsRealAnswer")
    public Long isRealAnswer;

    /**
     * <p>客户侧真实外显号码过滤条件，当使用虚拟号进行AXB外呼且开关打开时，实际过滤的客户侧真实外显号码是虚拟号</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("LeftDisplayNumber")
    public String leftDisplayNumber;

    /**
     * <p>需要取出的数据条数；大于0，最大不能超过1000，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>排序方式；取值说明：0: 按照记录产生的时序顺序排序，1：按照记录产生的时序逆序排序，2: 按照结束时间的时序顺序排序，3：按照结束时间的时序逆序排序</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Order")
    public Long order;

    /**
     * <p>客户电话归属省份；为空表示全部，如&quot;四川&quot;，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>查询请求唯一id对应的记录信息，默认查询当前月，如requestUniqueId不属于当前月，查询时请传递查询参数 查询开始时间(startTime)</p>
     * 
     * <strong>example:</strong>
     * <p>req_uniq_1-162046xxxx.12</p>
     */
    @NameInMap("RequestUniqueId")
    public String requestUniqueId;

    /**
     * <p>是否返回总条数；取值说明：0: 不返回，1：返回，不传默认为1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnCount")
    public Long returnCount;

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
     * <p>呼叫结果；参数说明：30 座席未接听; 31 座席接听,未呼叫客户; 32 座席接听,客户未接听; 33 双方接听; 50 主叫外呼接听; 51 主叫外呼,客户未接听; 52 主叫外呼,双方接听。</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
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
     * <p>用户自定义参数指定查询value；传递该参数时必须传递userFieldKey，仅查询一个字段，不支持模糊匹配，构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}</p>
     */
    @NameInMap("UserFieldValue")
    public String userFieldValue;

    /**
     * <p>用户自定义参数指定查询key；传递该参数时必须传递userFieldValue，仅查询一个字段，不支持模糊匹配，构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}</p>
     */
    @NameInMap("UserFieldkey")
    public String userFieldkey;

    public static CloudQueryObCdrRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryObCdrRequest self = new CloudQueryObCdrRequest();
        return TeaModel.build(map, self);
    }

    public CloudQueryObCdrRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CloudQueryObCdrRequest setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
        return this;
    }
    public String getAgentNumber() {
        return this.agentNumber;
    }

    public CloudQueryObCdrRequest setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public CloudQueryObCdrRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CloudQueryObCdrRequest setClid(String clid) {
        this.clid = clid;
        return this;
    }
    public String getClid() {
        return this.clid;
    }

    public CloudQueryObCdrRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudQueryObCdrRequest setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public CloudQueryObCdrRequest setDownGrade(Long downGrade) {
        this.downGrade = downGrade;
        return this;
    }
    public Long getDownGrade() {
        return this.downGrade;
    }

    public CloudQueryObCdrRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CloudQueryObCdrRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudQueryObCdrRequest setGno(String gno) {
        this.gno = gno;
        return this;
    }
    public String getGno() {
        return this.gno;
    }

    public CloudQueryObCdrRequest setIsRealAnswer(Long isRealAnswer) {
        this.isRealAnswer = isRealAnswer;
        return this;
    }
    public Long getIsRealAnswer() {
        return this.isRealAnswer;
    }

    public CloudQueryObCdrRequest setLeftDisplayNumber(String leftDisplayNumber) {
        this.leftDisplayNumber = leftDisplayNumber;
        return this;
    }
    public String getLeftDisplayNumber() {
        return this.leftDisplayNumber;
    }

    public CloudQueryObCdrRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudQueryObCdrRequest setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public CloudQueryObCdrRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CloudQueryObCdrRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public CloudQueryObCdrRequest setReturnCount(Long returnCount) {
        this.returnCount = returnCount;
        return this;
    }
    public Long getReturnCount() {
        return this.returnCount;
    }

    public CloudQueryObCdrRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CloudQueryObCdrRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CloudQueryObCdrRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CloudQueryObCdrRequest setTimeRangeType(String timeRangeType) {
        this.timeRangeType = timeRangeType;
        return this;
    }
    public String getTimeRangeType() {
        return this.timeRangeType;
    }

    public CloudQueryObCdrRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CloudQueryObCdrRequest setUserFieldValue(String userFieldValue) {
        this.userFieldValue = userFieldValue;
        return this;
    }
    public String getUserFieldValue() {
        return this.userFieldValue;
    }

    public CloudQueryObCdrRequest setUserFieldkey(String userFieldkey) {
        this.userFieldkey = userFieldkey;
        return this;
    }
    public String getUserFieldkey() {
        return this.userFieldkey;
    }

}
