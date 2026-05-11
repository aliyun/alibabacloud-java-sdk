// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ImportQos extends TeaModel {
    /**
     * <p>The maximum bandwidth. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("MaxBandWidth")
    public Long maxBandWidth;

    /**
     * <p>The number of files that are migrated per second.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxImportTaskQps")
    public Long maxImportTaskQps;

    public static ImportQos build(java.util.Map<String, ?> map) throws Exception {
        ImportQos self = new ImportQos();
        return TeaModel.build(map, self);
    }

    public ImportQos setMaxBandWidth(Long maxBandWidth) {
        this.maxBandWidth = maxBandWidth;
        return this;
    }
    public Long getMaxBandWidth() {
        return this.maxBandWidth;
    }

    public ImportQos setMaxImportTaskQps(Long maxImportTaskQps) {
        this.maxImportTaskQps = maxImportTaskQps;
        return this;
    }
    public Long getMaxImportTaskQps() {
        return this.maxImportTaskQps;
    }

}
