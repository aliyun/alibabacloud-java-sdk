// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDashboardShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    @NameInMap("apiId")
    public String apiId;

    @NameInMap("filter")
    public String filterShrink;

    /**
     * <strong>example:</strong>
     * <p>PLUGIN</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>pls-dn82a9djd8z****</p>
     */
    @NameInMap("pluginClassId")
    public String pluginClassId;

    /**
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("source")
    public String source;

    public static GetDashboardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardShrinkRequest self = new GetDashboardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDashboardShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetDashboardShrinkRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public GetDashboardShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetDashboardShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDashboardShrinkRequest setPluginClassId(String pluginClassId) {
        this.pluginClassId = pluginClassId;
        return this;
    }
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    public GetDashboardShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
