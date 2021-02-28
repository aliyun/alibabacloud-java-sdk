// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetConversationListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SenderId")
    public String senderId;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetConversationListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConversationListRequest self = new GetConversationListRequest();
        return TeaModel.build(map, self);
    }

    public GetConversationListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetConversationListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetConversationListRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public GetConversationListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetConversationListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetConversationListRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public GetConversationListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
