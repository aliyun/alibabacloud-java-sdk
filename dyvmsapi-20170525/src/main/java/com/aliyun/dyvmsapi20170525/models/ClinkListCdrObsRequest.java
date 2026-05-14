// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrObsRequest extends TeaModel {
    /**
     * <p>业务ID</p>
     * 
     * <strong>example:</strong>
     * <p>AssociatedId</p>
     */
    @NameInMap("AssociatedId")
    public Long associatedId;

    /**
     * <p>客户城市</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>座席电话</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ClientNumber")
    public String clientNumber;

    /**
     * <p>座席号，要求只能是 4-11 位数字</p>
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
     * <p>177xxxx</p>
     */
    @NameInMap("CustomerNumber")
    public String customerNumber;

    /**
     * <p>结束时间，时间戳格式精确到秒，开始时间和结束时间跨度不能超过一个月。默认值取当前时间</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

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
     * <p>是否邀评: 0: 否 1: 是 2: -</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Evaluation")
    public Long evaluation;

    /**
     * <p>是否隐藏号码。 0: 不隐藏，1: 中间四位，2: 最后八位 3: 全部号码，4: 最后四位。默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HiddenType")
    public Long hiddenType;

    /**
     * <p>热线号码</p>
     * 
     * <strong>example:</strong>
     * <p>Hotline</p>
     */
    @NameInMap("Hotline")
    public String hotline;

    /**
     * <p>业务ID类型，1：工单；2：业务记录</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
    @NameInMap("IdType")
    public Long idType;

    /**
     * <p>查询条数，范围 10-100。默认值为 10。注：limit + offset 不允许超过100000</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>通话记录唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>MainUniqueId</p>
     */
    @NameInMap("MainUniqueId")
    public String mainUniqueId;

    /**
     * <p>标记。取值范围如下： 为空表示全部， 1:留言 2:转移 3:咨询 4:三方 5:传真接收 6:会议 7:交互 8:IVR中放弃 9:已进入IVR 10:未进入IVR 11:队列中放弃 12:队列中溢出 注： 其中mark值2,3,4,7仅在status=1(座席接听)时有效， mark值1,5,6,8,9,10,11,12在status=3(系统接听)时有效</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Mark")
    public Long mark;

    /**
     * <p>偏移量，范围 0-99990。默认值为 0。注：limit + offset 不允许超过100000</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>客户省份</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>队列及时应答: 0: 否 1: 是 2: -</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("QueueAnswerInTime")
    public Long queueAnswerInTime;

    /**
     * <p>请求唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>RequestUniqueId</p>
     */
    @NameInMap("RequestUniqueId")
    public String requestUniqueId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>开始时间，时间戳格式精确到秒。默认值取当前月份第一天</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>接听状态。取值范围如下： 0: 全部 1: 客户未接听 2: 座席未接听 3: 双方接听 默认值为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    public static ClinkListCdrObsRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrObsRequest self = new ClinkListCdrObsRequest();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrObsRequest setAssociatedId(Long associatedId) {
        this.associatedId = associatedId;
        return this;
    }
    public Long getAssociatedId() {
        return this.associatedId;
    }

    public ClinkListCdrObsRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ClinkListCdrObsRequest setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }
    public String getClientNumber() {
        return this.clientNumber;
    }

    public ClinkListCdrObsRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public ClinkListCdrObsRequest setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public ClinkListCdrObsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ClinkListCdrObsRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkListCdrObsRequest setEvaluation(Long evaluation) {
        this.evaluation = evaluation;
        return this;
    }
    public Long getEvaluation() {
        return this.evaluation;
    }

    public ClinkListCdrObsRequest setHiddenType(Long hiddenType) {
        this.hiddenType = hiddenType;
        return this;
    }
    public Long getHiddenType() {
        return this.hiddenType;
    }

    public ClinkListCdrObsRequest setHotline(String hotline) {
        this.hotline = hotline;
        return this;
    }
    public String getHotline() {
        return this.hotline;
    }

    public ClinkListCdrObsRequest setIdType(Long idType) {
        this.idType = idType;
        return this;
    }
    public Long getIdType() {
        return this.idType;
    }

    public ClinkListCdrObsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ClinkListCdrObsRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public ClinkListCdrObsRequest setMark(Long mark) {
        this.mark = mark;
        return this;
    }
    public Long getMark() {
        return this.mark;
    }

    public ClinkListCdrObsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ClinkListCdrObsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkListCdrObsRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ClinkListCdrObsRequest setQueueAnswerInTime(Long queueAnswerInTime) {
        this.queueAnswerInTime = queueAnswerInTime;
        return this;
    }
    public Long getQueueAnswerInTime() {
        return this.queueAnswerInTime;
    }

    public ClinkListCdrObsRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public ClinkListCdrObsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkListCdrObsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkListCdrObsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ClinkListCdrObsRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
