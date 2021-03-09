// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTouchListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("FirstTimeStart")
    public Long firstTimeStart;

    @NameInMap("FirstTimeEnd")
    public Long firstTimeEnd;

    @NameInMap("CloseTimeStart")
    public Long closeTimeStart;

    @NameInMap("CloseTimeEnd")
    public Long closeTimeEnd;

    @NameInMap("TouchId")
    public java.util.List<Long> touchId;

    @NameInMap("ChannelId")
    public java.util.List<String> channelId;

    @NameInMap("ChannelType")
    public java.util.List<Integer> channelType;

    @NameInMap("TouchType")
    public java.util.List<Integer> touchType;

    @NameInMap("MemberId")
    public java.util.List<Long> memberId;

    @NameInMap("MemberName")
    public java.util.List<String> memberName;

    @NameInMap("ServicerId")
    public java.util.List<Long> servicerId;

    @NameInMap("ServicerName")
    public java.util.List<String> servicerName;

    @NameInMap("QueueId")
    public java.util.List<Long> queueId;

    @NameInMap("EvaluationStatus")
    public java.util.List<Integer> evaluationStatus;

    @NameInMap("EvaluationLevel")
    public java.util.List<Integer> evaluationLevel;

    @NameInMap("EvaluationScore")
    public java.util.List<Integer> evaluationScore;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryTouchListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTouchListRequest self = new QueryTouchListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTouchListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTouchListRequest setFirstTimeStart(Long firstTimeStart) {
        this.firstTimeStart = firstTimeStart;
        return this;
    }
    public Long getFirstTimeStart() {
        return this.firstTimeStart;
    }

    public QueryTouchListRequest setFirstTimeEnd(Long firstTimeEnd) {
        this.firstTimeEnd = firstTimeEnd;
        return this;
    }
    public Long getFirstTimeEnd() {
        return this.firstTimeEnd;
    }

    public QueryTouchListRequest setCloseTimeStart(Long closeTimeStart) {
        this.closeTimeStart = closeTimeStart;
        return this;
    }
    public Long getCloseTimeStart() {
        return this.closeTimeStart;
    }

    public QueryTouchListRequest setCloseTimeEnd(Long closeTimeEnd) {
        this.closeTimeEnd = closeTimeEnd;
        return this;
    }
    public Long getCloseTimeEnd() {
        return this.closeTimeEnd;
    }

    public QueryTouchListRequest setTouchId(java.util.List<Long> touchId) {
        this.touchId = touchId;
        return this;
    }
    public java.util.List<Long> getTouchId() {
        return this.touchId;
    }

    public QueryTouchListRequest setChannelId(java.util.List<String> channelId) {
        this.channelId = channelId;
        return this;
    }
    public java.util.List<String> getChannelId() {
        return this.channelId;
    }

    public QueryTouchListRequest setChannelType(java.util.List<Integer> channelType) {
        this.channelType = channelType;
        return this;
    }
    public java.util.List<Integer> getChannelType() {
        return this.channelType;
    }

    public QueryTouchListRequest setTouchType(java.util.List<Integer> touchType) {
        this.touchType = touchType;
        return this;
    }
    public java.util.List<Integer> getTouchType() {
        return this.touchType;
    }

    public QueryTouchListRequest setMemberId(java.util.List<Long> memberId) {
        this.memberId = memberId;
        return this;
    }
    public java.util.List<Long> getMemberId() {
        return this.memberId;
    }

    public QueryTouchListRequest setMemberName(java.util.List<String> memberName) {
        this.memberName = memberName;
        return this;
    }
    public java.util.List<String> getMemberName() {
        return this.memberName;
    }

    public QueryTouchListRequest setServicerId(java.util.List<Long> servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public java.util.List<Long> getServicerId() {
        return this.servicerId;
    }

    public QueryTouchListRequest setServicerName(java.util.List<String> servicerName) {
        this.servicerName = servicerName;
        return this;
    }
    public java.util.List<String> getServicerName() {
        return this.servicerName;
    }

    public QueryTouchListRequest setQueueId(java.util.List<Long> queueId) {
        this.queueId = queueId;
        return this;
    }
    public java.util.List<Long> getQueueId() {
        return this.queueId;
    }

    public QueryTouchListRequest setEvaluationStatus(java.util.List<Integer> evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
        return this;
    }
    public java.util.List<Integer> getEvaluationStatus() {
        return this.evaluationStatus;
    }

    public QueryTouchListRequest setEvaluationLevel(java.util.List<Integer> evaluationLevel) {
        this.evaluationLevel = evaluationLevel;
        return this;
    }
    public java.util.List<Integer> getEvaluationLevel() {
        return this.evaluationLevel;
    }

    public QueryTouchListRequest setEvaluationScore(java.util.List<Integer> evaluationScore) {
        this.evaluationScore = evaluationScore;
        return this;
    }
    public java.util.List<Integer> getEvaluationScore() {
        return this.evaluationScore;
    }

    public QueryTouchListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTouchListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
