// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("AntChainName")
    public String antChainName;

    public static UpdateAntChainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainRequest self = new UpdateAntChainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateAntChainRequest setAntChainName(String antChainName) {
        this.antChainName = antChainName;
        return this;
    }
    public String getAntChainName() {
        return this.antChainName;
    }

}
