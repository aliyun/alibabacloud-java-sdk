// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The Prometheus instances in the region in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;agentStatus&quot;:&quot;0&quot;,&quot;clusterId&quot;:&quot;global-v2-cn-1672753017899-dmjnwtzz&quot;,&quot;clusterName&quot;:&quot;test-GlobalView&quot;,&quot;clusterType&quot;:&quot;GlobalViewV2&quot;,&quot;commercialConfig&quot;:{},&quot;createTime&quot;:1656579981000,&quot;id&quot;:13785300,&quot;isAdvancedClusterInstalled&quot;:false,&quot;isClusterRunning&quot;:true,&quot;isControllerInstalled&quot;:true,&quot;isIntegrationCenter&quot;:false,&quot;regionId&quot;:&quot;cn-hongkong&quot;,&quot;updateTime&quot;:1657616273000,&quot;userId&quot;:&quot;1672753017899&quot;},{&quot;agentStatus&quot;:&quot;0&quot;,&quot;clusterId&quot;:&quot;51a123a61a8f31f0&quot;,&quot;clusterName&quot;:&quot;cloud-product-prometheus_cn-qingdao&quot;,&quot;clusterType&quot;:&quot;cloud-product-prometheus&quot;,&quot;commercialConfig&quot;:{},&quot;controllerId&quot;:&quot;51a123a61a8f31f0&quot;,&quot;createTime&quot;:1653532488000,&quot;id&quot;:13746658,&quot;isAdvancedClusterInstalled&quot;:false,&quot;isClusterRunning&quot;:true,&quot;isControllerInstalled&quot;:true,&quot;isIntegrationCenter&quot;:false,&quot;regionId&quot;:&quot;cn-qingdao&quot;,&quot;updateTime&quot;:1653532518000,&quot;userId&quot;:&quot;1672753017899&quot;}]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesResponseBody self = new ListPrometheusInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPrometheusInstancesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListPrometheusInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrometheusInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
