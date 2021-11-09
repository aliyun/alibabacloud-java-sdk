// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPositionRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NewOrder")
    public String newOrder;

    @NameInMap("OldOrder")
    public String oldOrder;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyControlPolicyPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPositionRequest self = new ModifyControlPolicyPositionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPositionRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyControlPolicyPositionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyControlPolicyPositionRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public ModifyControlPolicyPositionRequest setOldOrder(String oldOrder) {
        this.oldOrder = oldOrder;
        return this;
    }
    public String getOldOrder() {
        return this.oldOrder;
    }

    public ModifyControlPolicyPositionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
