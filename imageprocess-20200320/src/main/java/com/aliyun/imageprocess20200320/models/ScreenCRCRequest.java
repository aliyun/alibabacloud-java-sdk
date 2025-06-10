// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenCRCRequest extends TeaModel {
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
     * <p>HTTP_FILES</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

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
    public java.util.List<ScreenCRCRequestURLList> URLList;

    public static ScreenCRCRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenCRCRequest self = new ScreenCRCRequest();
        return TeaModel.build(map, self);
    }

    public ScreenCRCRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenCRCRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenCRCRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenCRCRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenCRCRequest setURLList(java.util.List<ScreenCRCRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenCRCRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenCRCRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/xxx/0001.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/xxx/0001.dcm</a></p>
         */
        @NameInMap("URL")
        public String URL;

        public static ScreenCRCRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenCRCRequestURLList self = new ScreenCRCRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenCRCRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
