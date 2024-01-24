// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateMountTargetResponseBody extends TeaModel {
    /**
     * <p>The IPv4 domain name of the mount target.</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <p>The information about the mount target.</p>
     */
    @NameInMap("MountTargetExtra")
    public CreateMountTargetResponseBodyMountTargetExtra mountTargetExtra;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMountTargetResponseBody self = new CreateMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMountTargetResponseBody setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public CreateMountTargetResponseBody setMountTargetExtra(CreateMountTargetResponseBodyMountTargetExtra mountTargetExtra) {
        this.mountTargetExtra = mountTargetExtra;
        return this;
    }
    public CreateMountTargetResponseBodyMountTargetExtra getMountTargetExtra() {
        return this.mountTargetExtra;
    }

    public CreateMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMountTargetResponseBodyMountTargetExtra extends TeaModel {
        /**
         * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
         */
        @NameInMap("DualStackMountTargetDomain")
        public String dualStackMountTargetDomain;

        public static CreateMountTargetResponseBodyMountTargetExtra build(java.util.Map<String, ?> map) throws Exception {
            CreateMountTargetResponseBodyMountTargetExtra self = new CreateMountTargetResponseBodyMountTargetExtra();
            return TeaModel.build(map, self);
        }

        public CreateMountTargetResponseBodyMountTargetExtra setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

    }

}
