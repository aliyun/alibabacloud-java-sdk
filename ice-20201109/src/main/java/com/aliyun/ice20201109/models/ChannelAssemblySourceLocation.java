// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblySourceLocation extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("BaseUrl")
    public String baseUrl;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("SegmentDeliveryConfigurations")
    public String segmentDeliveryConfigurations;

    @NameInMap("SourceLocationName")
    public String sourceLocationName;

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
