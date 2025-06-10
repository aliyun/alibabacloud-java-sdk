// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentOARRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CHEST</p>
     */
    @NameInMap("BodyPart")
    public String bodyPart;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Contrast")
    public Boolean contrast;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NIFTI</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("MaskList")
    public java.util.List<Long> maskList;

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
    @NameInMap("URLList")
    public java.util.List<SegmentOARRequestURLList> URLList;

    public static SegmentOARRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentOARRequest self = new SegmentOARRequest();
        return TeaModel.build(map, self);
    }

    public SegmentOARRequest setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
        return this;
    }
    public String getBodyPart() {
        return this.bodyPart;
    }

    public SegmentOARRequest setContrast(Boolean contrast) {
        this.contrast = contrast;
        return this;
    }
    public Boolean getContrast() {
        return this.contrast;
    }

    public SegmentOARRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public SegmentOARRequest setMaskList(java.util.List<Long> maskList) {
        this.maskList = maskList;
        return this;
    }
    public java.util.List<Long> getMaskList() {
        return this.maskList;
    }

    public SegmentOARRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public SegmentOARRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public SegmentOARRequest setURLList(java.util.List<SegmentOARRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<SegmentOARRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class SegmentOARRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static SegmentOARRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            SegmentOARRequestURLList self = new SegmentOARRequestURLList();
            return TeaModel.build(map, self);
        }

        public SegmentOARRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
