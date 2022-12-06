// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class DeleteDirectionalAddressRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MsgNotify")
    public Boolean msgNotify;

    @NameInMap("SerialNo")
    public String serialNo;

    public static DeleteDirectionalAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectionalAddressRequest self = new DeleteDirectionalAddressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDirectionalAddressRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DeleteDirectionalAddressRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteDirectionalAddressRequest setMsgNotify(Boolean msgNotify) {
        this.msgNotify = msgNotify;
        return this;
    }
    public Boolean getMsgNotify() {
        return this.msgNotify;
    }

    public DeleteDirectionalAddressRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
