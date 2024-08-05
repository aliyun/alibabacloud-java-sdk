// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    /**
     * <p>Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-hz-b3c5dadd5***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>CEB6EC62-B6C7-5082-A45A-45A204724AC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the tag exists. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("TagStatus")
    public Boolean tagStatus;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setTagStatus(Boolean tagStatus) {
        this.tagStatus = tagStatus;
        return this;
    }
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

}
