// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationAdvanceRequest extends TeaModel {
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
    public java.util.List<RunCTRegistrationAdvanceRequestFloatingList> floatingList;

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
    public java.util.List<RunCTRegistrationAdvanceRequestReferenceList> referenceList;

    public static RunCTRegistrationAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCTRegistrationAdvanceRequest self = new RunCTRegistrationAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RunCTRegistrationAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public RunCTRegistrationAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public RunCTRegistrationAdvanceRequest setFloatingList(java.util.List<RunCTRegistrationAdvanceRequestFloatingList> floatingList) {
        this.floatingList = floatingList;
        return this;
    }
    public java.util.List<RunCTRegistrationAdvanceRequestFloatingList> getFloatingList() {
        return this.floatingList;
    }

    public RunCTRegistrationAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public RunCTRegistrationAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RunCTRegistrationAdvanceRequest setReferenceList(java.util.List<RunCTRegistrationAdvanceRequestReferenceList> referenceList) {
        this.referenceList = referenceList;
        return this;
    }
    public java.util.List<RunCTRegistrationAdvanceRequestReferenceList> getReferenceList() {
        return this.referenceList;
    }

    public static class RunCTRegistrationAdvanceRequestFloatingList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/flt/34_P18.4.1.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/flt/34_P18.4.1.dcm</a></p>
         */
        @NameInMap("FloatingURL")
        public java.io.InputStream floatingURLObject;

        public static RunCTRegistrationAdvanceRequestFloatingList build(java.util.Map<String, ?> map) throws Exception {
            RunCTRegistrationAdvanceRequestFloatingList self = new RunCTRegistrationAdvanceRequestFloatingList();
            return TeaModel.build(map, self);
        }

        public RunCTRegistrationAdvanceRequestFloatingList setFloatingURLObject(java.io.InputStream floatingURLObject) {
            this.floatingURLObject = floatingURLObject;
            return this;
        }
        public java.io.InputStream getFloatingURLObject() {
            return this.floatingURLObject;
        }

    }

    public static class RunCTRegistrationAdvanceRequestReferenceList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/ref/33_P18.4.1.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/registration/ref/33_P18.4.1.dcm</a></p>
         */
        @NameInMap("ReferenceURL")
        public java.io.InputStream referenceURLObject;

        public static RunCTRegistrationAdvanceRequestReferenceList build(java.util.Map<String, ?> map) throws Exception {
            RunCTRegistrationAdvanceRequestReferenceList self = new RunCTRegistrationAdvanceRequestReferenceList();
            return TeaModel.build(map, self);
        }

        public RunCTRegistrationAdvanceRequestReferenceList setReferenceURLObject(java.io.InputStream referenceURLObject) {
            this.referenceURLObject = referenceURLObject;
            return this;
        }
        public java.io.InputStream getReferenceURLObject() {
            return this.referenceURLObject;
        }

    }

}
