// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSourceLocationRequest extends TeaModel {
    /**
     * <p>The protocol and hostname of the source location.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx.com">http://xxx.com</a></p>
     */
    @NameInMap("BaseUrl")
    public String baseUrl;

    /**
     * <p>Specifies whether to use an independent domain name to access the segments.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSegmentDelivery")
    public Boolean enableSegmentDelivery;

    /**
     * <p>The domain name used to access the segments.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx.com">http://xxxx.com</a></p>
     */
    @NameInMap("SegmentDeliveryUrl")
    public String segmentDeliveryUrl;

    /**
     * <p>The name of the source location.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    public static UpdateSourceLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSourceLocationRequest self = new UpdateSourceLocationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSourceLocationRequest setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public UpdateSourceLocationRequest setEnableSegmentDelivery(Boolean enableSegmentDelivery) {
        this.enableSegmentDelivery = enableSegmentDelivery;
        return this;
    }
    public Boolean getEnableSegmentDelivery() {
        return this.enableSegmentDelivery;
    }

    public UpdateSourceLocationRequest setSegmentDeliveryUrl(String segmentDeliveryUrl) {
        this.segmentDeliveryUrl = segmentDeliveryUrl;
        return this;
    }
    public String getSegmentDeliveryUrl() {
        return this.segmentDeliveryUrl;
    }

    public UpdateSourceLocationRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

}
