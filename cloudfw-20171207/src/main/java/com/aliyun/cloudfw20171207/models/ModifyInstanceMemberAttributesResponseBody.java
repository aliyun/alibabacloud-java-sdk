// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyInstanceMemberAttributesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AB74E747-BA5C-492C-87DD-CEA67FCFFFE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceMemberAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMemberAttributesResponseBody self = new ModifyInstanceMemberAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMemberAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
