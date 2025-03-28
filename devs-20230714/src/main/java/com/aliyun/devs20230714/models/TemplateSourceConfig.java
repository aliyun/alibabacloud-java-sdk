// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateSourceConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://api.devsapp.cn/v3/packages/start-modelscope-v3/zipball/0.1.6">https://api.devsapp.cn/v3/packages/start-modelscope-v3/zipball/0.1.6</a></p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <strong>example:</strong>
     * <p>start-springboot-cap</p>
     */
    @NameInMap("name")
    public String name;

    public static TemplateSourceConfig build(java.util.Map<String, ?> map) throws Exception {
        TemplateSourceConfig self = new TemplateSourceConfig();
        return TeaModel.build(map, self);
    }

    public TemplateSourceConfig setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public TemplateSourceConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
