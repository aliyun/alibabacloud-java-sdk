// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListIMBotsRequest extends TeaModel {
    /**
     * <p>The ID of the agent runtime.</p>
     */
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    /**
     * <p>The business type of the bot.</p>
     */
    @NameInMap("botBizType")
    public String botBizType;

    /**
     * <p>The name of the IM bot. The system performs a case-insensitive substring search.</p>
     */
    @NameInMap("botName")
    public String botName;

    /**
     * <p>The page number. Must be greater than or equal to 1. Default: 1.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1–100. Default: 20.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The status of the bot.</p>
     */
    @NameInMap("status")
    public String status;

    public static ListIMBotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIMBotsRequest self = new ListIMBotsRequest();
        return TeaModel.build(map, self);
    }

    public ListIMBotsRequest setAgentRuntimeId(String agentRuntimeId) {
        this.agentRuntimeId = agentRuntimeId;
        return this;
    }
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    public ListIMBotsRequest setBotBizType(String botBizType) {
        this.botBizType = botBizType;
        return this;
    }
    public String getBotBizType() {
        return this.botBizType;
    }

    public ListIMBotsRequest setBotName(String botName) {
        this.botName = botName;
        return this;
    }
    public String getBotName() {
        return this.botName;
    }

    public ListIMBotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIMBotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIMBotsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
