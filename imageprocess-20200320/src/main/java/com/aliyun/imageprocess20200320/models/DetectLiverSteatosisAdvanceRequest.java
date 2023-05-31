// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLiverSteatosisAdvanceRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("URLList")
    public java.util.List<DetectLiverSteatosisAdvanceRequestURLList> URLList;

    public static DetectLiverSteatosisAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLiverSteatosisAdvanceRequest self = new DetectLiverSteatosisAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectLiverSteatosisAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectLiverSteatosisAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectLiverSteatosisAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectLiverSteatosisAdvanceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DetectLiverSteatosisAdvanceRequest setURLList(java.util.List<DetectLiverSteatosisAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectLiverSteatosisAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectLiverSteatosisAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static DetectLiverSteatosisAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectLiverSteatosisAdvanceRequestURLList self = new DetectLiverSteatosisAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectLiverSteatosisAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
