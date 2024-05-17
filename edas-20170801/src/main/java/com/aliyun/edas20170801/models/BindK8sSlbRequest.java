// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindK8sSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The frontend port. Valid values: 1 to 65535.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The scheduling algorithm for the SLB instance. If you do not specify this parameter, the default value rr is used. Valid values:</p>
     * <br>
     * <p>*   wrr: weighted round-robin scheduling. Backend servers that have higher weights receive more requests than those that have lower weights.</p>
     * <p>*   rr: round-robin scheduling. Requests are sequentially distributed to backend servers.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The information about the ports. This parameter is required if you want to configure multi-port mappings or use a protocol other than TCP. You must set this parameter to a JSON array. Example: [{"targetPort":8080,"port":82,"loadBalancerProtocol":"TCP"},{"port":81,"certId":"1362469756373809_16c185d6fa2_1914500329_-xxxxxxx","targetPort":8181,"lo adBalancerProtocol":"HTTPS"}]</p>
     * <br>
     * <p>*   port: The frontend port. Valid values: 1 to 65535. This parameter is required. Each port must be unique.</p>
     * <p>*   targetPort: The backend port. Valid values: 1 to 65535. This parameter is required.</p>
     * <p>*   loadBalancerProtocol: This parameter is required. Valid values: TCP and HTTPS. If the HTTP protocol is used, set this parameter to TCP.</p>
     * <p>*   certId: the ID of the certificate. This parameter is required if the HTTPS protocol is used. You can purchase an SLB instance in the SLB console.</p>
     * <br>
     * <p>> The ServicePortInfos parameter is specified to support multi-port mappings. If you want this parameter to take effect, make sure that you have set the AppId, ClusterId, Type, and SlbId parameters.</p>
     */
    @NameInMap("ServicePortInfos")
    public String servicePortInfos;

    /**
     * <p>The ID of the SLB instance. If you leave this parameter empty, Enterprise Distributed Application Service (EDAS) automatically purchases an SLB instance.</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The protocol used by the SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
     */
    @NameInMap("SlbProtocol")
    public String slbProtocol;

    /**
     * <p>The instance type of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   slb.s1.small</p>
     * <p>*   slb.s2.small</p>
     * <p>*   slb.s2.medium</p>
     * <p>*   slb.s3.small</p>
     * <p>*   slb.s3.medium</p>
     * <p>*   slb.s3.large</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The backend port, which is also the service port of the application. Valid values: 1 to 65535.</p>
     */
    @NameInMap("TargetPort")
    public String targetPort;

    /**
     * <p>The type of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   internet: Internet-facing SLB instance</p>
     * <p>*   intranet: internal-facing SLB instance</p>
     * <br>
     * <p>This parameter is required.</p>
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
