// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaConvertJobRequest extends TeaModel {
    /**
     * <p>The idempotency key that is used to ensure repeated requests have the same effect as a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>86f8e525-9d73-4dac-88aa-7aa4e950c00a</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configurations of the transcoding task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>e197ecfb103e4849922b054d3032f954</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The user data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;videoId&quot;:&quot;abcd&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaConvertJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaConvertJobRequest self = new SubmitMediaConvertJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaConvertJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitMediaConvertJobRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SubmitMediaConvertJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitMediaConvertJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
