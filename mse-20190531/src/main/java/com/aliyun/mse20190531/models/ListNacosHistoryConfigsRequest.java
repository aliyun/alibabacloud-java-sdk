// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosHistoryConfigsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>user-prod.yaml</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The name of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>fc-dev-cluster-1</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-2r42e3bk20n</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespace ID. Default value: public</p>
     * 
     * <strong>example:</strong>
     * <p>fc0f6e40-****-946b-45e3af313707</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the cluster is located. MSE supports specific regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The extended request parameter in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;appGroup\&quot;:\&quot;aliyun-phecda-service-staging\&quot;,\&quot;appName\&quot;:\&quot;aliyun-phecda-service\&quot;,\&quot;appStage\&quot;:\&quot;DAILY\&quot;,\&quot;appUnit\&quot;:\&quot;center\&quot;,\&quot;bucId\&quot;:\&quot;250858\&quot;,\&quot;bucName\&quot;:\&quot; Alibaba Cloud\&quot;,\&quot;provider\&quot;:\&quot;aliyun\&quot;}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static ListNacosHistoryConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNacosHistoryConfigsRequest self = new ListNacosHistoryConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListNacosHistoryConfigsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListNacosHistoryConfigsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListNacosHistoryConfigsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListNacosHistoryConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNacosHistoryConfigsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListNacosHistoryConfigsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListNacosHistoryConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNacosHistoryConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNacosHistoryConfigsRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
