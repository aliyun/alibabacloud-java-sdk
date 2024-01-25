// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetLogSampleColumnRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetLogSampleColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogSampleColumnRequest self = new GetLogSampleColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetLogSampleColumnRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public GetLogSampleColumnRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
