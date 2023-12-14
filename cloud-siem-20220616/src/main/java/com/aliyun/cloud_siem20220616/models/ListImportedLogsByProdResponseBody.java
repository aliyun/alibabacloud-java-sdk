// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListImportedLogsByProdResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListImportedLogsByProdResponseBodyData> data;

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
        @NameInMap("AutoImported")
        public Integer autoImported;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("Imported")
        public Integer imported;

        @NameInMap("ImportedUserCount")
        public Integer importedUserCount;

        @NameInMap("LogCode")
        public String logCode;

        @NameInMap("LogMdsCode")
        public String logMdsCode;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("TotalUserCount")
        public Integer totalUserCount;

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
