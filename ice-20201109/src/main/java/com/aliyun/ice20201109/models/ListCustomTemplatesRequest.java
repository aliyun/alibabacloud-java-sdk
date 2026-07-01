// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomTemplatesRequest extends TeaModel {
    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>test-template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order of the results. Valid values:</p>
     * <ul>
     * <li><p><code>CreationTime:Desc</code>: Sorts the results by Creation Time in descending order.</p>
     * </li>
     * <li><p><code>CreationTime:Asc</code>: Sorts the results by Creation Time in ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number of the results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The subtype of the template. This parameter applies only when <code>Type</code> is set to 1, 2, 7, or 9.</p>
     * <ul>
     * <li><p>Transcoding Template subtypes:</p>
     * <ul>
     * <li><p>1: Normal (<code>Normal</code>)</p>
     * </li>
     * <li><p>2: Audio-only (<code>AudioTranscode</code>)</p>
     * </li>
     * <li><p>3: Remuxing (<code>Remux</code>)</p>
     * </li>
     * <li><p>4: Narrowband HD 1.0 (<code>NarrowBandV1</code>)</p>
     * </li>
     * <li><p>5: Narrowband HD 2.0 (<code>NarrowBandV2</code>)</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Screenshot Template subtypes:</p>
     * <ul>
     * <li><p>1: Normal (<code>Normal</code>)</p>
     * </li>
     * <li><p>2: Sprite Image (<code>Sprite</code>)</p>
     * </li>
     * <li><p>3: WebVTT (<code>WebVtt</code>)</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>AI Content Moderation subtypes:</p>
     * <ul>
     * <li><p>1: Video moderation (<code>Video</code>)</p>
     * </li>
     * <li><p>2: Audio moderation (<code>Audio</code>)</p>
     * </li>
     * <li><p>3: Image moderation (<code>Image</code>)</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>AI-powered Object Removal subtypes:</p>
     * <ul>
     * <li><p>1: Logo Removal (<code>VideoDelogo</code>)</p>
     * </li>
     * <li><p>2: Text Removal (<code>VideoDetext</code>)</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Subtype")
    public String subtype;

    /**
     * <p>The ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The type of the template. Valid values:</p>
     * <ul>
     * <li><p>1: Transcoding Template</p>
     * </li>
     * <li><p>2: Screenshot Template</p>
     * </li>
     * <li><p>3: Animated GIF Template</p>
     * </li>
     * <li><p>4: Image Watermark Template</p>
     * </li>
     * <li><p>5: Text Watermark Template</p>
     * </li>
     * <li><p>6: Subtitle Template</p>
     * </li>
     * <li><p>7: AI Content Moderation</p>
     * </li>
     * <li><p>8: AI-powered Smart Cover</p>
     * </li>
     * <li><p>9: AI-powered Object Removal</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCustomTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomTemplatesRequest self = new ListCustomTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCustomTemplatesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListCustomTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomTemplatesRequest setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }
    public String getSubtype() {
        return this.subtype;
    }

    public ListCustomTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListCustomTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
