// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailRequest extends TeaModel {
    /**
     * <p>The ID of the message. You can obtain the ID from the received message when the extension point event is triggered.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The ID of the workspace. You can obtain the ID from the message.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetIDEEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIDEEventDetailRequest self = new GetIDEEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetIDEEventDetailRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public GetIDEEventDetailRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
