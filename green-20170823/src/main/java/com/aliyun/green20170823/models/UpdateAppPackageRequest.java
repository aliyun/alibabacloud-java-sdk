// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAppPackageRequest extends TeaModel {
    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static UpdateAppPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPackageRequest self = new UpdateAppPackageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppPackageRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public UpdateAppPackageRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAppPackageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAppPackageRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public UpdateAppPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public UpdateAppPackageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
