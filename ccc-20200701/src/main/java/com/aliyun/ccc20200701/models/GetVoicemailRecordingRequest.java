// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetVoicemailRecordingRequest extends TeaModel {
    /**
     * <p>Call ID. Ensure that this call ID has a voicemail message; otherwise, the return result will contain no data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-12515239414412****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetVoicemailRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVoicemailRecordingRequest self = new GetVoicemailRecordingRequest();
        return TeaModel.build(map, self);
    }

    public GetVoicemailRecordingRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetVoicemailRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
