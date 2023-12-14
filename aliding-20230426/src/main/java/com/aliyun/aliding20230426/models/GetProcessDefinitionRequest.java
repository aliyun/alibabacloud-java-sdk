// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetProcessDefinitionRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Language")
    public String language;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("OrderNumber")
    public String orderNumber;

    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("SystemToken")
    public String systemToken;

    @NameInMap("SystemType")
    public String systemType;

    public static GetProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProcessDefinitionRequest self = new GetProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public GetProcessDefinitionRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetProcessDefinitionRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetProcessDefinitionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetProcessDefinitionRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetProcessDefinitionRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetProcessDefinitionRequest setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public GetProcessDefinitionRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public GetProcessDefinitionRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public GetProcessDefinitionRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

}
