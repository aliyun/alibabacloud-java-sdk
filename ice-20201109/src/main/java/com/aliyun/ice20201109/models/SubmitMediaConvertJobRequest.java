// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaConvertJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    @NameInMap("PipelineId")
    public String pipelineId;

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
