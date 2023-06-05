// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class MountDirectoryRequest extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The number of directories that are added. Valid values:</p>
     * <br>
     * <p>*   0: No directories are added. The left-side navigation pane may contain the specified directory.</p>
     * <p>*   1: One directory is added.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TargetUserId")
    public String targetUserId;

    public static MountDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        MountDirectoryRequest self = new MountDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public MountDirectoryRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public MountDirectoryRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public MountDirectoryRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
