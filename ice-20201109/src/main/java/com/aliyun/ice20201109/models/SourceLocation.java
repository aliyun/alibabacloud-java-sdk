// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SourceLocation extends TeaModel {
    /**
     * <p>The ARN of the source location.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ims:mediaweaver:<regionId>:<UserId>:sourcelocation/MySourceLocation</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The base URL of the source location.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx.com">http://xxxx.com</a></p>
     */
    @NameInMap("BaseUrl")
    public String baseUrl;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-12T07:15:52Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-22T10:49:14Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The segment delivery server configurations.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://segmentdelivery.com">http://segmentdelivery.com</a></p>
     */
    @NameInMap("SegmentDeliveryConfigurations")
    public String segmentDeliveryConfigurations;

    /**
     * <p>The name of the source location.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    /**
     * <p>The status of the source location. 0: normal. 1: deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    public static SourceLocation build(java.util.Map<String, ?> map) throws Exception {
        SourceLocation self = new SourceLocation();
        return TeaModel.build(map, self);
    }

    public SourceLocation setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public SourceLocation setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public SourceLocation setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SourceLocation setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SourceLocation setSegmentDeliveryConfigurations(String segmentDeliveryConfigurations) {
        this.segmentDeliveryConfigurations = segmentDeliveryConfigurations;
        return this;
    }
    public String getSegmentDeliveryConfigurations() {
        return this.segmentDeliveryConfigurations;
    }

    public SourceLocation setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public SourceLocation setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

}
