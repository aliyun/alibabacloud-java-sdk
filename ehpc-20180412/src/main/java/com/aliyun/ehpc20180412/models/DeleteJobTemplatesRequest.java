// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobTemplatesRequest extends TeaModel {
    /**
     * <p>The list of job templates. A maximum of 20 job templates can be deleted.</p>
     * <br>
     * <p>Format: `[{"Id": "0.sched****"},{"Id": "1.sched****"}]`. Separate multiple job templates with commas (,).</p>
     * <br>
     * <p>You can call the [ListJobTemplates](~~87248~~) operation to obtain the job template ID.</p>
     */
    @NameInMap("Templates")
    public String templates;

    public static DeleteJobTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplatesRequest self = new DeleteJobTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplatesRequest setTemplates(String templates) {
        this.templates = templates;
        return this;
    }
    public String getTemplates() {
        return this.templates;
    }

}
