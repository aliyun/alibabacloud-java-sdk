// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateParameterSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>136B3926-DD90-5DB2-96EC-8BAD6407D1C9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DissociateParameterSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateParameterSetResponseBody self = new DissociateParameterSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateParameterSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
