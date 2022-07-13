// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AppsInteractiveVideoSettings extends TeaModel {
    @NameInMap("Domain")
    public AppsDomain domain;

    @NameInMap("Severity")
    public AppsSecurity severity;

    @NameInMap("Transcoding")
    public AppsTranscoding transcoding;

    @NameInMap("Type")
    public String type;

    public static AppsInteractiveVideoSettings build(java.util.Map<String, ?> map) throws Exception {
        AppsInteractiveVideoSettings self = new AppsInteractiveVideoSettings();
        return TeaModel.build(map, self);
    }

    public AppsInteractiveVideoSettings setDomain(AppsDomain domain) {
        this.domain = domain;
        return this;
    }
    public AppsDomain getDomain() {
        return this.domain;
    }

    public AppsInteractiveVideoSettings setSeverity(AppsSecurity severity) {
        this.severity = severity;
        return this;
    }
    public AppsSecurity getSeverity() {
        return this.severity;
    }

    public AppsInteractiveVideoSettings setTranscoding(AppsTranscoding transcoding) {
        this.transcoding = transcoding;
        return this;
    }
    public AppsTranscoding getTranscoding() {
        return this.transcoding;
    }

    public AppsInteractiveVideoSettings setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
