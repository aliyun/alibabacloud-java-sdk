// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartReverseWriterRequest extends TeaModel {
    /**
     * <p>The offset of the Incremental Write module. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. </p>
     * <br>
     * <p>> The default value is the offset that is automatically saved by DTS when the task is paused.</p>
     */
    @NameInMap("CheckPoint")
    public String checkPoint;

    /**
     * <p>The ID of the reverse task that was created by calling the CreateReverseDtsJob operation.</p>
     */
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
