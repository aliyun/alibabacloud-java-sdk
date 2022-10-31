// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMixStreamRequest extends TeaModel {
    @NameInMap("CallbackConfig")
    public String callbackConfig;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("InputStreamList")
    public String inputStreamList;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateMixStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMixStreamRequest self = new CreateMixStreamRequest();
        return TeaModel.build(map, self);
    }

    public CreateMixStreamRequest setCallbackConfig(String callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }
    public String getCallbackConfig() {
        return this.callbackConfig;
    }

    public CreateMixStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateMixStreamRequest setInputStreamList(String inputStreamList) {
        this.inputStreamList = inputStreamList;
        return this;
    }
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    public CreateMixStreamRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public CreateMixStreamRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public CreateMixStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
