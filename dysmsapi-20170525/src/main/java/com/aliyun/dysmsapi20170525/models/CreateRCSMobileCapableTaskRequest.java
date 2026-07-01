// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRCSMobileCapableTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("PhoneNumbersFile")
    public String phoneNumbersFile;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static CreateRCSMobileCapableTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRCSMobileCapableTaskRequest self = new CreateRCSMobileCapableTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRCSMobileCapableTaskRequest setPhoneNumbersFile(String phoneNumbersFile) {
        this.phoneNumbersFile = phoneNumbersFile;
        return this;
    }
    public String getPhoneNumbersFile() {
        return this.phoneNumbersFile;
    }

    public CreateRCSMobileCapableTaskRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateRCSMobileCapableTaskRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
