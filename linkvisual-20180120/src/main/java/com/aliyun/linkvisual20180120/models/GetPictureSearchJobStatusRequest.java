// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureSearchJobStatusRequest extends TeaModel {
    /**
     * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>892f97c9518548469d319d955d98****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The ID of the image search task. You can call the <a href="https://help.aliyun.com/document_detail/206778.html">QueryPictureSearchJob</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3786935a71442efae014c7b2212****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetPictureSearchJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchJobStatusRequest self = new GetPictureSearchJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchJobStatusRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public GetPictureSearchJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
