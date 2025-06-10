// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DICOM</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Mask")
    public Long mask;

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
     * 
     * <strong>example:</strong>
     * <p>weiyi</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("URLList")
    public java.util.List<ScreenChestCTAdvanceRequestURLList> URLList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Verbose")
    public Long verbose;

    public static ScreenChestCTAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScreenChestCTAdvanceRequest self = new ScreenChestCTAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ScreenChestCTAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScreenChestCTAdvanceRequest setMask(Long mask) {
        this.mask = mask;
        return this;
    }
    public Long getMask() {
        return this.mask;
    }

    public ScreenChestCTAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ScreenChestCTAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ScreenChestCTAdvanceRequest setURLList(java.util.List<ScreenChestCTAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<ScreenChestCTAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public ScreenChestCTAdvanceRequest setVerbose(Long verbose) {
        this.verbose = verbose;
        return this;
    }
    public Long getVerbose() {
        return this.verbose;
    }

    public static class ScreenChestCTAdvanceRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/coronacases_org_001/1.2.112.92121.1.1689.19.2.2020040219072764787101585825****.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/coronacases_org_001/1.2.112.92121.1.1689.19.2.2020040219072764787101585825****.dcm</a></p>
         */
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static ScreenChestCTAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTAdvanceRequestURLList self = new ScreenChestCTAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
