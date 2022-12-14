// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("Threshold")
    public Float threshold;

    // 1
    @NameInMap("URLList")
    public java.util.List<DetectLungNoduleAdvanceRequestURLList> URLList;

    public static DetectLungNoduleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLungNoduleAdvanceRequest self = new DetectLungNoduleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectLungNoduleAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectLungNoduleAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectLungNoduleAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectLungNoduleAdvanceRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public DetectLungNoduleAdvanceRequest setURLList(java.util.List<DetectLungNoduleAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectLungNoduleAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectLungNoduleAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static DetectLungNoduleAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleAdvanceRequestURLList self = new DetectLungNoduleAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
