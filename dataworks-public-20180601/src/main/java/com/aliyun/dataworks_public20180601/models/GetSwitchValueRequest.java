// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetSwitchValueRequest extends TeaModel {
    @NameInMap("SwitchName")
    public String switchName;

    public static GetSwitchValueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchValueRequest self = new GetSwitchValueRequest();
        return TeaModel.build(map, self);
    }

    public GetSwitchValueRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

}
