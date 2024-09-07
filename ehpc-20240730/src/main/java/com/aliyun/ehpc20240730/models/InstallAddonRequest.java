// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class InstallAddonRequest extends TeaModel {
    /**
     * <p>The addon name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Login</p>
     */
    @NameInMap("AddonName")
    public String addonName;

    /**
     * <p>The addon version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AddonVersion")
    public String addonVersion;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The resource configurations of the addon.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><code>{&quot;EipResource&quot;: {&quot;AutoCreate&quot;: true}, &quot;EcsResources&quot;: [{&quot;InstanceType&quot;: &quot;ecs.c7.xlarge&quot;, &quot;ImageId&quot;: &quot;centos_7_6_xxx.vhd&quot;, &quot;SystemDisk&quot;: {&quot;Category&quot;: &quot;cloud_essd&quot;, &quot;Size&quot;: 40, &quot;Level&quot;: &quot;PL0&quot;}]}</code></p>
     */
    @NameInMap("ResourcesSpec")
    public String resourcesSpec;

    /**
     * <p>The service configurations of the addon.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><code>[{&quot;ServiceName&quot;: &quot;SSH&quot;, &quot;ServiceAccessType&quot;: null, &quot;ServiceAccessUrl&quot;: null, &quot;NetworkACL&quot;: [{&quot;IpProtocol&quot;: &quot;TCP&quot;, &quot;Port&quot;: 22, &quot;SourceCidrIp&quot;: &quot;0.0.0.0/0&quot;}]}, {&quot;ServiceName&quot;: &quot;VNC&quot;, &quot;ServiceAccessType&quot;: null, &quot;ServiceAccessUrl&quot;: null, &quot;NetworkACL&quot;: [{&quot;IpProtocol&quot;: &quot;TCP&quot;, &quot;Port&quot;: 12016, &quot;SourceCidrIp&quot;: &quot;0.0.0.0/0&quot;}]}]</code></p>
     */
    @NameInMap("ServicesSpec")
    public String servicesSpec;

    public static InstallAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAddonRequest self = new InstallAddonRequest();
        return TeaModel.build(map, self);
    }

    public InstallAddonRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public InstallAddonRequest setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
        return this;
    }
    public String getAddonVersion() {
        return this.addonVersion;
    }

    public InstallAddonRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InstallAddonRequest setResourcesSpec(String resourcesSpec) {
        this.resourcesSpec = resourcesSpec;
        return this;
    }
    public String getResourcesSpec() {
        return this.resourcesSpec;
    }

    public InstallAddonRequest setServicesSpec(String servicesSpec) {
        this.servicesSpec = servicesSpec;
        return this;
    }
    public String getServicesSpec() {
        return this.servicesSpec;
    }

}
