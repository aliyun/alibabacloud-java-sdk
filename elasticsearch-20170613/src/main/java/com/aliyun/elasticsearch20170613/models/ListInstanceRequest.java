// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    /**
     * <p>The instance name. Fuzzy search is supported. For example, if you search for all instances matching <strong>abc</strong>, all instances named <strong>abc</strong>, <strong>abcde</strong>, <strong>xyabc</strong>, and <strong>xabcy</strong> may be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunes_test1</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The instance version.</p>
     * 
     * <strong>example:</strong>
     * <p>6.7_with_X-Pack</p>
     */
    @NameInMap("esVersion")
    public String esVersion;

    /**
     * <p>The edition type of the instance. Valid values:</p>
     * <ul>
     * <li><p>x-pack: Commercial Edition</p>
     * </li>
     * <li><p>advanced/IS: Enhanced Edition</p>
     * </li>
     * <li><p>community: Basic Edition</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("instanceCategory")
    public String instanceCategory;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-v641a0ta3000g****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The page number of the instance list.
     * Start value: <strong>1</strong>, default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p>postpaid: pay-as-you-go</p>
     * </li>
     * <li><p>prepaid: subscription</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>postpaid</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzvowej3i****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries per page for paginated queries. Maximum value: <strong>100</strong>, default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    @NameInMap("status")
    public String status;

    /**
     * <p>The instance tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tagKey&quot;:&quot;key1&quot;,&quot;tagValue&quot;:&quot;value1&quot;}]</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The ID of the virtual private cloud (VPC) where the instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp16k1dvzxtmagcva****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
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

    public ListInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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
