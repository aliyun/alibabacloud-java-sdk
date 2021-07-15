// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HotlineSessionQueryRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Acid")
    public String acid;

    @NameInMap("CallType")
    public Integer callType;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("QueryEndTime")
    public Long queryEndTime;

    @NameInMap("QueryStartTime")
    public Long queryStartTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServicerName")
    public String servicerName;

    @NameInMap("ServicerId")
    public String servicerId;

    @NameInMap("Params")
    public String params;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("CallResult")
    public String callResult;

    @NameInMap("Id")
    public String id;

    @NameInMap("AcidList")
    public java.util.List<String> acidList;

    @NameInMap("CallTypeList")
    public java.util.List<Integer> callTypeList;

    @NameInMap("GroupIdList")
    public java.util.List<Long> groupIdList;

    @NameInMap("CallingNumberList")
    public java.util.List<String> callingNumberList;

    @NameInMap("CalledNumberList")
    public java.util.List<String> calledNumberList;

    @NameInMap("MemberIdList")
    public java.util.List<String> memberIdList;

    @NameInMap("ServicerIdList")
    public java.util.List<String> servicerIdList;

    @NameInMap("CallResultList")
    public java.util.List<String> callResultList;

    public static HotlineSessionQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        HotlineSessionQueryRequest self = new HotlineSessionQueryRequest();
        return TeaModel.build(map, self);
    }

    public HotlineSessionQueryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public HotlineSessionQueryRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public HotlineSessionQueryRequest setCallType(Integer callType) {
        this.callType = callType;
        return this;
    }
    public Integer getCallType() {
        return this.callType;
    }

    public HotlineSessionQueryRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public HotlineSessionQueryRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public HotlineSessionQueryRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public HotlineSessionQueryRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public HotlineSessionQueryRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public HotlineSessionQueryRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
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

    public HotlineSessionQueryRequest setServicerName(String servicerName) {
        this.servicerName = servicerName;
        return this;
    }
    public String getServicerName() {
        return this.servicerName;
    }

    public HotlineSessionQueryRequest setServicerId(String servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public String getServicerId() {
        return this.servicerId;
    }

    public HotlineSessionQueryRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public HotlineSessionQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HotlineSessionQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public HotlineSessionQueryRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public HotlineSessionQueryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public HotlineSessionQueryRequest setAcidList(java.util.List<String> acidList) {
        this.acidList = acidList;
        return this;
    }
    public java.util.List<String> getAcidList() {
        return this.acidList;
    }

    public HotlineSessionQueryRequest setCallTypeList(java.util.List<Integer> callTypeList) {
        this.callTypeList = callTypeList;
        return this;
    }
    public java.util.List<Integer> getCallTypeList() {
        return this.callTypeList;
    }

    public HotlineSessionQueryRequest setGroupIdList(java.util.List<Long> groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public java.util.List<Long> getGroupIdList() {
        return this.groupIdList;
    }

    public HotlineSessionQueryRequest setCallingNumberList(java.util.List<String> callingNumberList) {
        this.callingNumberList = callingNumberList;
        return this;
    }
    public java.util.List<String> getCallingNumberList() {
        return this.callingNumberList;
    }

    public HotlineSessionQueryRequest setCalledNumberList(java.util.List<String> calledNumberList) {
        this.calledNumberList = calledNumberList;
        return this;
    }
    public java.util.List<String> getCalledNumberList() {
        return this.calledNumberList;
    }

    public HotlineSessionQueryRequest setMemberIdList(java.util.List<String> memberIdList) {
        this.memberIdList = memberIdList;
        return this;
    }
    public java.util.List<String> getMemberIdList() {
        return this.memberIdList;
    }

    public HotlineSessionQueryRequest setServicerIdList(java.util.List<String> servicerIdList) {
        this.servicerIdList = servicerIdList;
        return this;
    }
    public java.util.List<String> getServicerIdList() {
        return this.servicerIdList;
    }

    public HotlineSessionQueryRequest setCallResultList(java.util.List<String> callResultList) {
        this.callResultList = callResultList;
        return this;
    }
    public java.util.List<String> getCallResultList() {
        return this.callResultList;
    }

}
