// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EncryptPhoneNumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130****0000</p>
     */
    @NameInMap("PhoneNum")
    public String phoneNum;

    public static EncryptPhoneNumRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptPhoneNumRequest self = new EncryptPhoneNumRequest();
        return TeaModel.build(map, self);
    }

    public EncryptPhoneNumRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EncryptPhoneNumRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

}
