// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UmountDirectoryRequest extends TeaModel {
    /**
     * <p>The ID of the directory that you want to remove from the left-side navigation pane of DataAnalysis. This parameter is used together with the TargetType parameter.</p>
     * <br>
     * <p>For example, if you set the TargetType parameter to META_ALBUM, you must set the TargetId parameter to the ID of the related data album. You can call the [ListMetaCollections](~~469938~~) operation to obtain the ID of the data album. The ID is indicated by the QualifiedName parameter.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the directory that you want to remove from the left-side navigation pane of DataAnalysis. Example: META_ALBUM, which indicates the data album.</p>
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
