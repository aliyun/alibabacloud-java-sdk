// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcBMDRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>HTTP_FILES</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("URLList")
    public java.util.List<CalcBMDRequestURLList> URLList;

    public static CalcBMDRequest build(java.util.Map<String, ?> map) throws Exception {
        CalcBMDRequest self = new CalcBMDRequest();
        return TeaModel.build(map, self);
    }

    public CalcBMDRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public CalcBMDRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CalcBMDRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CalcBMDRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CalcBMDRequest setURLList(java.util.List<CalcBMDRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<CalcBMDRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class CalcBMDRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/xxx/0001.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/xxx/0001.dcm</a></p>
         */
        @NameInMap("URL")
        public String URL;

        public static CalcBMDRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            CalcBMDRequestURLList self = new CalcBMDRequestURLList();
            return TeaModel.build(map, self);
        }

        public CalcBMDRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
