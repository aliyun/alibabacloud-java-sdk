// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAccessControlListResponseBody extends TeaModel {
    /**
     * <p>The ID of the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-bp1uqwgwmkbutnzq2r59z</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessControlListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListResponseBody self = new CreateAccessControlListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateAccessControlListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
