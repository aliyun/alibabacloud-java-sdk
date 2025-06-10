// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectRibFractureAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ff51bfe-e73d-11ea-827d-506b4b3f3cf6</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("URLList")
    public java.util.List<DetectRibFractureAdvanceRequestURLList> URLList;

    public static DetectRibFractureAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectRibFractureAdvanceRequest self = new DetectRibFractureAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectRibFractureAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectRibFractureAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectRibFractureAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectRibFractureAdvanceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DetectRibFractureAdvanceRequest setURLList(java.util.List<DetectRibFractureAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectRibFractureAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectRibFractureAdvanceRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static DetectRibFractureAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureAdvanceRequestURLList self = new DetectRibFractureAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
