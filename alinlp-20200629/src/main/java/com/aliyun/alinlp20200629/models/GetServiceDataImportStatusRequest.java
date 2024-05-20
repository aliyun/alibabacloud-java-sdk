// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetServiceDataImportStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataImportIds")
    public java.util.List<Long> dataImportIds;

    public static GetServiceDataImportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDataImportStatusRequest self = new GetServiceDataImportStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceDataImportStatusRequest setDataImportIds(java.util.List<Long> dataImportIds) {
        this.dataImportIds = dataImportIds;
        return this;
    }
    public java.util.List<Long> getDataImportIds() {
        return this.dataImportIds;
    }

}
