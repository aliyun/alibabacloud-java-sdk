// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteEdgeMachineRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully delete the cloud-native box. Valid values:</p>
     * <br>
     * <p>*   `true`: forcefully deletes the cloud-native box.</p>
     * <p>*   `false`: does not forcefully delete the cloud-native box.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("force")
    public String force;

    public static DeleteEdgeMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeMachineRequest self = new DeleteEdgeMachineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeMachineRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

}
