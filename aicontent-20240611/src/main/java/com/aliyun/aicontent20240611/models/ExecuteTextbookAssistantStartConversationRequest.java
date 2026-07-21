// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantStartConversationRequest extends TeaModel {
    /**
     * <p>How you obtain this ID depends on the value of <code>scenario</code>.</p>
     * <p><strong>When the <code>scenario</code> input parameter is <code>SYNC</code>:</strong></p>
     * <ol>
     * <li><p>From the <code>Get Article List</code> response, use the top-level <code>articleId</code> field.</p>
     * </li>
     * <li><p>From the <code>Get Article Details</code> response, use the top-level <code>articleId</code> field.</p>
     * </li>
     * </ol>
     * <p><strong>When the <code>scenario</code> input parameter is <code>EXPAND</code>:</strong></p>
     * <ol>
     * <li>From the <code>Get Article Details</code> response, use the <code>sceneid</code> field from an element in the <code>sceneList</code> array.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0c05700d4d9411efbe6e0c42a106bb02</p>
     */
    @NameInMap("articleId")
    public String articleId;

    /**
     * <p>The authorization token for the API call. Obtain this token by calling the operation that provides the authorization token for the textbook-style AI teacher feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>The practice scenario. Valid values:</p>
     * <p><code>SYNC</code>: synchronous practice</p>
     * <p><code>EXPAND</code>: expansion practice</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("scenario")
    public String scenario;

    public static ExecuteTextbookAssistantStartConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantStartConversationRequest self = new ExecuteTextbookAssistantStartConversationRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantStartConversationRequest setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleId() {
        return this.articleId;
    }

    public ExecuteTextbookAssistantStartConversationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecuteTextbookAssistantStartConversationRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
