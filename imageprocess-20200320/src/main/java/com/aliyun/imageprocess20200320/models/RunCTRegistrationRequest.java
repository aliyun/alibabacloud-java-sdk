// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationRequest extends TeaModel {
    /**
     * <p>DICOM。</p>
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
     */
    @NameInMap("FloatingList")
    public java.util.List<RunCTRegistrationRequestFloatingList> floatingList;

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
    @NameInMap("ReferenceList")
    public java.util.List<RunCTRegistrationRequestReferenceList> referenceList;

    public static RunCTRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCTRegistrationRequest self = new RunCTRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public RunCTRegistrationRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public RunCTRegistrationRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public RunCTRegistrationRequest setFloatingList(java.util.List<RunCTRegistrationRequestFloatingList> floatingList) {
        this.floatingList = floatingList;
        return this;
    }
    public java.util.List<RunCTRegistrationRequestFloatingList> getFloatingList() {
        return this.floatingList;
    }

    public RunCTRegistrationRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public RunCTRegistrationRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RunCTRegistrationRequest setReferenceList(java.util.List<RunCTRegistrationRequestReferenceList> referenceList) {
        this.referenceList = referenceList;
        return this;
    }
    public java.util.List<RunCTRegistrationRequestReferenceList> getReferenceList() {
        return this.referenceList;
    }

    public static class RunCTRegistrationRequestFloatingList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/flt/34_P18.4.1.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/flt/34_P18.4.1.dcm</a></p>
         */
        @NameInMap("FloatingURL")
        public String floatingURL;

        public static RunCTRegistrationRequestFloatingList build(java.util.Map<String, ?> map) throws Exception {
            RunCTRegistrationRequestFloatingList self = new RunCTRegistrationRequestFloatingList();
            return TeaModel.build(map, self);
        }

        public RunCTRegistrationRequestFloatingList setFloatingURL(String floatingURL) {
            this.floatingURL = floatingURL;
            return this;
        }
        public String getFloatingURL() {
            return this.floatingURL;
        }

    }

    public static class RunCTRegistrationRequestReferenceList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/ref/33_P18.4.1.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/ref/33_P18.4.1.dcm</a></p>
         */
        @NameInMap("ReferenceURL")
        public String referenceURL;

        public static RunCTRegistrationRequestReferenceList build(java.util.Map<String, ?> map) throws Exception {
            RunCTRegistrationRequestReferenceList self = new RunCTRegistrationRequestReferenceList();
            return TeaModel.build(map, self);
        }

        public RunCTRegistrationRequestReferenceList setReferenceURL(String referenceURL) {
            this.referenceURL = referenceURL;
            return this;
        }
        public String getReferenceURL() {
            return this.referenceURL;
        }

    }

}
