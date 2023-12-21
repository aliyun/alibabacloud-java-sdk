// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartReverseWriterRequest extends TeaModel {
    @NameInMap("CheckPoint")
    public String checkPoint;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    public static StartReverseWriterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartReverseWriterRequest self = new StartReverseWriterRequest();
        return TeaModel.build(map, self);
    }

    public StartReverseWriterRequest setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
        return this;
    }
    public String getCheckPoint() {
        return this.checkPoint;
    }

    public StartReverseWriterRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

}
