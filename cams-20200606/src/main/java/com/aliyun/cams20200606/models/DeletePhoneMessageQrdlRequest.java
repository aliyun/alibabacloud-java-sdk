// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeletePhoneMessageQrdlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>883873773</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861380000</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29338838</p>
     */
    @NameInMap("QrdlCode")
    public String qrdlCode;

    public static DeletePhoneMessageQrdlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneMessageQrdlRequest self = new DeletePhoneMessageQrdlRequest();
        return TeaModel.build(map, self);
    }

    public DeletePhoneMessageQrdlRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeletePhoneMessageQrdlRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public DeletePhoneMessageQrdlRequest setQrdlCode(String qrdlCode) {
        this.qrdlCode = qrdlCode;
        return this;
    }
    public String getQrdlCode() {
        return this.qrdlCode;
    }

}
