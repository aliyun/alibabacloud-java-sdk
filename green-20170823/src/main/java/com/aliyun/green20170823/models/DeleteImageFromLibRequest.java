// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteImageFromLibRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteImageFromLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageFromLibRequest self = new DeleteImageFromLibRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageFromLibRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteImageFromLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
