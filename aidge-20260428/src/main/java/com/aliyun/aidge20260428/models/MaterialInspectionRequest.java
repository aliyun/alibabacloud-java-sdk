// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MaterialInspectionRequest extends TeaModel {
    /**
     * <p>apiId</p>
     * 
     * <strong>example:</strong>
     * <p>fb0012f49b004f889207a3c5e6ef8da9</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The URL of the reference image. Optional. When this parameter is not empty, the system performs multi-image differential comparison.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/reference.jpg">https://example.com/reference.jpg</a></p>
     */
    @NameInMap("ImageRefer")
    public String imageRefer;

    /**
     * <p>The URL of the target image to be inspected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/store.jpg">https://example.com/store.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The business request identity. Optional. This value is returned as-is in the response for Tracing Analysis purposes.</p>
     * 
     * <strong>example:</strong>
     * <p>req-2026-06-04-001</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    /**
     * <p>The rule prompt in natural language that describes the inspection criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>The door-shaped display stand must be placed in the entrance area; the functional display card must be placed on the counter surface</p>
     */
    @NameInMap("Rules")
    public String rules;

    public static MaterialInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        MaterialInspectionRequest self = new MaterialInspectionRequest();
        return TeaModel.build(map, self);
    }

    public MaterialInspectionRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public MaterialInspectionRequest setImageRefer(String imageRefer) {
        this.imageRefer = imageRefer;
        return this;
    }
    public String getImageRefer() {
        return this.imageRefer;
    }

    public MaterialInspectionRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public MaterialInspectionRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public MaterialInspectionRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
