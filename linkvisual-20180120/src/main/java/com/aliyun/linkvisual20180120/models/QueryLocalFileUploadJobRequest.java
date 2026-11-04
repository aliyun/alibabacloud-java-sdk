// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLocalFileUploadJobRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console. If the instance has an ID, you must specify this ID. Otherwise, the call fails.</p>
     * <blockquote>
     * <p>If the public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">Obtain an instance ID</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y59****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the local video recording upload task. The task is created by calling <a href="https://help.aliyun.com/document_detail/363002.html">CreateLocalFileUploadJob</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ec1a<strong><strong>5d0435fbc0</strong></strong>34f6f139d</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static QueryLocalFileUploadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLocalFileUploadJobRequest self = new QueryLocalFileUploadJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryLocalFileUploadJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryLocalFileUploadJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
