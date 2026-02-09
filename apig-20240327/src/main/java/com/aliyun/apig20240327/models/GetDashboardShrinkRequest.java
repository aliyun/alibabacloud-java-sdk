// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDashboardShrinkRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh (Chinese) and en (English).</p>
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
     * <p>The filter configurations.</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>The dashboard name.</p>
     * <ul>
     * <li>LOG: access logs</li>
     * <li>PLUGIN: plug-in logs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PLUGIN</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The plug-in type ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pls-dn82a9djd8z****</p>
     */
    @NameInMap("pluginClassId")
    public String pluginClassId;

    /**
     * <p>The plug-in ID.</p>
     * 
     * <strong>example:</strong>
     * <p>inner-ai-search-cvd3mcum1hks660icn10</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <p>The route ID.</p>
     * 
     * <strong>example:</strong>
     * <p>route-xxx</p>
     */
    @NameInMap("routeId")
    public String routeId;

    /**
     * <p>The dashboard source. Valid values:</p>
     * <ul>
     * <li>SLS: Simple Log Service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The AI service identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>outbound|443||ds.ai</p>
     */
    @NameInMap("upstreamCluster")
    public String upstreamCluster;

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

    public GetDashboardShrinkRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public GetDashboardShrinkRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public GetDashboardShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetDashboardShrinkRequest setUpstreamCluster(String upstreamCluster) {
        this.upstreamCluster = upstreamCluster;
        return this;
    }
    public String getUpstreamCluster() {
        return this.upstreamCluster;
    }

}
