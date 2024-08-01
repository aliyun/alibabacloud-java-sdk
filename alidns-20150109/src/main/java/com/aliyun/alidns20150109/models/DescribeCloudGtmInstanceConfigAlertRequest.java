// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmInstanceConfigAlertRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3hbz**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeCloudGtmInstanceConfigAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmInstanceConfigAlertRequest self = new DescribeCloudGtmInstanceConfigAlertRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmInstanceConfigAlertRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeCloudGtmInstanceConfigAlertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeCloudGtmInstanceConfigAlertRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DescribeCloudGtmInstanceConfigAlertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
