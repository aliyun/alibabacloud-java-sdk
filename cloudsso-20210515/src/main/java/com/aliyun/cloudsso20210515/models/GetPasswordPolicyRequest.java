// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetPasswordPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordPolicyRequest self = new GetPasswordPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPasswordPolicyRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
