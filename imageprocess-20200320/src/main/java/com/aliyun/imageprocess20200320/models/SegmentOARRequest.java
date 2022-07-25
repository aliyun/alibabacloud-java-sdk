// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentOARRequest extends TeaModel {
    @NameInMap("BodyPart")
    public String bodyPart;

    @NameInMap("Contrast")
    public Boolean contrast;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("MaskList")
    public java.util.List<Long> maskList;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

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
