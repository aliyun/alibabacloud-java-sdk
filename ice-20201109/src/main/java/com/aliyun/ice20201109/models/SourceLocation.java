// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SourceLocation extends TeaModel {
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
