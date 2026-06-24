// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddSnapshotRepoRequest extends TeaModel {
    /**
     * <p>The cross-cluster backup information, which specifies the reference instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;repoPath&quot; :&quot;es-cn-4591jumei000u****&quot;
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static AddSnapshotRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSnapshotRepoRequest self = new AddSnapshotRepoRequest();
        return TeaModel.build(map, self);
    }

    public AddSnapshotRepoRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
