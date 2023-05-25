// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateResponseBody extends TeaModel {
    /**
     * <p>启动模板ID。更多信息，请参见[DescribeLaunchTemplates](~~73759~~)。</p>
     * <br>
     * <p>使用启动模板创建实例时，您必须指定`LaunchTemplateId`或`LaunchTemplateName`以确定启动模板。</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLaunchTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateResponseBody self = new DeleteLaunchTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateResponseBody setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public DeleteLaunchTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
