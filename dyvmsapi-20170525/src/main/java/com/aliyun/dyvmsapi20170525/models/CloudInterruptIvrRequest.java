// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudInterruptIvrRequest extends TeaModel {
    /**
     * <p>根据变量名去通道变量中取对应的变量值</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("CheckName")
    public String checkName;

    /**
     * <p>当checkName代表的变量值与checkValue一致，才打断</p>
     * 
     * <strong>example:</strong>
     * <p>value1</p>
     */
    @NameInMap("CheckValue")
    public String checkValue;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>通话唯一标识；从通道唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    /**
     * <p>自定义字段；json字符串</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserField")
    public String userField;

    public static CloudInterruptIvrRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudInterruptIvrRequest self = new CloudInterruptIvrRequest();
        return TeaModel.build(map, self);
    }

    public CloudInterruptIvrRequest setCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }
    public String getCheckName() {
        return this.checkName;
    }

    public CloudInterruptIvrRequest setCheckValue(String checkValue) {
        this.checkValue = checkValue;
        return this;
    }
    public String getCheckValue() {
        return this.checkValue;
    }

    public CloudInterruptIvrRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudInterruptIvrRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CloudInterruptIvrRequest setUserField(String userField) {
        this.userField = userField;
        return this;
    }
    public String getUserField() {
        return this.userField;
    }

}
