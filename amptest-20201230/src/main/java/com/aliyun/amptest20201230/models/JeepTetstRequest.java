// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class JeepTetstRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    public static JeepTetstRequest build(java.util.Map<String, ?> map) throws Exception {
        JeepTetstRequest self = new JeepTetstRequest();
        return TeaModel.build(map, self);
    }

    public JeepTetstRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
