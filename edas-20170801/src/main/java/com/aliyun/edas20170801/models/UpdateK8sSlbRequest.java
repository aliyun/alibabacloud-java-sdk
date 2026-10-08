// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application. Call <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a> to get this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster. Call <a href="https://help.aliyun.com/document_detail/181437.html">GetK8sCluster</a> to get this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>712082c3-<strong><strong>-</strong></strong>-9217-a947b5cde6ee</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to disable overwriting the SLB listener configuration.</p>
     * <ul>
     * <li><p>true: Disables overwriting.</p>
     * </li>
     * <li><p>false: Allows overwriting.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableForceOverride")
    public Boolean disableForceOverride;

    /**
     * <p>The frontend port. The value ranges from 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The scheduling algorithm of the SLB instance. If you do not set this parameter, rr is used. The supported algorithms are round-robin (rr) and weighted round-robin (wrr).</p>
     * <ul>
     * <li><p>Weighted round-robin (wrr): Backend servers with higher weights receive more requests.</p>
     * </li>
     * <li><p>Round-robin (rr): Requests are distributed to backend servers in sequence.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>This parameter is used for scenarios that involve multiple ports or protocols other than TCP. The value must be a JSON array. For example:
     * [{&quot;targetPort&quot;:8080,&quot;port&quot;:82,&quot;loadBalancerProtocol&quot;:&quot;TCP&quot;},{&quot;port&quot;:81,&quot;certId&quot;:&quot;1362469756373809_16c185d6fa2_1914500329_-xxxxxxx&quot;,&quot;targetPort&quot;:8181,&quot;loadBalancerProtocol&quot;:&quot;HTTPS&quot;}]</p>
     * <ul>
     * <li><p>port: Required. The frontend port. The value ranges from 1 to 65535. Each port number must be unique.</p>
     * </li>
     * <li><p>targetPort: Required. The backend port. The value ranges from 1 to 65535.</p>
     * </li>
     * <li><p>loadBalancerProtocol: Required. Only TCP and HTTPS are supported. For HTTP listeners, set this parameter to TCP.</p>
     * </li>
     * <li><p>certId: This parameter is required for HTTPS listeners. It specifies the ID of a certificate that you can purchase in the SLB console.</p>
     * </li>
     * <li><p>Note: This parameter is used to support multiple ports and must be used with the appId, clusterId, type, and slbId parameters.</p>
     * </li>
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
     * <p>The protocol of the SLB instance. Currently, only TCP is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("SlbProtocol")
    public String slbProtocol;

    /**
     * <p>The specification of the SLB instance. The following specifications are supported:</p>
     * <ul>
     * <li><p>slb.s1.small</p>
     * </li>
     * <li><p>slb.s2.small</p>
     * </li>
     * <li><p>slb.s2.medium</p>
     * </li>
     * <li><p>slb.s3.small</p>
     * </li>
     * <li><p>slb.s3.medium</p>
     * </li>
     * <li><p>slb.s3.large</p>
     * </li>
     * </ul>
     * <p>If you do not set this parameter, the default value is slb.s1.small.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s1.small</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The backend port, which is the service port of the application. The value ranges from 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>8082</p>
     */
    @NameInMap("TargetPort")
    public String targetPort;

    /**
     * <p>The type of the SLB instance.</p>
     * <ul>
     * <li><p>Internet: An Internet-facing instance.</p>
     * </li>
     * <li><p>Intranet: An internal-facing instance.</p>
     * </li>
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
