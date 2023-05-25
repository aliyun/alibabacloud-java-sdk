// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionResponseBody extends TeaModel {
    /**
     * <p>启动模板ID。更多信息，请参见[DescribeLaunchTemplates](~~73759~~)。</p>
     * <br>
     * <p>使用启动模板创建实例时，您必须指定`LaunchTemplateId`或`LaunchTemplateName`以确定启动模板。</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version number of the launch template.</p>
     */
    @NameInMap("LaunchTemplateVersionNumber")
    public Long launchTemplateVersionNumber;

    /**
     * <p>The ID of the request.</p>
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
