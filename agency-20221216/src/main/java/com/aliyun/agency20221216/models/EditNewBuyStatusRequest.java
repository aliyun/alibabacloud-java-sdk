// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditNewBuyStatusRequest extends TeaModel {
    @NameInMap("NewBuyStatus")
    public String newBuyStatus;

    @NameInMap("Uid")
    public Long uid;

    public static EditNewBuyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        EditNewBuyStatusRequest self = new EditNewBuyStatusRequest();
        return TeaModel.build(map, self);
    }

    public EditNewBuyStatusRequest setNewBuyStatus(String newBuyStatus) {
        this.newBuyStatus = newBuyStatus;
        return this;
    }
    public String getNewBuyStatus() {
        return this.newBuyStatus;
    }

    public EditNewBuyStatusRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
