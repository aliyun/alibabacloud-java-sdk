// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDashboardShrinkRequest extends TeaModel {
    /**
     * <p>zh: Chinese
     * en: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    /**
     * <p>API ID</p>
     * 
     * <strong>example:</strong>
     * <p>api-c9uuekzmia8q2****</p>
     */
    @NameInMap("apiId")
    public String apiId;

    /**
     * <p>Filter configuration</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>Dashboard name:</p>
     * <ul>
     * <li>LOG: Access log</li>
     * <li>PLUGIN: Plugin log</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PLUGIN</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Plugin ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pls-dn82a9djd8z****</p>
     */
    @NameInMap("pluginClassId")
    public String pluginClassId;

    /**
     * <p>Dashboard source:</p>
     * <ul>
     * <li>SLS: Log dashboard</li>
     * </ul>
     * 
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
