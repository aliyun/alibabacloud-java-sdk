// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationChatMessagesRequest extends TeaModel {
    /**
     * <p>The cursor.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the last pageSize turn IDs are returned. If this parameter is specified, the turn IDs before the specified turn ID are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2345</p>
     */
    @NameInMap("BeforeTurnId")
    public Integer beforeTurnId;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e356c91c-8220-425c-9d86-********</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The pagination cursor. Do not specify this parameter for the first query. For subsequent queries, pass in the value of Data.ScheduledTaskInfo.NextTaskCursor from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskCursor")
    public String taskCursor;

    /**
     * <p>The number of scheduled tasks per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TaskPageSize")
    public Integer taskPageSize;

    public static KopilotListConversationChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationChatMessagesRequest self = new KopilotListConversationChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationChatMessagesRequest setBeforeTurnId(Integer beforeTurnId) {
        this.beforeTurnId = beforeTurnId;
        return this;
    }
    public Integer getBeforeTurnId() {
        return this.beforeTurnId;
    }

    public KopilotListConversationChatMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public KopilotListConversationChatMessagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public KopilotListConversationChatMessagesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public KopilotListConversationChatMessagesRequest setTaskCursor(String taskCursor) {
        this.taskCursor = taskCursor;
        return this;
    }
    public String getTaskCursor() {
        return this.taskCursor;
    }

    public KopilotListConversationChatMessagesRequest setTaskPageSize(Integer taskPageSize) {
        this.taskPageSize = taskPageSize;
        return this;
    }
    public Integer getTaskPageSize() {
        return this.taskPageSize;
    }

}
