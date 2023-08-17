// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class IsvGetAppIdRequest extends TeaModel {
    /**
     * <p>The type of the application. Set the value to WHATSAPP.</p>
     */
    @NameInMap("Type")
    public String type;

    public static IsvGetAppIdRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvGetAppIdRequest self = new IsvGetAppIdRequest();
        return TeaModel.build(map, self);
    }

    public IsvGetAppIdRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
