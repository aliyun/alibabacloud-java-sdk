// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenResponseBody extends TeaModel {
    /**
     * <p>The CEN instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-dc4vwznpwbobrl****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenResponseBody self = new CreateCenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
