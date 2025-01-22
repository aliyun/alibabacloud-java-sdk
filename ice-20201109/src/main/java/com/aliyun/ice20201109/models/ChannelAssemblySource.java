// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblySource extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("HttpPackageConfigurations")
    public String httpPackageConfigurations;

    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    @NameInMap("SourceName")
    public String sourceName;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("State")
    public Integer state;

    public static ChannelAssemblySource build(java.util.Map<String, ?> map) throws Exception {
        ChannelAssemblySource self = new ChannelAssemblySource();
        return TeaModel.build(map, self);
    }

    public ChannelAssemblySource setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ChannelAssemblySource setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ChannelAssemblySource setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ChannelAssemblySource setHttpPackageConfigurations(String httpPackageConfigurations) {
        this.httpPackageConfigurations = httpPackageConfigurations;
        return this;
    }
    public String getHttpPackageConfigurations() {
        return this.httpPackageConfigurations;
    }

    public ChannelAssemblySource setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public ChannelAssemblySource setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ChannelAssemblySource setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ChannelAssemblySource setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

}
