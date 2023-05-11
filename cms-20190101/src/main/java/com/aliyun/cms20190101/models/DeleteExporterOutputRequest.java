// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterOutputRequest extends TeaModel {
    /**
     * <p>The name of the configuration set.</p>
     */
    @NameInMap("DestName")
    public String destName;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteExporterOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterOutputRequest self = new DeleteExporterOutputRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExporterOutputRequest setDestName(String destName) {
        this.destName = destName;
        return this;
    }
    public String getDestName() {
        return this.destName;
    }

    public DeleteExporterOutputRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
