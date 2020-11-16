// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMixStreamRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("LayoutId")
    @Validation(required = true)
    public String layoutId;

    @NameInMap("InputStreamList")
    @Validation(required = true)
    public String inputStreamList;

    @NameInMap("OutputConfig")
    @Validation(required = true)
    public String outputConfig;

    @NameInMap("CallbackConfig")
    public String callbackConfig;

    public static CreateMixStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMixStreamRequest self = new CreateMixStreamRequest();
        return TeaModel.build(map, self);
    }

    public CreateMixStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateMixStreamRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public CreateMixStreamRequest setInputStreamList(String inputStreamList) {
        this.inputStreamList = inputStreamList;
        return this;
    }
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    public CreateMixStreamRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public CreateMixStreamRequest setCallbackConfig(String callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }
    public String getCallbackConfig() {
        return this.callbackConfig;
    }

}
