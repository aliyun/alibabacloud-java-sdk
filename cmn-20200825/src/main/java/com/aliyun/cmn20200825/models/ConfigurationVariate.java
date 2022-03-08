// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ConfigurationVariate extends TeaModel {
    // 描述变量
    @NameInMap("Comment")
    public String comment;

    // 资源一级ID
    @NameInMap("ConfigurationVariateId")
    public String configurationVariateId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // python转换函数
    @NameInMap("FormatFunction")
    public String formatFunction;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 变量名字
    @NameInMap("VariateName")
    public String variateName;

    public static ConfigurationVariate build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationVariate self = new ConfigurationVariate();
        return TeaModel.build(map, self);
    }

    public ConfigurationVariate setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ConfigurationVariate setConfigurationVariateId(String configurationVariateId) {
        this.configurationVariateId = configurationVariateId;
        return this;
    }
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    public ConfigurationVariate setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ConfigurationVariate setFormatFunction(String formatFunction) {
        this.formatFunction = formatFunction;
        return this;
    }
    public String getFormatFunction() {
        return this.formatFunction;
    }

    public ConfigurationVariate setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ConfigurationVariate setVariateName(String variateName) {
        this.variateName = variateName;
        return this;
    }
    public String getVariateName() {
        return this.variateName;
    }

}
