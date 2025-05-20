// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatFolderListResponseBody extends TeaModel {
    /**
     * <p>Returned data</p>
     */
    @NameInMap("data")
    public java.util.List<ChatFolderItem> data;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A8AEC6D9-A359-5169-BD1A-BD848BA60D65</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetChatFolderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatFolderListResponseBody self = new GetChatFolderListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatFolderListResponseBody setData(java.util.List<ChatFolderItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ChatFolderItem> getData() {
        return this.data;
    }

    public GetChatFolderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
