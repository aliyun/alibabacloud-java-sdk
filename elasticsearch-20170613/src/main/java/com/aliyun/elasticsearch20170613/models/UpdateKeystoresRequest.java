// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKeystoresRequest extends TeaModel {
    /**
     * <p>Delete keystore configuration</p>
     */
    @NameInMap("remove")
    public java.util.List<String> remove;

    /**
     * <p>Add or update keystore</p>
     */
    @NameInMap("update")
    public java.util.Map<String, String> update;

    /**
     * <p>Whether to force the change. false: non-forced, true: forced</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("force")
    public String force;

    public static UpdateKeystoresRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeystoresRequest self = new UpdateKeystoresRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKeystoresRequest setRemove(java.util.List<String> remove) {
        this.remove = remove;
        return this;
    }
    public java.util.List<String> getRemove() {
        return this.remove;
    }

    public UpdateKeystoresRequest setUpdate(java.util.Map<String, String> update) {
        this.update = update;
        return this;
    }
    public java.util.Map<String, String> getUpdate() {
        return this.update;
    }

    public UpdateKeystoresRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

}
