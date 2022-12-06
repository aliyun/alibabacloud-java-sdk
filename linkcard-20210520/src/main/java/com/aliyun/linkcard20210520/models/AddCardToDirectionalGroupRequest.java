// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddCardToDirectionalGroupRequest extends TeaModel {
    @NameInMap("AddType")
    public String addType;

    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IccidList")
    public java.util.List<String> iccidList;

    @NameInMap("MsgNotify")
    public Boolean msgNotify;

    @NameInMap("SerialNo")
    public String serialNo;

    public static AddCardToDirectionalGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCardToDirectionalGroupRequest self = new AddCardToDirectionalGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddCardToDirectionalGroupRequest setAddType(String addType) {
        this.addType = addType;
        return this;
    }
    public String getAddType() {
        return this.addType;
    }

    public AddCardToDirectionalGroupRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public AddCardToDirectionalGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddCardToDirectionalGroupRequest setIccidList(java.util.List<String> iccidList) {
        this.iccidList = iccidList;
        return this;
    }
    public java.util.List<String> getIccidList() {
        return this.iccidList;
    }

    public AddCardToDirectionalGroupRequest setMsgNotify(Boolean msgNotify) {
        this.msgNotify = msgNotify;
        return this;
    }
    public Boolean getMsgNotify() {
        return this.msgNotify;
    }

    public AddCardToDirectionalGroupRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
