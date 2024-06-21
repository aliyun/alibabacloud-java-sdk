// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RestartClusterRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-09k1q11****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-78v1l83****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The names of pods. You can specify the names of multiple pods at a time. Separate multiple pod names with commas (,). Example: mse-a8aba010-1629719288255-reg-center-0-1,mse-a8aba010-1629719288255-reg-center-0-2.</p>
     * <p>The specified pods must belong to the current cluster and be associated with the specified instance. Otherwise, a restart exception occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-a8aba010-1629719288255-reg-center-0-1</p>
     */
    @NameInMap("PodNameList")
    public String podNameList;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static RestartClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartClusterRequest self = new RestartClusterRequest();
        return TeaModel.build(map, self);
    }

    public RestartClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public RestartClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RestartClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestartClusterRequest setPodNameList(String podNameList) {
        this.podNameList = podNameList;
        return this;
    }
    public String getPodNameList() {
        return this.podNameList;
    }

    public RestartClusterRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
