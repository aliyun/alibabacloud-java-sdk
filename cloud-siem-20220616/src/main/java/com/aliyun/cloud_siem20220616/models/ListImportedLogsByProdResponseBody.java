// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListImportedLogsByProdResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListImportedLogsByProdResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImportedLogsByProdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImportedLogsByProdResponseBody self = new ListImportedLogsByProdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImportedLogsByProdResponseBody setData(java.util.List<ListImportedLogsByProdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListImportedLogsByProdResponseBodyData> getData() {
        return this.data;
    }

    public ListImportedLogsByProdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImportedLogsByProdResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the log is automatically added to the threat analysis feature within newly added accounts. Valid values:</p>
         * <br>
         * <p>*   1: yes</p>
         * <p>*   0: no</p>
         */
        @NameInMap("AutoImported")
        public Integer autoImported;

        /**
         * <p>The code of the cloud service provider. Valid values:</p>
         * <br>
         * <p>*   qcloud: Tencent Cloud</p>
         * <p>*   aliyun: Alibaba Cloud</p>
         * <p>*   hcloud: Huawei Cloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>Indicates whether the log is added to the threat analysis feature. Valid values:</p>
         * <br>
         * <p>*   1: yes</p>
         * <p>*   0: no</p>
         */
        @NameInMap("Imported")
        public Integer imported;

        /**
         * <p>The number of users who have added the log.</p>
         */
        @NameInMap("ImportedUserCount")
        public Integer importedUserCount;

        /**
         * <p>The log code.</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>The display log code.</p>
         */
        @NameInMap("LogMdsCode")
        public String logMdsCode;

        @NameInMap("LogType")
        public Integer logType;

        /**
         * <p>The time when the log was last added.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The code of the cloud service to which the log belongs.</p>
         */
        @NameInMap("ProdCode")
        public String prodCode;

        /**
         * <p>The total number of users who have the log.</p>
         */
        @NameInMap("TotalUserCount")
        public Integer totalUserCount;

        /**
         * <p>The number of users who have not added the log.</p>
         */
        @NameInMap("UnImportedUserCount")
        public Integer unImportedUserCount;

        public static ListImportedLogsByProdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImportedLogsByProdResponseBodyData self = new ListImportedLogsByProdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImportedLogsByProdResponseBodyData setAutoImported(Integer autoImported) {
            this.autoImported = autoImported;
            return this;
        }
        public Integer getAutoImported() {
            return this.autoImported;
        }

        public ListImportedLogsByProdResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListImportedLogsByProdResponseBodyData setImported(Integer imported) {
            this.imported = imported;
            return this;
        }
        public Integer getImported() {
            return this.imported;
        }

        public ListImportedLogsByProdResponseBodyData setImportedUserCount(Integer importedUserCount) {
            this.importedUserCount = importedUserCount;
            return this;
        }
        public Integer getImportedUserCount() {
            return this.importedUserCount;
        }

        public ListImportedLogsByProdResponseBodyData setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public ListImportedLogsByProdResponseBodyData setLogMdsCode(String logMdsCode) {
            this.logMdsCode = logMdsCode;
            return this;
        }
        public String getLogMdsCode() {
            return this.logMdsCode;
        }

        public ListImportedLogsByProdResponseBodyData setLogType(Integer logType) {
            this.logType = logType;
            return this;
        }
        public Integer getLogType() {
            return this.logType;
        }

        public ListImportedLogsByProdResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListImportedLogsByProdResponseBodyData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public ListImportedLogsByProdResponseBodyData setTotalUserCount(Integer totalUserCount) {
            this.totalUserCount = totalUserCount;
            return this;
        }
        public Integer getTotalUserCount() {
            return this.totalUserCount;
        }

        public ListImportedLogsByProdResponseBodyData setUnImportedUserCount(Integer unImportedUserCount) {
            this.unImportedUserCount = unImportedUserCount;
            return this;
        }
        public Integer getUnImportedUserCount() {
            return this.unImportedUserCount;
        }

    }

}
