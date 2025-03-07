// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingGroupResponseBody extends TeaModel {
    /**
     * <p>The packaging group information.</p>
     */
    @NameInMap("PackagingGroup")
    public VodPackagingGroup packagingGroup;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVodPackagingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingGroupResponseBody self = new CreateVodPackagingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingGroupResponseBody setPackagingGroup(VodPackagingGroup packagingGroup) {
        this.packagingGroup = packagingGroup;
        return this;
    }
    public VodPackagingGroup getPackagingGroup() {
        return this.packagingGroup;
    }

    public CreateVodPackagingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
