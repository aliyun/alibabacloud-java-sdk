// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CloseMergeRequestRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0cf2c8458ac44d9481aab2dd6ec10596v3</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ebbc0228123212b59xxxxx</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CloseMergeRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseMergeRequestRequest self = new CloseMergeRequestRequest();
        return TeaModel.build(map, self);
    }

    public CloseMergeRequestRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CloseMergeRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
