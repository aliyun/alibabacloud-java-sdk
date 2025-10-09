// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRequest extends TeaModel {
    /**
     * <p>The ID of the monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetDataQualityScanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanRequest self = new GetDataQualityScanRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
