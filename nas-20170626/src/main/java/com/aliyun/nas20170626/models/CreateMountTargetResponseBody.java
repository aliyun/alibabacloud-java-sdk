// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateMountTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    @NameInMap("MountTargetExtra")
    public CreateMountTargetResponseBodyMountTargetExtra mountTargetExtra;

    public static CreateMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMountTargetResponseBody self = new CreateMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class CreateMountTargetResponseBodyMountTargetExtra extends TeaModel {
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
