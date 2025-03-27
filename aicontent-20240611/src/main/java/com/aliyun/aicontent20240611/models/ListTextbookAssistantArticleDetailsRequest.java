// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticleDetailsRequest extends TeaModel {
    @NameInMap("articleIdList")
    public java.util.List<String> articleIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
     */
    @NameInMap("authToken")
    public String authToken;

    public static ListTextbookAssistantArticleDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantArticleDetailsRequest self = new ListTextbookAssistantArticleDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantArticleDetailsRequest setArticleIdList(java.util.List<String> articleIdList) {
        this.articleIdList = articleIdList;
        return this;
    }
    public java.util.List<String> getArticleIdList() {
        return this.articleIdList;
    }

    public ListTextbookAssistantArticleDetailsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
