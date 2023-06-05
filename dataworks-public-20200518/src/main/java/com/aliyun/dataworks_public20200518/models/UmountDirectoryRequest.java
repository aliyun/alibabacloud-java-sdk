// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UmountDirectoryRequest extends TeaModel {
    /**
     * <p>The HTTP status code returned. The value 200 indicates that the request was successful.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TargetUserId")
    public String targetUserId;

    public static UmountDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UmountDirectoryRequest self = new UmountDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public UmountDirectoryRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public UmountDirectoryRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UmountDirectoryRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
