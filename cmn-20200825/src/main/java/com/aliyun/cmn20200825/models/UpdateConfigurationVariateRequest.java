// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationVariateRequest extends TeaModel {
    // 描述变量
    @NameInMap("Comment")
    public String comment;

    // 资源一级ID
    @NameInMap("ConfigurationVariateId")
    public String configurationVariateId;

    // python转换函数
    @NameInMap("FormatFunction")
    public String formatFunction;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 变量名字
    @NameInMap("VariateName")
    public String variateName;

    public static UpdateConfigurationVariateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationVariateRequest self = new UpdateConfigurationVariateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationVariateRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateConfigurationVariateRequest setConfigurationVariateId(String configurationVariateId) {
        this.configurationVariateId = configurationVariateId;
        return this;
    }
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    public UpdateConfigurationVariateRequest setFormatFunction(String formatFunction) {
        this.formatFunction = formatFunction;
        return this;
    }
    public String getFormatFunction() {
        return this.formatFunction;
    }

    public UpdateConfigurationVariateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConfigurationVariateRequest setVariateName(String variateName) {
        this.variateName = variateName;
        return this;
    }
    public String getVariateName() {
        return this.variateName;
    }

}
