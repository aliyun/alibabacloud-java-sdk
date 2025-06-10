// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentOARAdvanceRequest extends TeaModel {
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
    public java.util.List<SegmentOARAdvanceRequestURLList> URLList;

    public static SegmentOARAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentOARAdvanceRequest self = new SegmentOARAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentOARAdvanceRequest setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
        return this;
    }
    public String getBodyPart() {
        return this.bodyPart;
    }

    public SegmentOARAdvanceRequest setContrast(Boolean contrast) {
        this.contrast = contrast;
        return this;
    }
    public Boolean getContrast() {
        return this.contrast;
    }

    public SegmentOARAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public SegmentOARAdvanceRequest setMaskList(java.util.List<Long> maskList) {
        this.maskList = maskList;
        return this;
    }
    public java.util.List<Long> getMaskList() {
        return this.maskList;
    }

    public SegmentOARAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public SegmentOARAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public SegmentOARAdvanceRequest setURLList(java.util.List<SegmentOARAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<SegmentOARAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class SegmentOARAdvanceRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static SegmentOARAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            SegmentOARAdvanceRequestURLList self = new SegmentOARAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public SegmentOARAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
