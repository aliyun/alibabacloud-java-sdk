// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectRibFractureRequest extends TeaModel {
    @NameInMap("URLList")
    @Validation(required = true)
    public java.util.List<DetectRibFractureRequestURLList> URLList;

    @NameInMap("DataFormat")
    @Validation(required = true)
    public String dataFormat;

    @NameInMap("OrgName")
    @Validation(required = true)
    public String orgName;

    @NameInMap("OrgId")
    @Validation(required = true)
    public String orgId;

    @NameInMap("SourceType")
    @Validation(required = true)
    public String sourceType;

    public static DetectRibFractureRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectRibFractureRequest self = new DetectRibFractureRequest();
        return TeaModel.build(map, self);
    }

    public DetectRibFractureRequest setURLList(java.util.List<DetectRibFractureRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectRibFractureRequestURLList> getURLList() {
        return this.URLList;
    }

    public DetectRibFractureRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectRibFractureRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectRibFractureRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectRibFractureRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class DetectRibFractureRequestURLList extends TeaModel {
        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static DetectRibFractureRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureRequestURLList self = new DetectRibFractureRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
