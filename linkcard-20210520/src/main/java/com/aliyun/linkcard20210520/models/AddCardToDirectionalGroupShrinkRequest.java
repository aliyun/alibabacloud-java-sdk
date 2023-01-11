// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddCardToDirectionalGroupShrinkRequest extends TeaModel {
    @NameInMap("AddType")
    public String addType;

    /**
     * <p>Linkcard</p>
     */
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IccidList")
    public String iccidListShrink;

    @NameInMap("MsgNotify")
    public Boolean msgNotify;

    @NameInMap("SerialNo")
    public String serialNo;

    public static AddCardToDirectionalGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCardToDirectionalGroupShrinkRequest self = new AddCardToDirectionalGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCardToDirectionalGroupShrinkRequest setAddType(String addType) {
        this.addType = addType;
        return this;
    }
    public String getAddType() {
        return this.addType;
    }

    public AddCardToDirectionalGroupShrinkRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public AddCardToDirectionalGroupShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddCardToDirectionalGroupShrinkRequest setIccidListShrink(String iccidListShrink) {
        this.iccidListShrink = iccidListShrink;
        return this;
    }
    public String getIccidListShrink() {
        return this.iccidListShrink;
    }

    public AddCardToDirectionalGroupShrinkRequest setMsgNotify(Boolean msgNotify) {
        this.msgNotify = msgNotify;
        return this;
    }
    public Boolean getMsgNotify() {
        return this.msgNotify;
    }

    public AddCardToDirectionalGroupShrinkRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
