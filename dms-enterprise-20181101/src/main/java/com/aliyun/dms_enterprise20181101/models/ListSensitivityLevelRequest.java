// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitivityLevelRequest extends TeaModel {
    /**
     * <p>The ID of the classification template. You can call the [ListClassificationTemplates](https://help.aliyun.com/document_detail/460613.html) operation to query the ID of the classification template.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The type of the classification template. You can call the [ListClassificationTemplates](https://help.aliyun.com/document_detail/460613.html) operation to query the type of the classification template.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   USER_DEFINE: a custom template.</p>
     * <p>*   INNER: a built-in template.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html) in the topic "Manage DMS tenants."</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListSensitivityLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitivityLevelRequest self = new ListSensitivityLevelRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitivityLevelRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ListSensitivityLevelRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ListSensitivityLevelRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
