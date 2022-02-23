// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryDialogsRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogName")
    public String dialogName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryDialogsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDialogsRequest self = new QueryDialogsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDialogsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryDialogsRequest setDialogName(String dialogName) {
        this.dialogName = dialogName;
        return this;
    }
    public String getDialogName() {
        return this.dialogName;
    }

    public QueryDialogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDialogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDialogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
