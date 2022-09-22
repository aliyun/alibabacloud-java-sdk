// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDisksResponseBody extends TeaModel {
    @NameInMap("DiskId")
    public DiskId diskId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDisksResponseBody self = new CreateDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDisksResponseBody setDiskId(DiskId diskId) {
        this.diskId = diskId;
        return this;
    }
    public DiskId getDiskId() {
        return this.diskId;
    }

    public CreateDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DiskId extends TeaModel {
        @NameInMap("DiskIds")
        public java.util.List<String> diskIds;

        public static DiskId build(java.util.Map<String, ?> map) throws Exception {
            DiskId self = new DiskId();
            return TeaModel.build(map, self);
        }

        public DiskId setDiskIds(java.util.List<String> diskIds) {
            this.diskIds = diskIds;
            return this;
        }
        public java.util.List<String> getDiskIds() {
            return this.diskIds;
        }

    }

}
