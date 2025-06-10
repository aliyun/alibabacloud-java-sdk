// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenLCAdvanceRequest extends TeaModel {
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
    public java.util.List<ScreenLCAdvanceRequestURLList> URLList;

    public static ScreenLCAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenLCAdvanceRequest self = new ScreenLCAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScreenLCAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenLCAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ScreenLCAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenLCAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenLCAdvanceRequest setURLList(java.util.List<ScreenLCAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenLCAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class ScreenLCAdvanceRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/xxx/0001.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/xxx/0001.dcm</a></p>
         */
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static ScreenLCAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCAdvanceRequestURLList self = new ScreenLCAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenLCAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
