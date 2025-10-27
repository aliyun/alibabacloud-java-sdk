// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class PublishFlowVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-10-24T14:11:26+08:00</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>my flow description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>my-flow-name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>294D68C1-5108-5971-853A-1A9CC87B4816</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Version")
    public String version;

    public static PublishFlowVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowVersionResponseBody self = new PublishFlowVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishFlowVersionResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PublishFlowVersionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishFlowVersionResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public PublishFlowVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishFlowVersionResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
