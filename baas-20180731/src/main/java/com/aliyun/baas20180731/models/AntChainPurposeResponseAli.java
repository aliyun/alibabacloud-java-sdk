// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AntChainPurposeResponseAli extends TeaModel {
    @NameInMap("RecordList")
    public java.util.List<ChainPurposeInfoAli> recordList;

    @NameInMap("Status")
    public String status;

    public static AntChainPurposeResponseAli build(java.util.Map<String, ?> map) throws Exception {
        AntChainPurposeResponseAli self = new AntChainPurposeResponseAli();
        return TeaModel.build(map, self);
    }

    public AntChainPurposeResponseAli setRecordList(java.util.List<ChainPurposeInfoAli> recordList) {
        this.recordList = recordList;
        return this;
    }
    public java.util.List<ChainPurposeInfoAli> getRecordList() {
        return this.recordList;
    }

    public AntChainPurposeResponseAli setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
