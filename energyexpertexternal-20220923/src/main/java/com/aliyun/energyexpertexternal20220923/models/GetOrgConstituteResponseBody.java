// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetOrgConstituteResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public OrgEmission data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetOrgConstituteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrgConstituteResponseBody self = new GetOrgConstituteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrgConstituteResponseBody setData(OrgEmission data) {
        this.data = data;
        return this;
    }
    public OrgEmission getData() {
        return this.data;
    }

    public GetOrgConstituteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
