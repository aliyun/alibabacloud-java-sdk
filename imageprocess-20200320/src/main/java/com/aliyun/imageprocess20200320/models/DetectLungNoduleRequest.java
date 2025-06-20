// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleRequest extends TeaModel {
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
     * <p>0001</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>weiyi</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <strong>example:</strong>
     * <p>0.60</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    /**
     * <p>1</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("URLList")
    public java.util.List<DetectLungNoduleRequestURLList> URLList;

    public static DetectLungNoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLungNoduleRequest self = new DetectLungNoduleRequest();
        return TeaModel.build(map, self);
    }

    public DetectLungNoduleRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectLungNoduleRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectLungNoduleRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectLungNoduleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public DetectLungNoduleRequest setURLList(java.util.List<DetectLungNoduleRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectLungNoduleRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectLungNoduleRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static DetectLungNoduleRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleRequestURLList self = new DetectLungNoduleRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
