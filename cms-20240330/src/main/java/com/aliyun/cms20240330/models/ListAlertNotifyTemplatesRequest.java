// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertNotifyTemplatesRequest extends TeaModel {
    @NameInMap("alertNotifyTemplateIds")
    public java.util.List<String> alertNotifyTemplateIds;

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

    public static ListAlertNotifyTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotifyTemplatesRequest self = new ListAlertNotifyTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertNotifyTemplatesRequest setAlertNotifyTemplateIds(java.util.List<String> alertNotifyTemplateIds) {
        this.alertNotifyTemplateIds = alertNotifyTemplateIds;
        return this;
    }
    public java.util.List<String> getAlertNotifyTemplateIds() {
        return this.alertNotifyTemplateIds;
    }

    public ListAlertNotifyTemplatesRequest setAlertNotifyTemplateName(String alertNotifyTemplateName) {
        this.alertNotifyTemplateName = alertNotifyTemplateName;
        return this;
    }
    public String getAlertNotifyTemplateName() {
        return this.alertNotifyTemplateName;
    }

    public ListAlertNotifyTemplatesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertNotifyTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertNotifyTemplatesRequest setProgramLang(String programLang) {
        this.programLang = programLang;
        return this;
    }
    public String getProgramLang() {
        return this.programLang;
    }

    public ListAlertNotifyTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
