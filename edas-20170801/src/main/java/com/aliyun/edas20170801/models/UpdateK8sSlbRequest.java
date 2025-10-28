// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster. You can query the cluster ID by calling the GetK8sCluster operation. For more information, see <a href="https://help.aliyun.com/document_detail/181437.html">GetK8sCluster</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>712082c3-<strong><strong>-</strong></strong>-9217-a947b5cde6ee</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to disable listener configuration overriding.</p>
     * <ul>
     * <li>true: disables listener configuration overriding.</li>
     * <li>false: enables listener configuration overriding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableForceOverride")
    public Boolean disableForceOverride;

    /**
     * <p>The frontend port. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The scheduling algorithm for the SLB instance. If you do not specify this parameter, the default value rr is used. SLB supports the following scheduling algorithms: round-robin and weighted round-robin. Valid values:</p>
     * <ul>
     * <li>wrr: weighted round-robin scheduling. Backend servers that have higher weights receive more requests than those that have lower weights.</li>
     * <li>rr: round-robin scheduling. Requests are sequentially distributed to backend servers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The information about the ports. This parameter is required if you want to configure multi-port mappings or use a protocol other than TCP. You must set this parameter to a JSON array. Example: [{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;1362469756373809_16c185d6fa2_1914500329_-xxxxxxx&quot;,&quot;targetPort&quot;:8181,&quot;lo adBalancerProtocol&quot;:&quot;HTTPS&quot;}]</p>
     * <ul>
     * <li>port: required. The frontend port. Valid values: 1 to 65535. Each port must be unique.</li>
     * <li>targetPort: required. The backend port. Valid values: 1 to 65535.</li>
     * <li>loadBalancerProtocol: required. Valid values: TCP and HTTPS. If the HTTP protocol is used, set this parameter to TCP.</li>
     * <li>certId: the ID of the certificate. This parameter is required if the HTTPS protocol is used. You can purchase an SLB instance in the SLB console.</li>
     * <li>Note: The ServicePortInfos parameter is specified to support multi-port mappings. If you want this parameter to take effect, make sure that you specify the AppId, ClusterId, Type, and SlbId parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;136246975637380916c185d6fa21914500329_-xxxxxxx&quot;,&quot;targetPort&quot;:8181,&quot;lo adBalancerProtocol&quot;:&quot;HTTPS&quot;}</p>
     */
    @NameInMap("ServicePortInfos")
    public String servicePortInfos;

    /**
     * <p>The name of the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>SLB_doctest</p>
     */
    @NameInMap("SlbName")
    public String slbName;

    /**
     * <p>The protocol used by the SLB instance. Set the value to TCP.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("SlbProtocol")
    public String slbProtocol;

    /**
     * <p>The specifications of the SLB instance.</p>
     * <ul>
     * <li>slb.s1.small</li>
     * <li>slb.s2.small</li>
     * <li>slb.s2.medium</li>
     * <li>slb.s3.small</li>
     * <li>slb.s3.medium</li>
     * <li>slb.s3.large</li>
     * </ul>
     * <p>If you do not specify this parameter, the default value slb.s1.small is used.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s1.small</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The backend port, which is also the service port of the application. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>8082</p>
     */
    @NameInMap("TargetPort")
    public String targetPort;

    /**
     * <p>The type of the SLB instance. Valid values:</p>
     * <ul>
     * <li>Internet: an Internet-facing SLB instance</li>
     * <li>Intranet: an internal-facing SLB instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateK8sSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sSlbRequest self = new UpdateK8sSlbRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateK8sSlbRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateK8sSlbRequest setDisableForceOverride(Boolean disableForceOverride) {
        this.disableForceOverride = disableForceOverride;
        return this;
    }
    public Boolean getDisableForceOverride() {
        return this.disableForceOverride;
    }

    public UpdateK8sSlbRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public UpdateK8sSlbRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public UpdateK8sSlbRequest setServicePortInfos(String servicePortInfos) {
        this.servicePortInfos = servicePortInfos;
        return this;
    }
    public String getServicePortInfos() {
        return this.servicePortInfos;
    }

    public UpdateK8sSlbRequest setSlbName(String slbName) {
        this.slbName = slbName;
        return this;
    }
    public String getSlbName() {
        return this.slbName;
    }

    public UpdateK8sSlbRequest setSlbProtocol(String slbProtocol) {
        this.slbProtocol = slbProtocol;
        return this;
    }
    public String getSlbProtocol() {
        return this.slbProtocol;
    }

    public UpdateK8sSlbRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public UpdateK8sSlbRequest setTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public String getTargetPort() {
        return this.targetPort;
    }

    public UpdateK8sSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
