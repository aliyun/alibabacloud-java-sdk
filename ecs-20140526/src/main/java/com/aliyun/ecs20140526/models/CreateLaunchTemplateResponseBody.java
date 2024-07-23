// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-m5eiaupmvm2op9d****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version number of the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LaunchTemplateVersionNumber")
    public Long launchTemplateVersionNumber;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLaunchTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateResponseBody self = new CreateLaunchTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateResponseBody setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateLaunchTemplateResponseBody setLaunchTemplateVersionNumber(Long launchTemplateVersionNumber) {
        this.launchTemplateVersionNumber = launchTemplateVersionNumber;
        return this;
    }
    public Long getLaunchTemplateVersionNumber() {
        return this.launchTemplateVersionNumber;
    }

    public CreateLaunchTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
