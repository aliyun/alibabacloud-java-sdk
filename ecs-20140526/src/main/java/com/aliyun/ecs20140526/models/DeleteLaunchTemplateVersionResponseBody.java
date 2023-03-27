// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateVersionResponseBody extends TeaModel {
    @NameInMap("LaunchTemplateVersions")
    public DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions launchTemplateVersions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLaunchTemplateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateVersionResponseBody self = new DeleteLaunchTemplateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateVersionResponseBody setLaunchTemplateVersions(DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions launchTemplateVersions) {
        this.launchTemplateVersions = launchTemplateVersions;
        return this;
    }
    public DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions getLaunchTemplateVersions() {
        return this.launchTemplateVersions;
    }

    public DeleteLaunchTemplateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion extends TeaModel {
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("LaunchTemplateVersionNumber")
        public Long launchTemplateVersionNumber;

        public static DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion build(java.util.Map<String, ?> map) throws Exception {
            DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion self = new DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion();
            return TeaModel.build(map, self);
        }

        public DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion setLaunchTemplateVersionNumber(Long launchTemplateVersionNumber) {
            this.launchTemplateVersionNumber = launchTemplateVersionNumber;
            return this;
        }
        public Long getLaunchTemplateVersionNumber() {
            return this.launchTemplateVersionNumber;
        }

    }

    public static class DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions extends TeaModel {
        @NameInMap("LaunchTemplateVersion")
        public java.util.List<DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion> launchTemplateVersion;

        public static DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions build(java.util.Map<String, ?> map) throws Exception {
            DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions self = new DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions();
            return TeaModel.build(map, self);
        }

        public DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersions setLaunchTemplateVersion(java.util.List<DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion> launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public java.util.List<DeleteLaunchTemplateVersionResponseBodyLaunchTemplateVersionsLaunchTemplateVersion> getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

    }

}
