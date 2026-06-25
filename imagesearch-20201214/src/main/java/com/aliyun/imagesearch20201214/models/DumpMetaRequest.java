// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaRequest extends TeaModel {
    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, refer to <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Make sure you distinguish between them.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imagesearchName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static DumpMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaRequest self = new DumpMetaRequest();
        return TeaModel.build(map, self);
    }

    public DumpMetaRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
