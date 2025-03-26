// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticlesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_a893b8492c4be046cbc906c566aeb8c9</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>90aa861b4d9311efbe6e0c42a106bb02</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    public static ListTextbookAssistantArticlesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantArticlesRequest self = new ListTextbookAssistantArticlesRequest();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantArticlesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTextbookAssistantArticlesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
