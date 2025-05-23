// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed67****1</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
