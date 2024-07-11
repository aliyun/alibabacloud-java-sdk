// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitivityLevelRequest extends TeaModel {
    /**
     * <p>The ID of the classification template. You can call the <a href="https://help.aliyun.com/document_detail/460613.html">ListClassificationTemplates</a> operation to query the ID of the classification template.</p>
     * 
     * <strong>example:</strong>
     * <p>15**</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The type of the classification template. You can call the <a href="https://help.aliyun.com/document_detail/460613.html">ListClassificationTemplates</a> operation to query the type of the classification template.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>USER_DEFINE: a custom template.</li>
     * <li>INNER: a built-in template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> in the topic &quot;Manage DMS tenants.&quot;</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20***</p>
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
