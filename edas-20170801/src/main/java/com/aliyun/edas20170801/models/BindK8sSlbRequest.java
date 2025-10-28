// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindK8sSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>712082c3-f554-<strong><strong>-</strong></strong>-a947b5cde6ee</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The frontend port. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The scheduling algorithm for the SLB instance. If you do not specify this parameter, the default value rr is used. Valid values:</p>
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
     * <li>port: The frontend port. Valid values: 1 to 65535. This parameter is required. Each port must be unique.</li>
     * <li>targetPort: The backend port. Valid values: 1 to 65535. This parameter is required.</li>
     * <li>loadBalancerProtocol: This parameter is required. Valid values: TCP and HTTPS. If the HTTP protocol is used, set this parameter to TCP.</li>
     * <li>certId: the ID of the certificate. This parameter is required if the HTTPS protocol is used. You can purchase an SLB instance in the SLB console.</li>
     * </ul>
     * <blockquote>
     * <p>The ServicePortInfos parameter is specified to support multi-port mappings. If you want this parameter to take effect, make sure that you have set the AppId, ClusterId, Type, and SlbId parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;136246975637380916c185d6fa21914500329_-988as&quot;,&quot;targetPort&quot;:8181,&quot;lo adBalancerProtocol&quot;:&quot;HTTPS&quot;}]</p>
     */
    @NameInMap("ServicePortInfos")
    public String servicePortInfos;

    /**
     * <p>The ID of the SLB instance. If you leave this parameter empty, Enterprise Distributed Application Service (EDAS) automatically purchases an SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2ze1quax9t****iz82bjt</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The protocol used by the SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("SlbProtocol")
    public String slbProtocol;

    /**
     * <p>The instance type of the SLB instance. Valid values:</p>
     * <ul>
     * <li>slb.s1.small</li>
     * <li>slb.s2.small</li>
     * <li>slb.s2.medium</li>
     * <li>slb.s3.small</li>
     * <li>slb.s3.medium</li>
     * <li>slb.s3.large</li>
     * </ul>
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
     * <p>8080</p>
     */
    @NameInMap("TargetPort")
    public String targetPort;

    /**
     * <p>The type of the SLB instance. Valid values:</p>
     * <ul>
     * <li>internet: Internet-facing SLB instance</li>
     * <li>intranet: internal-facing SLB instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("Type")
    public String type;

    public static BindK8sSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindK8sSlbRequest self = new BindK8sSlbRequest();
        return TeaModel.build(map, self);
    }

    public BindK8sSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindK8sSlbRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public BindK8sSlbRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public BindK8sSlbRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public BindK8sSlbRequest setServicePortInfos(String servicePortInfos) {
        this.servicePortInfos = servicePortInfos;
        return this;
    }
    public String getServicePortInfos() {
        return this.servicePortInfos;
    }

    public BindK8sSlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public BindK8sSlbRequest setSlbProtocol(String slbProtocol) {
        this.slbProtocol = slbProtocol;
        return this;
    }
    public String getSlbProtocol() {
        return this.slbProtocol;
    }

    public BindK8sSlbRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public BindK8sSlbRequest setTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public String getTargetPort() {
        return this.targetPort;
    }

    public BindK8sSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
