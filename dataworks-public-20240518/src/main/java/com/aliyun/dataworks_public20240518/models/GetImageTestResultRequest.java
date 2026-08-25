// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetImageTestResultRequest extends TeaModel {
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
     * <p>The test process ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    public static GetImageTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageTestResultRequest self = new GetImageTestResultRequest();
        return TeaModel.build(map, self);
    }

    public GetImageTestResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetImageTestResultRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
