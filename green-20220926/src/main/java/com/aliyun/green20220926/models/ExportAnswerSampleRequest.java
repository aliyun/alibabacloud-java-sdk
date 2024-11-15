// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportAnswerSampleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>alxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ExportAnswerSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportAnswerSampleRequest self = new ExportAnswerSampleRequest();
        return TeaModel.build(map, self);
    }

    public ExportAnswerSampleRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ExportAnswerSampleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
