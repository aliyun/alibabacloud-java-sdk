// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitYikeAIAppJobRequest extends TeaModel {
    /**
     * <p>The AI application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_test</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The AI application runtime parameters, as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;testKey&quot;:&quot;testValue&quot;}</p>
     */
    @NameInMap("AppParams")
    public String appParams;

    /**
     * <p>The ID of the folder. If provided, the output is saved to this folder.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-cReaEcVqQK</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The ID of the project. If provided, the output is saved to this project.</p>
     * 
     * <strong>example:</strong>
     * <p>ProductionId</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    public static SubmitYikeAIAppJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeAIAppJobRequest self = new SubmitYikeAIAppJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikeAIAppJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SubmitYikeAIAppJobRequest setAppParams(String appParams) {
        this.appParams = appParams;
        return this;
    }
    public String getAppParams() {
        return this.appParams;
    }

    public SubmitYikeAIAppJobRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitYikeAIAppJobRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

}
