// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterShareReceiversRequest extends TeaModel {
    @NameInMap("addedReceivers")
    public java.util.List<String> addedReceivers;

    @NameInMap("removedReceivers")
    public java.util.List<String> removedReceivers;

    public static AlterShareReceiversRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterShareReceiversRequest self = new AlterShareReceiversRequest();
        return TeaModel.build(map, self);
    }

    public AlterShareReceiversRequest setAddedReceivers(java.util.List<String> addedReceivers) {
        this.addedReceivers = addedReceivers;
        return this;
    }
    public java.util.List<String> getAddedReceivers() {
        return this.addedReceivers;
    }

    public AlterShareReceiversRequest setRemovedReceivers(java.util.List<String> removedReceivers) {
        this.removedReceivers = removedReceivers;
        return this;
    }
    public java.util.List<String> getRemovedReceivers() {
        return this.removedReceivers;
    }

}
