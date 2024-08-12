// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>71b396fa-1*********-70b7c0</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Uincall</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    public static ListFlashSmsTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsTemplatesRequest self = new ListFlashSmsTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsTemplatesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListFlashSmsTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFlashSmsTemplatesRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
