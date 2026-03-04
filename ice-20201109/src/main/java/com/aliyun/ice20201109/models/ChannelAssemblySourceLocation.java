// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblySourceLocation extends TeaModel {
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
     * <p>The time when the source location was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-29T02:03:17Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the source location was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-29T02:03:17Z</p>
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

    public static ChannelAssemblySourceLocation build(java.util.Map<String, ?> map) throws Exception {
        ChannelAssemblySourceLocation self = new ChannelAssemblySourceLocation();
        return TeaModel.build(map, self);
    }

    public ChannelAssemblySourceLocation setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ChannelAssemblySourceLocation setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ChannelAssemblySourceLocation setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ChannelAssemblySourceLocation setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ChannelAssemblySourceLocation setSegmentDeliveryConfigurations(String segmentDeliveryConfigurations) {
        this.segmentDeliveryConfigurations = segmentDeliveryConfigurations;
        return this;
    }
    public String getSegmentDeliveryConfigurations() {
        return this.segmentDeliveryConfigurations;
    }

    public ChannelAssemblySourceLocation setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public ChannelAssemblySourceLocation setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

}
