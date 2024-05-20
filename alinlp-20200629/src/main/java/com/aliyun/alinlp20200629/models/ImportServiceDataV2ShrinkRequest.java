// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ImportServiceDataV2ShrinkRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    public static ImportServiceDataV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportServiceDataV2ShrinkRequest self = new ImportServiceDataV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportServiceDataV2ShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ImportServiceDataV2ShrinkRequest setDocumentsShrink(String documentsShrink) {
        this.documentsShrink = documentsShrink;
        return this;
    }
    public String getDocumentsShrink() {
        return this.documentsShrink;
    }

    public ImportServiceDataV2ShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
