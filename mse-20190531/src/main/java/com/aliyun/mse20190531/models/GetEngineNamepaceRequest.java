// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetEngineNamepaceRequest extends TeaModel {
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
     * <p>mse-98s****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The destination ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0e958d79-****-b282-b702d66362b5</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse.cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetEngineNamepaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEngineNamepaceRequest self = new GetEngineNamepaceRequest();
        return TeaModel.build(map, self);
    }

    public GetEngineNamepaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetEngineNamepaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetEngineNamepaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetEngineNamepaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
