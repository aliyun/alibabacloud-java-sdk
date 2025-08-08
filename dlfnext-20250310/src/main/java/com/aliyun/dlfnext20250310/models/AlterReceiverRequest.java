// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterReceiverRequest extends TeaModel {
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>receiver_name</p>
     */
    @NameInMap("receiverName")
    public String receiverName;

    public static AlterReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterReceiverRequest self = new AlterReceiverRequest();
        return TeaModel.build(map, self);
    }

    public AlterReceiverRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AlterReceiverRequest setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

}
