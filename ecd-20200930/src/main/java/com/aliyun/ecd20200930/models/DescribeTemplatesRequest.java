// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeTemplatesRequest extends TeaModel {
    /**
     * <p>Region filter for template queries.</p>
     * <blockquote>
     * <p>If you set this parameter, results exclude configurations for other regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <blockquote>
     * <p>This parameter is not available for public use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Cloud Desktop image ID. You can find this ID on the Image Management page. Supported image types include OS images and custom images.</p>
     * 
     * <strong>example:</strong>
     * <p>m-dnz9xjgbm8*****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Keyword for fuzzy search. Searches template IDs and template names.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Page number for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Maximum number of entries per page for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Product type. Set this parameter to <code>CloudDesktop</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>List of template IDs to query.</p>
     */
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    /**
     * <p>Query by template name.</p>
     * 
     * <strong>example:</strong>
     * <p>My cloud desktop template 001</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Template type to query. If you omit this parameter, the system returns all template types.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_TEMPLATE</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static DescribeTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesRequest self = new DescribeTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeTemplatesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeTemplatesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplatesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeTemplatesRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public DescribeTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DescribeTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
