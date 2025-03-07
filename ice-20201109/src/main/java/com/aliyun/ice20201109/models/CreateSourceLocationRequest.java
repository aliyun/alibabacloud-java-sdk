// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSourceLocationRequest extends TeaModel {
    /**
     * <p>The protocol and hostname of the source location.</p>
     * <p>This parameter is required.</p>
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
     * <p><a href="http://xxxxx.com">http://xxxxx.com</a></p>
     */
    @NameInMap("SegmentDeliveryUrl")
    public String segmentDeliveryUrl;

    /**
     * <p>The name of the source location.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourcelocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    public static CreateSourceLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceLocationRequest self = new CreateSourceLocationRequest();
        return TeaModel.build(map, self);
    }

    public CreateSourceLocationRequest setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public CreateSourceLocationRequest setEnableSegmentDelivery(Boolean enableSegmentDelivery) {
        this.enableSegmentDelivery = enableSegmentDelivery;
        return this;
    }
    public Boolean getEnableSegmentDelivery() {
        return this.enableSegmentDelivery;
    }

    public CreateSourceLocationRequest setSegmentDeliveryUrl(String segmentDeliveryUrl) {
        this.segmentDeliveryUrl = segmentDeliveryUrl;
        return this;
    }
    public String getSegmentDeliveryUrl() {
        return this.segmentDeliveryUrl;
    }

    public CreateSourceLocationRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

}
