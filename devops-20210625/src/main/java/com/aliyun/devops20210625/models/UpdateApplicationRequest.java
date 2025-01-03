// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1332695887xxxxxx</p>
     */
    @NameInMap("ownerAccountId")
    public String ownerAccountId;

    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRequest self = new UpdateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRequest setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public UpdateApplicationRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
