// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SubmitSparkJobShrinkRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Arguments")
    public String argumentsShrink;

    @NameInMap("Configuration")
    public String configurationShrink;

    @NameInMap("Files")
    public String filesShrink;

    @NameInMap("MainClass")
    public String mainClass;

    @NameInMap("MainFile")
    public String mainFile;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssInfo")
    public String ossInfoShrink;

    @NameInMap("Tid")
    public Long tid;

    public static SubmitSparkJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkJobShrinkRequest self = new SubmitSparkJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkJobShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SubmitSparkJobShrinkRequest setArgumentsShrink(String argumentsShrink) {
        this.argumentsShrink = argumentsShrink;
        return this;
    }
    public String getArgumentsShrink() {
        return this.argumentsShrink;
    }

    public SubmitSparkJobShrinkRequest setConfigurationShrink(String configurationShrink) {
        this.configurationShrink = configurationShrink;
        return this;
    }
    public String getConfigurationShrink() {
        return this.configurationShrink;
    }

    public SubmitSparkJobShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public SubmitSparkJobShrinkRequest setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public SubmitSparkJobShrinkRequest setMainFile(String mainFile) {
        this.mainFile = mainFile;
        return this;
    }
    public String getMainFile() {
        return this.mainFile;
    }

    public SubmitSparkJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitSparkJobShrinkRequest setOssInfoShrink(String ossInfoShrink) {
        this.ossInfoShrink = ossInfoShrink;
        return this;
    }
    public String getOssInfoShrink() {
        return this.ossInfoShrink;
    }

    public SubmitSparkJobShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
