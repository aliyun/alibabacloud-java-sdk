// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalAddressRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MsgNotify")
    public Boolean msgNotify;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("Source")
    public String source;

    @NameInMap("UrlInsecurityForce")
    public Boolean urlInsecurityForce;

    public static AddDirectionalAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalAddressRequest self = new AddDirectionalAddressRequest();
        return TeaModel.build(map, self);
    }

    public AddDirectionalAddressRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AddDirectionalAddressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public AddDirectionalAddressRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddDirectionalAddressRequest setMsgNotify(Boolean msgNotify) {
        this.msgNotify = msgNotify;
        return this;
    }
    public Boolean getMsgNotify() {
        return this.msgNotify;
    }

    public AddDirectionalAddressRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public AddDirectionalAddressRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddDirectionalAddressRequest setUrlInsecurityForce(Boolean urlInsecurityForce) {
        this.urlInsecurityForce = urlInsecurityForce;
        return this;
    }
    public Boolean getUrlInsecurityForce() {
        return this.urlInsecurityForce;
    }

}
