// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DeleteLayer4RuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InstanceId&quot;:&quot;0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:80}</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    public static DeleteLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayer4RuleRequest self = new DeleteLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLayer4RuleRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
