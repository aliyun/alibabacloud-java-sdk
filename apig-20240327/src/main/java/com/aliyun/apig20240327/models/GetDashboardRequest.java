// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDashboardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    @NameInMap("apiId")
    public String apiId;

    @NameInMap("filter")
    public GetDashboardRequestFilter filter;

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

    public static GetDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardRequest self = new GetDashboardRequest();
        return TeaModel.build(map, self);
    }

    public GetDashboardRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetDashboardRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public GetDashboardRequest setFilter(GetDashboardRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetDashboardRequestFilter getFilter() {
        return this.filter;
    }

    public GetDashboardRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDashboardRequest setPluginClassId(String pluginClassId) {
        this.pluginClassId = pluginClassId;
        return this;
    }
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    public GetDashboardRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public static class GetDashboardRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-route</p>
         */
        @NameInMap("routeName")
        public String routeName;

        public static GetDashboardRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetDashboardRequestFilter self = new GetDashboardRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetDashboardRequestFilter setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

    }

}
