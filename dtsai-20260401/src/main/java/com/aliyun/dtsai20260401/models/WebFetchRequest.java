// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebFetchRequest extends TeaModel {
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Url")
    public String url;

    public static WebFetchRequest build(java.util.Map<String, ?> map) throws Exception {
        WebFetchRequest self = new WebFetchRequest();
        return TeaModel.build(map, self);
    }

    public WebFetchRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public WebFetchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WebFetchRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
