// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the packaging group.</p>
     */
    @NameInMap("PackagingGroup")
    public VodPackagingGroup packagingGroup;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVodPackagingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingGroupResponseBody self = new GetVodPackagingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingGroupResponseBody setPackagingGroup(VodPackagingGroup packagingGroup) {
        this.packagingGroup = packagingGroup;
        return this;
    }
    public VodPackagingGroup getPackagingGroup() {
        return this.packagingGroup;
    }

    public GetVodPackagingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
