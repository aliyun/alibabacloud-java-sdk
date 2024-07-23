// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateResponseBody extends TeaModel {
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
     * <p>The versions of the deleted launch template.</p>
     */
    @NameInMap("LaunchTemplateVersionNumbers")
    public DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers launchTemplateVersionNumbers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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

    public DeleteLaunchTemplateResponseBody setLaunchTemplateVersionNumbers(DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers launchTemplateVersionNumbers) {
        this.launchTemplateVersionNumbers = launchTemplateVersionNumbers;
        return this;
    }
    public DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers getLaunchTemplateVersionNumbers() {
        return this.launchTemplateVersionNumbers;
    }

    public DeleteLaunchTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers extends TeaModel {
        @NameInMap("versionNumbers")
        public java.util.List<Long> versionNumbers;

        public static DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers build(java.util.Map<String, ?> map) throws Exception {
            DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers self = new DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers();
            return TeaModel.build(map, self);
        }

        public DeleteLaunchTemplateResponseBodyLaunchTemplateVersionNumbers setVersionNumbers(java.util.List<Long> versionNumbers) {
            this.versionNumbers = versionNumbers;
            return this;
        }
        public java.util.List<Long> getVersionNumbers() {
            return this.versionNumbers;
        }

    }

}
