// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    /**
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>advanced</p>
     */
    @NameInMap("esVersion")
    public String esVersion;

    /**
     * <p>The number of data nodes.</p>
     */
    @NameInMap("instanceCategory")
    public String instanceCategory;

    /**
     * <p>postpaid</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>[{"tagKey":"key1","tagValue":"value1"}]</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Specifies whether to include dedicated master nodes. Valid values:</p>
     * <br>
     * <p>*   true: The files contain data that is dumped to the IA storage medium.</p>
     * <p>*   false: The files do not contain data that is dumped to the IA storage medium.</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>vpc-bp16k1dvzxtmagcva\\*\\*\\*\\*</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The header of the response.</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The returned data.</p>
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
