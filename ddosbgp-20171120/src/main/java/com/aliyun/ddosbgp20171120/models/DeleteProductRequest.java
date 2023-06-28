// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DeleteProductRequest extends TeaModel {
    @NameInMap("PackId")
    public String packId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductRequest self = new DeleteProductRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public DeleteProductRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
