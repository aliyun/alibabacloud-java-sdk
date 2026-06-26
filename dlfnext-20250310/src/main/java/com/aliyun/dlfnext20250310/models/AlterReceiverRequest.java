// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterReceiverRequest extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer A</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The name of the sink.</p>
     * 
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
