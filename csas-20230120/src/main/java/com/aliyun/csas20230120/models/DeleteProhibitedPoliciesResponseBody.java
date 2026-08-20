// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedPoliciesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0325E55E-BD76-5856-894F-65AEEF01E84B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProhibitedPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedPoliciesResponseBody self = new DeleteProhibitedPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
