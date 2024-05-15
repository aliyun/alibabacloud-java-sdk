// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the launch template. For more information, see [DescribeLaunchTemplates](https://help.aliyun.com/document_detail/73759.html).</p>
     * <br>
     * <p>You must specify `LaunchTemplateId` or `LaunchTemplateName` to specify a launch template.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version number of the launch template.</p>
     */
    @NameInMap("LaunchTemplateVersionNumber")
    public Long launchTemplateVersionNumber;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLaunchTemplateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionResponseBody self = new CreateLaunchTemplateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateVersionResponseBody setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateLaunchTemplateVersionResponseBody setLaunchTemplateVersionNumber(Long launchTemplateVersionNumber) {
        this.launchTemplateVersionNumber = launchTemplateVersionNumber;
        return this;
    }
    public Long getLaunchTemplateVersionNumber() {
        return this.launchTemplateVersionNumber;
    }

    public CreateLaunchTemplateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
