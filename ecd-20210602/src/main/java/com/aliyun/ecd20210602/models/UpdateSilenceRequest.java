// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateSilenceRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("SilenceDeleteFlag")
    public Integer silenceDeleteFlag;

    @NameInMap("SilenceDeleteParam")
    public String silenceDeleteParam;

    @NameInMap("SilenceInstallFlag")
    public Integer silenceInstallFlag;

    @NameInMap("SilenceInstallParam")
    public String silenceInstallParam;

    public static UpdateSilenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSilenceRequest self = new UpdateSilenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSilenceRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public UpdateSilenceRequest setSilenceDeleteFlag(Integer silenceDeleteFlag) {
        this.silenceDeleteFlag = silenceDeleteFlag;
        return this;
    }
    public Integer getSilenceDeleteFlag() {
        return this.silenceDeleteFlag;
    }

    public UpdateSilenceRequest setSilenceDeleteParam(String silenceDeleteParam) {
        this.silenceDeleteParam = silenceDeleteParam;
        return this;
    }
    public String getSilenceDeleteParam() {
        return this.silenceDeleteParam;
    }

    public UpdateSilenceRequest setSilenceInstallFlag(Integer silenceInstallFlag) {
        this.silenceInstallFlag = silenceInstallFlag;
        return this;
    }
    public Integer getSilenceInstallFlag() {
        return this.silenceInstallFlag;
    }

    public UpdateSilenceRequest setSilenceInstallParam(String silenceInstallParam) {
        this.silenceInstallParam = silenceInstallParam;
        return this;
    }
    public String getSilenceInstallParam() {
        return this.silenceInstallParam;
    }

}
