// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class RenameBlockchainRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("NewName")
    public String newName;

    public static RenameBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameBlockchainRequest self = new RenameBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public RenameBlockchainRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public RenameBlockchainRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

}
