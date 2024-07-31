// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsShrinkRequest extends TeaModel {
    /**
     * <p>The category of the resource group. Valid values:</p>
     * <ul>
     * <li>default (default): shared resource group</li>
     * <li>single: exclusive resource group</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("BizExtKey")
    public String bizExtKey;

    /**
     * <p>The keyword that is used for fuzzy match by resource group name and identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The type of the resource group that you want to query. Valid values:</p>
     * <ul>
     * <li>0: DataWorks</li>
     * <li>1: scheduling</li>
     * <li>2: MaxCompute</li>
     * <li>3: Platform for AI (PAI)</li>
     * <li>4: Data Integration</li>
     * <li>7: exclusive resource group for scheduling (An ID is generated for the purchased resource when you purchase an exclusive resource group for scheduling.)</li>
     * <li>9: DataService Studio</li>
     * <li>Default value: 1</li>
     * </ul>
     * <p>If the value indicates a compute engine, the resource groups to query are the ones that were created when you purchased the compute engine.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResourceGroupType")
    public Integer resourceGroupType;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzbn7pti3zfa</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static ListResourceGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsShrinkRequest self = new ListResourceGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsShrinkRequest setBizExtKey(String bizExtKey) {
        this.bizExtKey = bizExtKey;
        return this;
    }
    public String getBizExtKey() {
        return this.bizExtKey;
    }

    public ListResourceGroupsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceGroupsShrinkRequest setResourceGroupType(Integer resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }
    public Integer getResourceGroupType() {
        return this.resourceGroupType;
    }

    public ListResourceGroupsShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ListResourceGroupsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
