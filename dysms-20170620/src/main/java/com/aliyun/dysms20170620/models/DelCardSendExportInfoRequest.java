// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DelCardSendExportInfoRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static DelCardSendExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DelCardSendExportInfoRequest self = new DelCardSendExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DelCardSendExportInfoRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
