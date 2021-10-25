// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class EcdDeleteDesktopsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    public static EcdDeleteDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        EcdDeleteDesktopsRequest self = new EcdDeleteDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public EcdDeleteDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

}
