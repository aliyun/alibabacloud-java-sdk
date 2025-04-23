// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobTemplatesRequest extends TeaModel {
    /**
     * <p>The IDs of the job templates that you want to delete. You can specify a maximum of 20 job template IDs.</p>
     * <p>Format of job template IDs: <code>[{&quot;Id&quot;: &quot;0.sched****&quot;},{&quot;Id&quot;: &quot;1.sched****&quot;}]</code>. Separate multiple job template IDs with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87248.html">ListJobTemplates</a> operation to query job template IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Id&quot;:&quot;ehpc-job-tmpl-6RVcMK****&quot;},{&quot;Id&quot;: &quot;ehpc-job-tmpl-6RxO5y****&quot;}]</p>
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
