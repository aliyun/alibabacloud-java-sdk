// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class CreateChannelSignRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("channelName")
    public String channelName;

    @NameInMap("contact")
    public String contact;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>13555555555</p>
     */
    @NameInMap("phone")
    public String phone;

    @NameInMap("remark")
    public String remark;

    public static CreateChannelSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelSignRequest self = new CreateChannelSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateChannelSignRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateChannelSignRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public CreateChannelSignRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateChannelSignRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateChannelSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
