// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetSampleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withExtendParmas")
    public Boolean withExtendParmas;

    public static GetSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSampleRequest self = new GetSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetSampleRequest setWithExtendParmas(Boolean withExtendParmas) {
        this.withExtendParmas = withExtendParmas;
        return this;
    }
    public Boolean getWithExtendParmas() {
        return this.withExtendParmas;
    }

}
