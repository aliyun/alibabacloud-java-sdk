// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTAStrategyByJobRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch.</p>
     * <br>
     * <p>After you call the [CreateOTADynamicUpgradeJob](~~147887~~) operation to create an update batch, the **JobId** parameter is returned. You can also view the batch ID on the **Firmware Details** page of the IoT Platform console.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static CancelOTAStrategyByJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOTAStrategyByJobRequest self = new CancelOTAStrategyByJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelOTAStrategyByJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelOTAStrategyByJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
