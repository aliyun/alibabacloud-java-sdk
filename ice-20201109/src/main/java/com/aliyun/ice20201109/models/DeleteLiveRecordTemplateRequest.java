// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the template to be deleted. To obtain the template ID, log on to the <a href="https://ice.console.aliyun.com/live-processing/template/list/record">Intelligent Media Services (IMS) console</a>, choose Real-time Media Processing &gt; Template Management, and then click the Recording tab. Alternatively, find the ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/448213.html">CreateLiveRecordTemplate</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordTemplateRequest self = new DeleteLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
