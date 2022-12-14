// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationAdvanceRequest extends TeaModel {
    // DICOM。
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("FloatingList")
    public java.util.List<RunCTRegistrationAdvanceRequestFloatingList> floatingList;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

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
