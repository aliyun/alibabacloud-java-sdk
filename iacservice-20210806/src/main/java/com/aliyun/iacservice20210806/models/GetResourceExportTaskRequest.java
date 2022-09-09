// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceExportTaskRequest extends TeaModel {
    @NameInMap("exportVersion")
    public String exportVersion;

    public static GetResourceExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceExportTaskRequest self = new GetResourceExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceExportTaskRequest setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

}
