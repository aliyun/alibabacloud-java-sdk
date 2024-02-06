// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteVSwitchRequest extends TeaModel {
    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DeleteVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchRequest self = new DeleteVSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
