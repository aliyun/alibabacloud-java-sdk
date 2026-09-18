// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationsRequest extends TeaModel {
    /**
     * <p>The pagination cursor for notification channels. Do not specify this parameter for the first query. For subsequent queries, pass in the value of Data.AutomationOverview.Destinations.NextCursor from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DestinationCursor")
    public String destinationCursor;

    /**
     * <p>The number of entries per page for the notification channel list. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DestinationPageSize")
    public Integer destinationPageSize;

    /**
     * <p>Specifies whether to return the overview of scheduled tasks and notification channels for the account. A value of true indicates that the overview is returned. If this parameter is not specified, the overview is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeAutomationOverview")
    public Boolean includeAutomationOverview;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

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
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The pagination cursor. Do not specify this parameter for the first query. For subsequent queries, pass in the value of Data.AutomationOverview.Tasks.NextCursor from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskCursor")
    public String taskCursor;

    /**
     * <p>The number of entries per page for the scheduled task list. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TaskPageSize")
    public Integer taskPageSize;

    public static KopilotListConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationsRequest self = new KopilotListConversationsRequest();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationsRequest setDestinationCursor(String destinationCursor) {
        this.destinationCursor = destinationCursor;
        return this;
    }
    public String getDestinationCursor() {
        return this.destinationCursor;
    }

    public KopilotListConversationsRequest setDestinationPageSize(Integer destinationPageSize) {
        this.destinationPageSize = destinationPageSize;
        return this;
    }
    public Integer getDestinationPageSize() {
        return this.destinationPageSize;
    }

    public KopilotListConversationsRequest setIncludeAutomationOverview(Boolean includeAutomationOverview) {
        this.includeAutomationOverview = includeAutomationOverview;
        return this;
    }
    public Boolean getIncludeAutomationOverview() {
        return this.includeAutomationOverview;
    }

    public KopilotListConversationsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public KopilotListConversationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public KopilotListConversationsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public KopilotListConversationsRequest setTaskCursor(String taskCursor) {
        this.taskCursor = taskCursor;
        return this;
    }
    public String getTaskCursor() {
        return this.taskCursor;
    }

    public KopilotListConversationsRequest setTaskPageSize(Integer taskPageSize) {
        this.taskPageSize = taskPageSize;
        return this;
    }
    public Integer getTaskPageSize() {
        return this.taskPageSize;
    }

}
