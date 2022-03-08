// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationVariateRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 描述变量
    @NameInMap("Comment")
    public String comment;

    // python转换函数
    @NameInMap("FormatFunction")
    public String formatFunction;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源名称
    @NameInMap("VariateName")
    public String variateName;

    public static CreateConfigurationVariateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationVariateRequest self = new CreateConfigurationVariateRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationVariateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConfigurationVariateRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateConfigurationVariateRequest setFormatFunction(String formatFunction) {
        this.formatFunction = formatFunction;
        return this;
    }
    public String getFormatFunction() {
        return this.formatFunction;
    }

    public CreateConfigurationVariateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateConfigurationVariateRequest setVariateName(String variateName) {
        this.variateName = variateName;
        return this;
    }
    public String getVariateName() {
        return this.variateName;
    }

}
