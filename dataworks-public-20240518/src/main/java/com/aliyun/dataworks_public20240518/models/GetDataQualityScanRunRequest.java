// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRunRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1006059507</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetDataQualityScanRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanRunRequest self = new GetDataQualityScanRunRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanRunRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
