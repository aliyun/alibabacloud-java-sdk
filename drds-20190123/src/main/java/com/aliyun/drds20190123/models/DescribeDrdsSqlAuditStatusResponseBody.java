// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSqlAuditStatusResponseBody extends TeaModel {
    /**
     * <p>The returned data set.</p>
     */
    @NameInMap("Data")
    public DescribeDrdsSqlAuditStatusResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsSqlAuditStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSqlAuditStatusResponseBody self = new DescribeDrdsSqlAuditStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSqlAuditStatusResponseBody setData(DescribeDrdsSqlAuditStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsSqlAuditStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsSqlAuditStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsSqlAuditStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsSqlAuditStatusResponseBodyDataData extends TeaModel {
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Indicates whether the complete report of the SQL audit is supported. Valid values: true and false.</p>
         */
        @NameInMap("Detailed")
        public String detailed;

        /**
         * <p>Indicates whether the SQL audit feature is enabled for the database. Valid values: true and false.</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The UID of the external delivery.</p>
         * <br>
         * <p>> This parameter is returned only if external log delivery is enabled.</p>
         */
        @NameInMap("ExtraAliUid")
        public Long extraAliUid;

        /**
         * <p>The Log Service Logstore from which logs are delivered.</p>
         * <br>
         * <p>> This parameter is returned only if external log delivery is enabled.</p>
         */
        @NameInMap("ExtraSlsLogStore")
        public String extraSlsLogStore;

        /**
         * <p>The Log Service project from which logs are delivered.</p>
         * <br>
         * <p>> This parameter is returned only if external log delivery is enabled.</p>
         */
        @NameInMap("ExtraSlsProject")
        public String extraSlsProject;

        /**
         * <p>Indicates whether external log delivery is enabled. Valid values: true and false.</p>
         */
        @NameInMap("ExtraWriteEnabled")
        public Boolean extraWriteEnabled;

        public static DescribeDrdsSqlAuditStatusResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSqlAuditStatusResponseBodyDataData self = new DescribeDrdsSqlAuditStatusResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSqlAuditStatusResponseBodyDataData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsSqlAuditStatusResponseBodyDataData setDetailed(String detailed) {
            this.detailed = detailed;
            return this;
        }
        public String getDetailed() {
            return this.detailed;
        }

        public DescribeDrdsSqlAuditStatusResponseBodyDataData setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeDrdsSqlAuditStatusResponseBodyDataData setExtraAliUid(Long extraAliUid) {
            this.extraAliUid = extraAliUid;
            return this;
        }
        public Long getExtraAliUid() {
            return this.extraAliUid;
        }

        public DescribeDrdsSqlAuditStatusResponseBodyDataData setExtraSlsLogStore(String extraSlsLogStore) {
            this.extraSlsLogStore = extraSlsLogStore;
            return this;
        }
        public String getExtraSlsLogStore() {
            return this.extraSlsLogStore;
        }

        public DescribeDrdsSqlAuditStatusResponseBodyDataData setExtraSlsProject(String extraSlsProject) {
            this.extraSlsProject = extraSlsProject;
            return this;
        }
        public String getExtraSlsProject() {
            return this.extraSlsProject;
        }

        public DescribeDrdsSqlAuditStatusResponseBodyDataData setExtraWriteEnabled(Boolean extraWriteEnabled) {
            this.extraWriteEnabled = extraWriteEnabled;
            return this;
        }
        public Boolean getExtraWriteEnabled() {
            return this.extraWriteEnabled;
        }

    }

    public static class DescribeDrdsSqlAuditStatusResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeDrdsSqlAuditStatusResponseBodyDataData> data;

        public static DescribeDrdsSqlAuditStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSqlAuditStatusResponseBodyData self = new DescribeDrdsSqlAuditStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSqlAuditStatusResponseBodyData setData(java.util.List<DescribeDrdsSqlAuditStatusResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeDrdsSqlAuditStatusResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
