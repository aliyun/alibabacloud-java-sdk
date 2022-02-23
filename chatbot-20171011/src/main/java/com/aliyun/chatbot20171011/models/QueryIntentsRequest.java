// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryIntentsRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("IntentName")
    public String intentName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryIntentsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentsRequest self = new QueryIntentsRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntentsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryIntentsRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public QueryIntentsRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public QueryIntentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryIntentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
