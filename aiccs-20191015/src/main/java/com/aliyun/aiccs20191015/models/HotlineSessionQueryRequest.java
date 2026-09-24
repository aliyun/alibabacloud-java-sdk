// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HotlineSessionQueryRequest extends TeaModel {
    /**
     * <p>The session ID. The acid in the websocket after an inbound call.</p>
     * 
     * <strong>example:</strong>
     * <p>7719786****</p>
     */
    @NameInMap("Acid")
    public String acid;

    /**
     * <p>The list of session IDs.</p>
     */
    @NameInMap("AcidList")
    public java.util.List<String> acidList;

    /**
     * <p>The call result. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: normal hangup.</li>
     * <li><strong>touchRouteError</strong>: queue hangup.</li>
     * <li><strong>touchInQueue</strong>: queue hangup.</li>
     * <li><strong>touchInLoss</strong>: queue hangup.</li>
     * <li><strong>userHangup</strong>: user hangup or IVR hangup.</li>
     * <li><strong>sysHangup</strong>: system hangup or IVR hangup.</li>
     * <li><strong>transferAgent</strong>: user hangup or IVR hangup.</li>
     * <li><strong>dailing</strong>: agent hangup or ringing hangup.</li>
     * <li><strong>TouchRingCallLoss</strong>: queue hangup or ringing hangup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("CallResult")
    public String callResult;

    /**
     * <p>The list of call results.</p>
     */
    @NameInMap("CallResultList")
    public java.util.List<String> callResultList;

    /**
     * <p>The call type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: outbound call.</li>
     * <li><strong>2</strong>: inbound call.</li>
     * <li><strong>3</strong>: transferred call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CallType")
    public Integer callType;

    /**
     * <p>The list of call types.</p>
     */
    @NameInMap("CallTypeList")
    public java.util.List<Integer> callTypeList;

    /**
     * <p>The number of the caller. For example, a mobile phone number of a user, an agent number, or a robot number.</p>
     * 
     * <strong>example:</strong>
     * <p>135615****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The list of called numbers.</p>
     */
    @NameInMap("CalledNumberList")
    public java.util.List<String> calledNumberList;

    /**
     * <p>The number of the callee. For example, a mobile phone number of a user, an agent number, or a robot number.</p>
     * 
     * <strong>example:</strong>
     * <p>057177****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>The list of calling numbers.</p>
     */
    @NameInMap("CallingNumberList")
    public java.util.List<String> callingNumberList;

    /**
     * <p>The ID of the skill group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The list of skill group IDs.</p>
     */
    @NameInMap("GroupIdList")
    public java.util.List<Long> groupIdList;

    /**
     * <p>The name of the skill group.</p>
     * 
     * <strong>example:</strong>
     * <p>AutomationSkillGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The globally unique ID of the call details.</p>
     * 
     * <strong>example:</strong>
     * <p>acc1c58dab4a4****0e3813c66</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the Artificial Intelligence Cloud Call Service (AICCS) instance.
     * You can obtain the instance ID from <b>Instance Management</b> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The member ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7856****</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The list of member IDs.</p>
     */
    @NameInMap("MemberIdList")
    public java.util.List<String> memberIdList;

    /**
     * <p>The member name.</p>
     * 
     * <strong>example:</strong>
     * <p>AnonymousMember</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The extended parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The end timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614829721</p>
     */
    @NameInMap("QueryEndTime")
    public Long queryEndTime;

    /**
     * <p>The start timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614828721</p>
     */
    @NameInMap("QueryStartTime")
    public Long queryStartTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>555555</p>
     */
    @NameInMap("ServicerId")
    public String servicerId;

    /**
     * <p>The list of agent IDs.</p>
     */
    @NameInMap("ServicerIdList")
    public java.util.List<String> servicerIdList;

    /**
     * <p>The agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>TestAgent</p>
     */
    @NameInMap("ServicerName")
    public String servicerName;

    public static HotlineSessionQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        HotlineSessionQueryRequest self = new HotlineSessionQueryRequest();
        return TeaModel.build(map, self);
    }

    public HotlineSessionQueryRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public HotlineSessionQueryRequest setAcidList(java.util.List<String> acidList) {
        this.acidList = acidList;
        return this;
    }
    public java.util.List<String> getAcidList() {
        return this.acidList;
    }

    public HotlineSessionQueryRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public HotlineSessionQueryRequest setCallResultList(java.util.List<String> callResultList) {
        this.callResultList = callResultList;
        return this;
    }
    public java.util.List<String> getCallResultList() {
        return this.callResultList;
    }

    public HotlineSessionQueryRequest setCallType(Integer callType) {
        this.callType = callType;
        return this;
    }
    public Integer getCallType() {
        return this.callType;
    }

    public HotlineSessionQueryRequest setCallTypeList(java.util.List<Integer> callTypeList) {
        this.callTypeList = callTypeList;
        return this;
    }
    public java.util.List<Integer> getCallTypeList() {
        return this.callTypeList;
    }

    public HotlineSessionQueryRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public HotlineSessionQueryRequest setCalledNumberList(java.util.List<String> calledNumberList) {
        this.calledNumberList = calledNumberList;
        return this;
    }
    public java.util.List<String> getCalledNumberList() {
        return this.calledNumberList;
    }

    public HotlineSessionQueryRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public HotlineSessionQueryRequest setCallingNumberList(java.util.List<String> callingNumberList) {
        this.callingNumberList = callingNumberList;
        return this;
    }
    public java.util.List<String> getCallingNumberList() {
        return this.callingNumberList;
    }

    public HotlineSessionQueryRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public HotlineSessionQueryRequest setGroupIdList(java.util.List<Long> groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public java.util.List<Long> getGroupIdList() {
        return this.groupIdList;
    }

    public HotlineSessionQueryRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public HotlineSessionQueryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public HotlineSessionQueryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public HotlineSessionQueryRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public HotlineSessionQueryRequest setMemberIdList(java.util.List<String> memberIdList) {
        this.memberIdList = memberIdList;
        return this;
    }
    public java.util.List<String> getMemberIdList() {
        return this.memberIdList;
    }

    public HotlineSessionQueryRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public HotlineSessionQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public HotlineSessionQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HotlineSessionQueryRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public HotlineSessionQueryRequest setQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }
    public Long getQueryEndTime() {
        return this.queryEndTime;
    }

    public HotlineSessionQueryRequest setQueryStartTime(Long queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }
    public Long getQueryStartTime() {
        return this.queryStartTime;
    }

    public HotlineSessionQueryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotlineSessionQueryRequest setServicerId(String servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public String getServicerId() {
        return this.servicerId;
    }

    public HotlineSessionQueryRequest setServicerIdList(java.util.List<String> servicerIdList) {
        this.servicerIdList = servicerIdList;
        return this;
    }
    public java.util.List<String> getServicerIdList() {
        return this.servicerIdList;
    }

    public HotlineSessionQueryRequest setServicerName(String servicerName) {
        this.servicerName = servicerName;
        return this;
    }
    public String getServicerName() {
        return this.servicerName;
    }

}
