// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDsMenusRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 1-正式环境，2-测试环境（默认）
    @NameInMap("RobotEnv")
    public Integer robotEnv;

    // 业务来源标识：
    // 1-集团内部aliyun域名；2-外部使用4service域名（默认）
    @NameInMap("Source")
    public Integer source;

    // 功能标识，为空表示所有；支持的tag有：Dialog / Intent / Entity / Var / TaskCenter；传入多个时通过英文逗号分隔
    @NameInMap("Tags")
    public String tags;

    public static ListDsMenusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDsMenusRequest self = new ListDsMenusRequest();
        return TeaModel.build(map, self);
    }

    public ListDsMenusRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListDsMenusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDsMenusRequest setRobotEnv(Integer robotEnv) {
        this.robotEnv = robotEnv;
        return this;
    }
    public Integer getRobotEnv() {
        return this.robotEnv;
    }

    public ListDsMenusRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public ListDsMenusRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
