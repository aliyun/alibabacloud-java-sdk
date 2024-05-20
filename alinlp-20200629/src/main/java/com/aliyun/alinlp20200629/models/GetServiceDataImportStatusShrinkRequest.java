// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetServiceDataImportStatusShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataImportIds")
    public String dataImportIdsShrink;

    public static GetServiceDataImportStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDataImportStatusShrinkRequest self = new GetServiceDataImportStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceDataImportStatusShrinkRequest setDataImportIdsShrink(String dataImportIdsShrink) {
        this.dataImportIdsShrink = dataImportIdsShrink;
        return this;
    }
    public String getDataImportIdsShrink() {
        return this.dataImportIdsShrink;
    }

}
