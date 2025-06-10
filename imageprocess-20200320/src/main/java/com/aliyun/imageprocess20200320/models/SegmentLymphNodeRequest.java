// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentLymphNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CHEST</p>
     */
    @NameInMap("BodyPart")
    public String bodyPart;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DICOM</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("URLList")
    public java.util.List<SegmentLymphNodeRequestURLList> URLList;

    public static SegmentLymphNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentLymphNodeRequest self = new SegmentLymphNodeRequest();
        return TeaModel.build(map, self);
    }

    public SegmentLymphNodeRequest setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
        return this;
    }
    public String getBodyPart() {
        return this.bodyPart;
    }

    public SegmentLymphNodeRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public SegmentLymphNodeRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public SegmentLymphNodeRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public SegmentLymphNodeRequest setURLList(java.util.List<SegmentLymphNodeRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<SegmentLymphNodeRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class SegmentLymphNodeRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static SegmentLymphNodeRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            SegmentLymphNodeRequestURLList self = new SegmentLymphNodeRequestURLList();
            return TeaModel.build(map, self);
        }

        public SegmentLymphNodeRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
