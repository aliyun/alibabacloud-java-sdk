// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class CreateChatSessionRequest extends TeaModel {
    /**
     * <p>Folder ID, to search for Q&amp;A content within the current folder and its subfolders.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1a851c4a-1d65-11ef-99a7-ssfsfdd</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>Name of the current session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>analyzer_1744684195</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The unique identifier of the user. If not provided, the SDK calling account will be used as the user ID by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1233333</p>
     */
    @NameInMap("userId")
    public String userId;

    public static CreateChatSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionRequest self = new CreateChatSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public CreateChatSessionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChatSessionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
