// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterEcrAttachmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0245BEF-52AC-44A8-A776-EF96FD26A5CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the ECR connection.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-qieks13jnt1cchy***</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static CreateTransitRouterEcrAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterEcrAttachmentResponseBody self = new CreateTransitRouterEcrAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterEcrAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterEcrAttachmentResponseBody setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
