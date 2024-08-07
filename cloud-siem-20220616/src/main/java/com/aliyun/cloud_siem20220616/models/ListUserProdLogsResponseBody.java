// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUserProdLogsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListUserProdLogsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
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
        /**
         * <p>The display details of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai.siem-project.siem-logstore</p>
         */
        @NameInMap("DisplayLine")
        public String displayLine;

        /**
         * <p>Indicates whether the details of the added log are returned. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Displayed")
        public Boolean displayed;

        /**
         * <p>Indicates whether the log is added to the threat analysis feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Imported")
        public Boolean imported;

        /**
         * <p>Indicates whether the log is added to the threat analysis feature. Valid values:</p>
         * <ul>
         * <li>0: yes</li>
         * <li>1: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDeleted")
        public Integer isDeleted;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXXX</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The log code.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_proc</p>
         */
        @NameInMap("SourceLogCode")
        public String sourceLogCode;

        /**
         * <p>The details of the Logstore. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;wafnew-project-1335759343513432-cn-hangzhou&quot;,&quot;logStore&quot;:&quot;wafnew-logstore&quot;,&quot;regionCode&quot;:&quot;cn-hangzhou&quot;,&quot;prodCode&quot;:&quot;waf&quot;}</p>
         */
        @NameInMap("SourceLogInfo")
        public String sourceLogInfo;

        /**
         * <p>The code of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("SourceProdCode")
        public String sourceProdCode;

        /**
         * <p>The ID of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXX</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <p>The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_account_xxx</p>
         */
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
