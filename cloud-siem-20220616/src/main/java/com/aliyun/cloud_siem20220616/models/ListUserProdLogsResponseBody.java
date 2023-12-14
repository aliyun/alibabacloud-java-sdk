// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUserProdLogsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUserProdLogsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserProdLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProdLogsResponseBody self = new ListUserProdLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProdLogsResponseBody setData(java.util.List<ListUserProdLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserProdLogsResponseBodyData> getData() {
        return this.data;
    }

    public ListUserProdLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserProdLogsResponseBodyData extends TeaModel {
        @NameInMap("DisplayLine")
        public String displayLine;

        @NameInMap("Displayed")
        public Boolean displayed;

        @NameInMap("Imported")
        public Boolean imported;

        @NameInMap("IsDeleted")
        public Integer isDeleted;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("SourceLogCode")
        public String sourceLogCode;

        @NameInMap("SourceLogInfo")
        public String sourceLogInfo;

        @NameInMap("SourceProdCode")
        public String sourceProdCode;

        @NameInMap("SubUserId")
        public Long subUserId;

        @NameInMap("SubUserName")
        public String subUserName;

        public static ListUserProdLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserProdLogsResponseBodyData self = new ListUserProdLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserProdLogsResponseBodyData setDisplayLine(String displayLine) {
            this.displayLine = displayLine;
            return this;
        }
        public String getDisplayLine() {
            return this.displayLine;
        }

        public ListUserProdLogsResponseBodyData setDisplayed(Boolean displayed) {
            this.displayed = displayed;
            return this;
        }
        public Boolean getDisplayed() {
            return this.displayed;
        }

        public ListUserProdLogsResponseBodyData setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public ListUserProdLogsResponseBodyData setIsDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        public ListUserProdLogsResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public ListUserProdLogsResponseBodyData setSourceLogCode(String sourceLogCode) {
            this.sourceLogCode = sourceLogCode;
            return this;
        }
        public String getSourceLogCode() {
            return this.sourceLogCode;
        }

        public ListUserProdLogsResponseBodyData setSourceLogInfo(String sourceLogInfo) {
            this.sourceLogInfo = sourceLogInfo;
            return this;
        }
        public String getSourceLogInfo() {
            return this.sourceLogInfo;
        }

        public ListUserProdLogsResponseBodyData setSourceProdCode(String sourceProdCode) {
            this.sourceProdCode = sourceProdCode;
            return this;
        }
        public String getSourceProdCode() {
            return this.sourceProdCode;
        }

        public ListUserProdLogsResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public ListUserProdLogsResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
