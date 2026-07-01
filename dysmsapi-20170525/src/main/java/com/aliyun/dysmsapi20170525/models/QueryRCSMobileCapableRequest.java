// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRCSMobileCapableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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

    public static QueryRCSMobileCapableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRCSMobileCapableRequest self = new QueryRCSMobileCapableRequest();
        return TeaModel.build(map, self);
    }

    public QueryRCSMobileCapableRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public QueryRCSMobileCapableRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QueryRCSMobileCapableRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
