// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RestoreArchivedRecordingsRequest extends TeaModel {
    /**
     * <p>List of contact IDs, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;job-216750038017142784\&quot;]</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>Cloud Contact Center instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RestoreArchivedRecordingsRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreArchivedRecordingsRequest self = new RestoreArchivedRecordingsRequest();
        return TeaModel.build(map, self);
    }

    public RestoreArchivedRecordingsRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public RestoreArchivedRecordingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
