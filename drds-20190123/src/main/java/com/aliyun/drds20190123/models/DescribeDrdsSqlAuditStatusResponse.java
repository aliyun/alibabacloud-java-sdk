// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSqlAuditStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeDrdsSqlAuditStatusResponseData data;

    public static DescribeDrdsSqlAuditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSqlAuditStatusResponse self = new DescribeDrdsSqlAuditStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSqlAuditStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsSqlAuditStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsSqlAuditStatusResponse setData(DescribeDrdsSqlAuditStatusResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsSqlAuditStatusResponseData getData() {
        return this.data;
    }

    public static class DescribeDrdsSqlAuditStatusResponseDataData extends TeaModel {
        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("Enabled")
        @Validation(required = true)
        public String enabled;

        @NameInMap("Detailed")
        @Validation(required = true)
        public String detailed;

        @NameInMap("ExtraWriteEnabled")
        @Validation(required = true)
        public Boolean extraWriteEnabled;

        @NameInMap("ExtraAliUid")
        @Validation(required = true)
        public Long extraAliUid;

        @NameInMap("ExtraSlsProject")
        @Validation(required = true)
        public String extraSlsProject;

        @NameInMap("ExtraSlsLogStore")
        @Validation(required = true)
        public String extraSlsLogStore;

        public static DescribeDrdsSqlAuditStatusResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSqlAuditStatusResponseDataData self = new DescribeDrdsSqlAuditStatusResponseDataData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSqlAuditStatusResponseDataData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsSqlAuditStatusResponseDataData setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeDrdsSqlAuditStatusResponseDataData setDetailed(String detailed) {
            this.detailed = detailed;
            return this;
        }
        public String getDetailed() {
            return this.detailed;
        }

        public DescribeDrdsSqlAuditStatusResponseDataData setExtraWriteEnabled(Boolean extraWriteEnabled) {
            this.extraWriteEnabled = extraWriteEnabled;
            return this;
        }
        public Boolean getExtraWriteEnabled() {
            return this.extraWriteEnabled;
        }

        public DescribeDrdsSqlAuditStatusResponseDataData setExtraAliUid(Long extraAliUid) {
            this.extraAliUid = extraAliUid;
            return this;
        }
        public Long getExtraAliUid() {
            return this.extraAliUid;
        }

        public DescribeDrdsSqlAuditStatusResponseDataData setExtraSlsProject(String extraSlsProject) {
            this.extraSlsProject = extraSlsProject;
            return this;
        }
        public String getExtraSlsProject() {
            return this.extraSlsProject;
        }

        public DescribeDrdsSqlAuditStatusResponseDataData setExtraSlsLogStore(String extraSlsLogStore) {
            this.extraSlsLogStore = extraSlsLogStore;
            return this;
        }
        public String getExtraSlsLogStore() {
            return this.extraSlsLogStore;
        }

    }

    public static class DescribeDrdsSqlAuditStatusResponseData extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public java.util.List<DescribeDrdsSqlAuditStatusResponseDataData> data;

        public static DescribeDrdsSqlAuditStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSqlAuditStatusResponseData self = new DescribeDrdsSqlAuditStatusResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSqlAuditStatusResponseData setData(java.util.List<DescribeDrdsSqlAuditStatusResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeDrdsSqlAuditStatusResponseDataData> getData() {
            return this.data;
        }

    }

}
