// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationRequest extends TeaModel {
    @NameInMap("ReferenceList")
    @Validation(required = true)
    public java.util.List<RunCTRegistrationRequestReferenceList> referenceList;

    @NameInMap("DataFormat")
    @Validation(required = true)
    public String dataFormat;

    @NameInMap("OrgName")
    @Validation(required = true)
    public String orgName;

    @NameInMap("OrgId")
    @Validation(required = true)
    public String orgId;

    @NameInMap("DataSourceType")
    @Validation(required = true)
    public String dataSourceType;

    @NameInMap("FloatingList")
    @Validation(required = true)
    public java.util.List<RunCTRegistrationRequestFloatingList> floatingList;

    public static RunCTRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCTRegistrationRequest self = new RunCTRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public RunCTRegistrationRequest setReferenceList(java.util.List<RunCTRegistrationRequestReferenceList> referenceList) {
        this.referenceList = referenceList;
        return this;
    }
    public java.util.List<RunCTRegistrationRequestReferenceList> getReferenceList() {
        return this.referenceList;
    }

    public RunCTRegistrationRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public RunCTRegistrationRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RunCTRegistrationRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
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

    public static class RunCTRegistrationRequestReferenceList extends TeaModel {
        @NameInMap("ReferenceURL")
        @Validation(required = true)
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

    public static class RunCTRegistrationRequestFloatingList extends TeaModel {
        @NameInMap("FloatingURL")
        @Validation(required = true)
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

}
