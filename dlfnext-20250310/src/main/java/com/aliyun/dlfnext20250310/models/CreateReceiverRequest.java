// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CreateReceiverRequest extends TeaModel {
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>receiver_name</p>
     */
    @NameInMap("receiverName")
    public String receiverName;

    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("receiverTenantId")
    public Long receiverTenantId;

    public static CreateReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReceiverRequest self = new CreateReceiverRequest();
        return TeaModel.build(map, self);
    }

    public CreateReceiverRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateReceiverRequest setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

    public CreateReceiverRequest setReceiverTenantId(Long receiverTenantId) {
        this.receiverTenantId = receiverTenantId;
        return this;
    }
    public Long getReceiverTenantId() {
        return this.receiverTenantId;
    }

}
