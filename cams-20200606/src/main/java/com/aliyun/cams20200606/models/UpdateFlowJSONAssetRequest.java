// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateFlowJSONAssetRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>Flow ID。</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static UpdateFlowJSONAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowJSONAssetRequest self = new UpdateFlowJSONAssetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowJSONAssetRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateFlowJSONAssetRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateFlowJSONAssetRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
