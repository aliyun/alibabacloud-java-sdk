// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadJobByIdRequest extends TeaModel {
    /**
     * <p>The instance ID. You can view the ID of the current instance on the <strong>Instance Overview</strong> tab in the IoT Platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Iot-r******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the cloud record download task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w2s******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static QueryRecordDownloadJobByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadJobByIdRequest self = new QueryRecordDownloadJobByIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadJobByIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryRecordDownloadJobByIdRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
