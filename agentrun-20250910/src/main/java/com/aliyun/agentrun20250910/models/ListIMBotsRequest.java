// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListIMBotsRequest extends TeaModel {
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    @NameInMap("botBizType")
    public String botBizType;

    @NameInMap("botName")
    public String botName;

    /**
     * <p>默认 1；传入时须 ≥ 1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>默认 20；传入时须 1–100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

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
