// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertNotifyTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>The list of notification template IDs.</p>
     */
    @NameInMap("alertNotifyTemplateIds")
    public String alertNotifyTemplateIdsShrink;

    /**
     * <p>The notification template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert notification template</p>
     */
    @NameInMap("alertNotifyTemplateName")
    public String alertNotifyTemplateName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The template locale.</p>
     * 
     * <strong>example:</strong>
     * <p>GO</p>
     */
    @NameInMap("programLang")
    public String programLang;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>DING</p>
     */
    @NameInMap("type")
    public String type;

    public static ListAlertNotifyTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotifyTemplatesShrinkRequest self = new ListAlertNotifyTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertNotifyTemplatesShrinkRequest setAlertNotifyTemplateIdsShrink(String alertNotifyTemplateIdsShrink) {
        this.alertNotifyTemplateIdsShrink = alertNotifyTemplateIdsShrink;
        return this;
    }
    public String getAlertNotifyTemplateIdsShrink() {
        return this.alertNotifyTemplateIdsShrink;
    }

    public ListAlertNotifyTemplatesShrinkRequest setAlertNotifyTemplateName(String alertNotifyTemplateName) {
        this.alertNotifyTemplateName = alertNotifyTemplateName;
        return this;
    }
    public String getAlertNotifyTemplateName() {
        return this.alertNotifyTemplateName;
    }

    public ListAlertNotifyTemplatesShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertNotifyTemplatesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertNotifyTemplatesShrinkRequest setProgramLang(String programLang) {
        this.programLang = programLang;
        return this;
    }
    public String getProgramLang() {
        return this.programLang;
    }

    public ListAlertNotifyTemplatesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
