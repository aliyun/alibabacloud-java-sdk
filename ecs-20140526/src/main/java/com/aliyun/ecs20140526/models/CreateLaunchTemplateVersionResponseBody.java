// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the launch template. For more information, see <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>.</p>
     * <p>You must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1apo0bbbkuy0rj****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The number of the created version of the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LaunchTemplateVersionNumber")
    public Long launchTemplateVersionNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DExxxxx</p>
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
