// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRunLogRequest extends TeaModel {
    /**
     * <p>The ID of the data quality monitor run record.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The starting position of the log, in bytes, relative to the beginning of the file. Each query returns a maximum of 512 KB of content.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Offset")
    public Long offset;

    public static GetDataQualityScanRunLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanRunLogRequest self = new GetDataQualityScanRunLogRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanRunLogRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDataQualityScanRunLogRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
