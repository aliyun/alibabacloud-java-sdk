// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafFilterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>characteristics</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <strong>example:</strong>
     * <p>http_custom_cc</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetWafFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWafFilterRequest self = new GetWafFilterRequest();
        return TeaModel.build(map, self);
    }

    public GetWafFilterRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetWafFilterRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetWafFilterRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public GetWafFilterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
