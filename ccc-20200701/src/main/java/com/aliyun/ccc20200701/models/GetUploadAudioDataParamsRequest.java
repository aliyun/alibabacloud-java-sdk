// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetUploadAudioDataParamsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-38860977107324****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetUploadAudioDataParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadAudioDataParamsRequest self = new GetUploadAudioDataParamsRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadAudioDataParamsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetUploadAudioDataParamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
