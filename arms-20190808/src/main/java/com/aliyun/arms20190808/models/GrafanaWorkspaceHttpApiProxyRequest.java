// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceHttpApiProxyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example1:
     * {&quot;method&quot;:&quot;GET&quot;,&quot;path&quot;:&quot;/api/dashboards/tags&quot;}
     * example2:
     * {
     *   &quot;method&quot;: &quot;POST&quot;,
     *   &quot;path&quot;: &quot;/api/dashboards/db&quot;,
     *   &quot;headers&quot;: { &quot;Content-Type&quot;: &quot;application/json&quot; },
     *   &quot;body&quot;: &quot;{\&quot;dashboard\&quot;:{\&quot;id\&quot;:null,\&quot;uid\&quot;:null,\&quot;title\&quot;:\&quot;demo\&quot;,\&quot;schemaVersion\&quot;:16},\&quot;overwrite\&quot;:false}&quot;
     * }
     * example3:
     * {&quot;method&quot;:&quot;GET&quot;,&quot;path&quot;:&quot;/api/datasources&quot;,&quot;queryParams&quot;:{&quot;type&quot;:[&quot;prometheus&quot;,&quot;mysql&quot;]}}</p>
     */
    @NameInMap("BodyStr")
    public String bodyStr;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-cn-06f4xyxjo01</p>
     */
    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrgId")
    public Long orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GrafanaWorkspaceHttpApiProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceHttpApiProxyRequest self = new GrafanaWorkspaceHttpApiProxyRequest();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceHttpApiProxyRequest setBodyStr(String bodyStr) {
        this.bodyStr = bodyStr;
        return this;
    }
    public String getBodyStr() {
        return this.bodyStr;
    }

    public GrafanaWorkspaceHttpApiProxyRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspaceHttpApiProxyRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GrafanaWorkspaceHttpApiProxyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
