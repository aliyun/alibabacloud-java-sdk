// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class RemoveWhiteListSettingShrinkRequest extends TeaModel {
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static RemoveWhiteListSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWhiteListSettingShrinkRequest self = new RemoveWhiteListSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWhiteListSettingShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public RemoveWhiteListSettingShrinkRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
