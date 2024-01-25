// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CheckLogRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static CheckLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLogRequest self = new CheckLogRequest();
        return TeaModel.build(map, self);
    }

    public CheckLogRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CheckLogRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
