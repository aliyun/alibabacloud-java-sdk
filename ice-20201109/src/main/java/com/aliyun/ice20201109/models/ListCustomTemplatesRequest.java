// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomTemplatesRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>CreateTimeDesc: Sorts by creation time in descending order.</li>
     * <li>CreateTimeAsc: Sorts by creation time in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number.</p>
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
     * <p>The template subtype ID. Valid values:</p>
     * <ul>
     * <li>Subtypes for transcode templates:<ul>
     * <li>1: Normal transcode template (Normal).</li>
     * <li>2: Audio transcode template (AudioTranscode).</li>
     * <li>3: Remux (Remux).</li>
     * <li>4: Narrowband HD 1.0 (NarrowBandV1).</li>
     * <li>5: Narrowband HD 2.0 (NarrowBandV2).</li>
     * </ul>
     * </li>
     * <li>Subtypes for snapshot templates:<ul>
     * <li>1: Normal snapshot or static snapshot (Normal).</li>
     * <li>2: Sprite snapshot (Sprite).</li>
     * <li>3: WebVTT snapshot (WebVtt).</li>
     * </ul>
     * </li>
     * <li>Subtypes for AI content moderation templates:<ul>
     * <li>1: Video moderation (Video).</li>
     * <li>2: Audio moderation (Audio).</li>
     * <li>3: Image moderation (Image).</li>
     * </ul>
     * </li>
     * <li>Subtypes for AI intelligent erasure templates:<ul>
     * <li>1: Logo erasure (VideoDelogo).</li>
     * <li>2: Subtitle erasure (VideoDetext).</li>
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
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The templatetype. Separate multiple values with commas. Valid values:</p>
     * <ul>
     * <li>1: Transcode template.</li>
     * <li>2: Snapshot template.</li>
     * <li>3: Animated image template.</li>
     * <li>4: Image watermark template.</li>
     * <li>5: Text watermark template.</li>
     * <li>6: Subtitle template.</li>
     * <li>7: AI content moderation.</li>
     * <li>8: AI intelligent cover.</li>
     * <li>9: AI intelligent erasure.</li>
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
