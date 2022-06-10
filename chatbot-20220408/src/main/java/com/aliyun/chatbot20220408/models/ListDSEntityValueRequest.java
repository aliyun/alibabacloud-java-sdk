// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDSEntityValueRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 实体ID
    @NameInMap("EntityId")
    public Long entityId;

    // 实体成员ID
    @NameInMap("EntityValueId")
    public Long entityValueId;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实体成员名称搜索关键词
    @NameInMap("Keyword")
    public String keyword;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDSEntityValueRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDSEntityValueRequest self = new ListDSEntityValueRequest();
        return TeaModel.build(map, self);
    }

    public ListDSEntityValueRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListDSEntityValueRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public ListDSEntityValueRequest setEntityValueId(Long entityValueId) {
        this.entityValueId = entityValueId;
        return this;
    }
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    public ListDSEntityValueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDSEntityValueRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDSEntityValueRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDSEntityValueRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
