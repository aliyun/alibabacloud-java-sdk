// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailRequest extends TeaModel {
    /**
     * <p>The message ID of the DataWorks open message. After an extension point event is triggered, you can obtain the message ID from the received event message.</p>
     * <p>&lt;props=&quot;china&quot;&gt;For the message format, refer to <a href="https://help.aliyun.com/document_detail/215367.html">Message format</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed67****1</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The ID of the DataWorks workspace. You can obtain the workspace ID by parsing the DataWorks open message.</p>
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
