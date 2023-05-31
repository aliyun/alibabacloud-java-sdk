// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLiverSteatosisRequest extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("URLList")
    public java.util.List<DetectLiverSteatosisRequestURLList> URLList;

    public static DetectLiverSteatosisRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLiverSteatosisRequest self = new DetectLiverSteatosisRequest();
        return TeaModel.build(map, self);
    }

    public DetectLiverSteatosisRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectLiverSteatosisRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectLiverSteatosisRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectLiverSteatosisRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DetectLiverSteatosisRequest setURLList(java.util.List<DetectLiverSteatosisRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectLiverSteatosisRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectLiverSteatosisRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static DetectLiverSteatosisRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectLiverSteatosisRequestURLList self = new DetectLiverSteatosisRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectLiverSteatosisRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
