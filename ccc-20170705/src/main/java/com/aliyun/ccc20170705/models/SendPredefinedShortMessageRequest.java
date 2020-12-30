// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SendPredefinedShortMessageRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("TemplateParam")
    public String templateParam;

    public static SendPredefinedShortMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendPredefinedShortMessageRequest self = new SendPredefinedShortMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendPredefinedShortMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendPredefinedShortMessageRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendPredefinedShortMessageRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SendPredefinedShortMessageRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

}
