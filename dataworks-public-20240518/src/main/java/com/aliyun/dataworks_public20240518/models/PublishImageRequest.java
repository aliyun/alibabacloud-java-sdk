// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PublishImageRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The image publish execution ID, which is used as an idempotence identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    public static PublishImageRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishImageRequest self = new PublishImageRequest();
        return TeaModel.build(map, self);
    }

    public PublishImageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PublishImageRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
