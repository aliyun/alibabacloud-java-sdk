// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchAuthenticationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af145gfc-1108-4d55-8fca-f719bd512ebb</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    /**
     * <strong>example:</strong>
     * <p>ACC-YUNBS-1.0.10-****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static LaunchAuthenticationRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchAuthenticationRequest self = new LaunchAuthenticationRequest();
        return TeaModel.build(map, self);
    }

    public LaunchAuthenticationRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public LaunchAuthenticationRequest setContactFlowVariables(String contactFlowVariables) {
        this.contactFlowVariables = contactFlowVariables;
        return this;
    }
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

    public LaunchAuthenticationRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public LaunchAuthenticationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LaunchAuthenticationRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public LaunchAuthenticationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
