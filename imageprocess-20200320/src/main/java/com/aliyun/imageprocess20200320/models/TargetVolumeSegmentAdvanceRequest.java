// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TargetVolumeSegmentAdvanceRequest extends TeaModel {
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
    public java.util.List<TargetVolumeSegmentAdvanceRequestURLList> URLList;

    public static TargetVolumeSegmentAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TargetVolumeSegmentAdvanceRequest self = new TargetVolumeSegmentAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public TargetVolumeSegmentAdvanceRequest setCancerType(String cancerType) {
        this.cancerType = cancerType;
        return this;
    }
    public String getCancerType() {
        return this.cancerType;
    }

    public TargetVolumeSegmentAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public TargetVolumeSegmentAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public TargetVolumeSegmentAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public TargetVolumeSegmentAdvanceRequest setTargetVolumeType(String targetVolumeType) {
        this.targetVolumeType = targetVolumeType;
        return this;
    }
    public String getTargetVolumeType() {
        return this.targetVolumeType;
    }

    public TargetVolumeSegmentAdvanceRequest setURLList(java.util.List<TargetVolumeSegmentAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<TargetVolumeSegmentAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class TargetVolumeSegmentAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static TargetVolumeSegmentAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            TargetVolumeSegmentAdvanceRequestURLList self = new TargetVolumeSegmentAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public TargetVolumeSegmentAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
