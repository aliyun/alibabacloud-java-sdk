// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketProductPublicationConifg extends TeaModel {
    @NameInMap("publicationId")
    public String publicationId;

    public static HiMarketProductPublicationConifg build(java.util.Map<String, ?> map) throws Exception {
        HiMarketProductPublicationConifg self = new HiMarketProductPublicationConifg();
        return TeaModel.build(map, self);
    }

    public HiMarketProductPublicationConifg setPublicationId(String publicationId) {
        this.publicationId = publicationId;
        return this;
    }
    public String getPublicationId() {
        return this.publicationId;
    }

}
