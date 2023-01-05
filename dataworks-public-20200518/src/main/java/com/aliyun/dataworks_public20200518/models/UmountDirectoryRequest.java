// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UmountDirectoryRequest extends TeaModel {
    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("TargetType")
    public String targetType;

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

}
