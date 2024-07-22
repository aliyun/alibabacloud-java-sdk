// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    /**
     * <p>cn-hangzhou-i</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunes_test1</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>advanced</p>
     * 
     * <strong>example:</strong>
     * <p>6.7_with_X-Pack</p>
     */
    @NameInMap("esVersion")
    public String esVersion;

    /**
     * <p>The number of data nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("instanceCategory")
    public String instanceCategory;

    /**
     * <p>postpaid</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-v641a0ta3000g****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>[{&quot;tagKey&quot;:&quot;key1&quot;,&quot;tagValue&quot;:&quot;value1&quot;}]</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Specifies whether to include dedicated master nodes. Valid values:</p>
     * <ul>
     * <li>true: The files contain data that is dumped to the IA storage medium.</li>
     * <li>false: The files do not contain data that is dumped to the IA storage medium.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>postpaid</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzvowej3i****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>vpc-bp16k1dvzxtmagcva\<em>\</em>\<em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The header of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tagKey&quot;:&quot;key1&quot;,&quot;tagValue&quot;:&quot;value1&quot;}]</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp16k1dvzxtmagcva****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListInstanceRequest setEsVersion(String esVersion) {
        this.esVersion = esVersion;
        return this;
    }
    public String getEsVersion() {
        return this.esVersion;
    }

    public ListInstanceRequest setInstanceCategory(String instanceCategory) {
        this.instanceCategory = instanceCategory;
        return this;
    }
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    public ListInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstanceRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListInstanceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ListInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
