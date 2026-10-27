// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertNotifyTemplatesShrinkRequest extends TeaModel {
    @NameInMap("alertNotifyTemplateIds")
    public String alertNotifyTemplateIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>告警通知模板</p>
     */
    @NameInMap("alertNotifyTemplateName")
    public String alertNotifyTemplateName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>GO</p>
     */
    @NameInMap("programLang")
    public String programLang;

    /**
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
