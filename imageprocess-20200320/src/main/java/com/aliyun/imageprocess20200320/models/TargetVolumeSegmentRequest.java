// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TargetVolumeSegmentRequest extends TeaModel {
    @NameInMap("CancerType")
    public String cancerType;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("TargetVolumeType")
    public String targetVolumeType;

    @NameInMap("URLList")
    public java.util.List<TargetVolumeSegmentRequestURLList> URLList;

    public static TargetVolumeSegmentRequest build(java.util.Map<String, ?> map) throws Exception {
        TargetVolumeSegmentRequest self = new TargetVolumeSegmentRequest();
        return TeaModel.build(map, self);
    }

    public TargetVolumeSegmentRequest setCancerType(String cancerType) {
        this.cancerType = cancerType;
        return this;
    }
    public String getCancerType() {
        return this.cancerType;
    }

    public TargetVolumeSegmentRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public TargetVolumeSegmentRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public TargetVolumeSegmentRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public TargetVolumeSegmentRequest setTargetVolumeType(String targetVolumeType) {
        this.targetVolumeType = targetVolumeType;
        return this;
    }
    public String getTargetVolumeType() {
        return this.targetVolumeType;
    }

    public TargetVolumeSegmentRequest setURLList(java.util.List<TargetVolumeSegmentRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<TargetVolumeSegmentRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class TargetVolumeSegmentRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static TargetVolumeSegmentRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            TargetVolumeSegmentRequestURLList self = new TargetVolumeSegmentRequestURLList();
            return TeaModel.build(map, self);
        }

        public TargetVolumeSegmentRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
