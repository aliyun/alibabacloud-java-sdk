// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    /**
     * <p>The category name. The name must be 1 to 20 characters in length and can contain characters in the Unicode letter category, including letters, Chinese characters, and digits. The name can also contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ProductList</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The category type. Valid values:</p>
     * <ul>
     * <li>UNSTRUCTURED: category.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The instance ID of the data connector (Connector). Obtain this value from the Model Studio console.</p>
     * 
     * <strong>example:</strong>
     * <p>conn_xxxx</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The ID of the parent category. The new category is created under this parent category. If this parameter is left empty, a first-level category is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
     */
    @NameInMap("ParentCategoryId")
    public String parentCategoryId;

    public static AddCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryRequest self = new AddCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddCategoryRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public AddCategoryRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public AddCategoryRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public AddCategoryRequest setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public String getParentCategoryId() {
        return this.parentCategoryId;
    }

}
