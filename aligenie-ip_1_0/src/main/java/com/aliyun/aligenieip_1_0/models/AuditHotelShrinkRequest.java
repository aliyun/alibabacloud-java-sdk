// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AuditHotelShrinkRequest extends TeaModel {
    @NameInMap("AuditHotelReq")
    public String auditHotelReqShrink;

    public static AuditHotelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditHotelShrinkRequest self = new AuditHotelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AuditHotelShrinkRequest setAuditHotelReqShrink(String auditHotelReqShrink) {
        this.auditHotelReqShrink = auditHotelReqShrink;
        return this;
    }
    public String getAuditHotelReqShrink() {
        return this.auditHotelReqShrink;
    }

}
