// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDataVolumeRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetDataVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataVolumeRequest self = new GetDataVolumeRequest();
        return TeaModel.build(map, self);
    }

    public GetDataVolumeRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
