// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsShrinkRequest extends TeaModel {
    /**
     * <p>The category of the resource group. Valid values:</p>
     * <ul>
     * <li>default: public resource group.</li>
     * <li>single: dedicated resource group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("BizExtKey")
    public String bizExtKey;

    /**
     * <p>The keyword. Used for fuzzy matching of resource group names and resource group identifiers.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The type ID of the resource group to query. Valid values:</p>
     * <ul>
     * <li>0: DataWorks</li>
     * <li>1: scheduling</li>
     * <li>2: MaxCompute</li>
     * <li>3: PAI</li>
     * <li>4: data integration</li>
     * <li>7: the purchase resource ID generated when you purchase a dedicated schedule resource group</li>
     * <li>9: dataService</li>
     * <li>Default value: 1 (scheduling).</li>
     * </ul>
     * <p>When the value represents an engine, the returned resource group list contains the resource groups created when you purchased that type of engine.</p>
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
     * <p>The list of tags.</p>
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
