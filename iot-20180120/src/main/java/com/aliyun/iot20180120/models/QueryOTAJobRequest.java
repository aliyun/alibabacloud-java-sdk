// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAJobRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch.</p>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> API operation to create the update batch, you can obtain the <strong>JobId</strong> parameter. You can also view the batch ID on the <strong>Update Package Details</strong> page of the IoT Platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wahVIzGkCMuAUE2gDERM02****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static QueryOTAJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAJobRequest self = new QueryOTAJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryOTAJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryOTAJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
