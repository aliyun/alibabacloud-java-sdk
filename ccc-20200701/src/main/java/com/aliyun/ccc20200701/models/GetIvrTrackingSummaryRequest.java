// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetIvrTrackingSummaryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-489361145506897920</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0f7ad007-ab50-4b3d-a87a-56864eb40dab</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetIvrTrackingSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIvrTrackingSummaryRequest self = new GetIvrTrackingSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetIvrTrackingSummaryRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetIvrTrackingSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
