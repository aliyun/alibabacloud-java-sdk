// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class Source extends TeaModel {
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

    public static Source build(java.util.Map<String, ?> map) throws Exception {
        Source self = new Source();
        return TeaModel.build(map, self);
    }

    public Source setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public Source setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Source setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Source setHttpPackageConfigurations(String httpPackageConfigurations) {
        this.httpPackageConfigurations = httpPackageConfigurations;
        return this;
    }
    public String getHttpPackageConfigurations() {
        return this.httpPackageConfigurations;
    }

    public Source setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public Source setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public Source setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public Source setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

}
