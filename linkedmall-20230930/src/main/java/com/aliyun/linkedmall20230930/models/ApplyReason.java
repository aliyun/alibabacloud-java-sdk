// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ApplyReason extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>403769</p>
     */
    @NameInMap("reasonTextId")
    public Long reasonTextId;

    /**
     * <strong>example:</strong>
     * <p>不想要了</p>
     */
    @NameInMap("reasonTips")
    public String reasonTips;

    public static ApplyReason build(java.util.Map<String, ?> map) throws Exception {
        ApplyReason self = new ApplyReason();
        return TeaModel.build(map, self);
    }

    public ApplyReason setReasonTextId(Long reasonTextId) {
        this.reasonTextId = reasonTextId;
        return this;
    }
    public Long getReasonTextId() {
        return this.reasonTextId;
    }

    public ApplyReason setReasonTips(String reasonTips) {
        this.reasonTips = reasonTips;
        return this;
    }
    public String getReasonTips() {
        return this.reasonTips;
    }

}
