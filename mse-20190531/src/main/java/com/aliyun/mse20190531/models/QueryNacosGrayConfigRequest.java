// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryNacosGrayConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-develop</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GrayName")
    public String grayName;

    /**
     * <strong>example:</strong>
     * <p>DEFAULT_GROUP</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-st21ri2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>6bafdde3-4fa7-4d67-b3da-a607ab87f7e4</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static QueryNacosGrayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNacosGrayConfigRequest self = new QueryNacosGrayConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryNacosGrayConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryNacosGrayConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryNacosGrayConfigRequest setGrayName(String grayName) {
        this.grayName = grayName;
        return this;
    }
    public String getGrayName() {
        return this.grayName;
    }

    public QueryNacosGrayConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryNacosGrayConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryNacosGrayConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public QueryNacosGrayConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryNacosGrayConfigRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
