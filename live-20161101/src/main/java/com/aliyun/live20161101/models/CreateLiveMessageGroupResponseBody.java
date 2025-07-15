// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageGroupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the group is deleted. If the group existed and is deleted, the group ID is unavailable. We recommend that you create a new group.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlreadyDelete")
    public Boolean alreadyDelete;

    /**
     * <p>Indicates whether the group already exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlreadyExists")
    public Boolean alreadyExists;

    /**
     * <p>The ID of the group created.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8C7B033-B339-1A58-B0E0-7B9197BA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveMessageGroupResponseBody self = new CreateLiveMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveMessageGroupResponseBody setAlreadyDelete(Boolean alreadyDelete) {
        this.alreadyDelete = alreadyDelete;
        return this;
    }
    public Boolean getAlreadyDelete() {
        return this.alreadyDelete;
    }

    public CreateLiveMessageGroupResponseBody setAlreadyExists(Boolean alreadyExists) {
        this.alreadyExists = alreadyExists;
        return this;
    }
    public Boolean getAlreadyExists() {
        return this.alreadyExists;
    }

    public CreateLiveMessageGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateLiveMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
