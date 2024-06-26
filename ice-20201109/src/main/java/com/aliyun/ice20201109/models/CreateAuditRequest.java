// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAuditRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;MediaId&quot;: &quot;93ab850b4f<em><strong><strong>b54b6e91d24d81d4&quot;,
     *             &quot;Status&quot;: &quot;Normal&quot;
     *       },
     *       {
     *             &quot;MediaId&quot;: &quot;f867fbfb58</strong></strong></em>8bbab65c4480ae1d&quot;,
     *             &quot;Status&quot;: &quot;Blocked&quot;,
     *             &quot;Reason&quot;: &quot;xxxx&quot;,
     *             &quot;Comment&quot;: &quot;xxxx&quot;
     *       }
     * ]</p>
     */
    @NameInMap("AuditContent")
    public String auditContent;

    public static CreateAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditRequest self = new CreateAuditRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuditRequest setAuditContent(String auditContent) {
        this.auditContent = auditContent;
        return this;
    }
    public String getAuditContent() {
        return this.auditContent;
    }

}
